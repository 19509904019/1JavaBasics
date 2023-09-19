package service;

import domain.*;

/**
 * ClassName:TeamService
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/19 13:42
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; //自动生成团队成员唯一ID
    private final int MAX_MEMBER = 5; // 开发团队最大成员数
    private Programmer[] team = new Programmer[MAX_MEMBER];  //存放团队各成员对象
    private int total; // 团队总人数

    /**
     * 返回当前团队的所有对象
     *
     * @return 包括所有成员对象的数组，数组大小与人员一致
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    /**
     * 向团队添加成员
     *
     * @param e 待添加的成员对象
     * @throws TeamException 添加失败的原因
     */
    public void addMember(Employee e) throws TeamException {
        // 成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }

        // 该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }

        //该员工已是某团队成员或正在休假，无法添加
        Status status = ((Programmer) e).getStatus();
        switch (status) {
            case BUSY -> throw new TeamException("该员工已是某团队成员");
            case VOCATION -> throw new TeamException("该员工正在休假，无法添加");
        }

        // 该成员已在本开发团队中
        for (int i = 0; i < total; i++) {
            if (e.getId() == team[i].getId()) {
                throw new TeamException("该员工已在本开发团队中");
            }
        }

        // 团队中至多只能有一名架构师、两名设计师、三名程序员
        int programmerNum = 0, designerNum = 0, architectNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                architectNum++;
            } else if (team[i] instanceof Designer) {
                designerNum++;
            } else {
                programmerNum++;
            }
        }

        if (e instanceof Architect) {
            if (architectNum >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (e instanceof Designer) {
            if (designerNum >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else {
            if (programmerNum >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
        }

        // 程序执行至此则添加成员,更改成员团队ID和工作状态
        team[total++] = (Programmer) e;
        ((Programmer) e).setMemberId(counter++);
        ((Programmer) e).setStatus(Status.BUSY);
    }

    /**
     * 从团队中删除成员
     *
     * @param memberId 待删除成员的memberId
     * @throws TeamException 删除失败的原因
     */
    public void removeMember(int memberId) throws TeamException {
        boolean isExsit = true;
        for (int i = 0; i < total; i++) {
            if (team[i].getMemberId() == memberId) {
                // 找到该员工
                team[i].setStatus(Status.FREE);
                isExsit = false;

                // 从开发团队中删除该员工
                for (int j = i; j < total - 1; j++) {
                    team[j] = team[j + 1];
                }
                team[--total] = null;
                break;
            }
        }
        // 找不到则抛出异常
        if (isExsit) {
            throw new TeamException("团队中找不到该成员");
        }
    }
}
