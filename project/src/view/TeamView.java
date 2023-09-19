package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

/**
 * ClassName:TeamView
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/19 16:34
 * @Version 1.0
 */
public class TeamView {
    private NameListService nameListService = new NameListService();
    private TeamService teamService = new TeamService();

    /**
     * 主界面显式及控制方法
     */
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("------------------优尚开发团队调度系统------------------");
            System.out.println("\t\t1.员工列表");
            System.out.println("\t\t2.团队列表");
            System.out.println("\t\t3.添加团队成员");
            System.out.println("\t\t4.删除团队成员");
            System.out.println("\t\t5.退出");
            System.out.print("请选择(1-5):");
            char menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1' -> listAllEmployees();
                case '2' -> getTeam();
                case '3' -> addMember();
                case '4' -> deleteMember();
                case '5' -> {
                    System.out.print("是否确认退出(Y/N)：");
                    char isQuit = TSUtility.readConfirmSelection();
                    if (isQuit == 'Y') {
                        isFlag = false;
                        System.out.println("退出成功！");
                    }
                }
            }
        }
    }

    /**
     * 以表格形式列出公司所有成员
     */
    private void listAllEmployees() {
        System.out.println("----------------全体员工列表------------------------");
        Employee[] employees = nameListService.getAllEmployees();
        if (employees.length == 0) {
            System.out.println("员工列表为空...");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
            System.out.println("----------------------------------------------------");
        }
    }

    /**
     * 显式团队成员列表操作
     */
    private void getTeam() {
        System.out.println("------------------团队成员列表------------------");
        Programmer[] team = teamService.getTeam();
        if (team.length == 0) {
            System.out.println("团队成员列表为空...");
            System.out.println("----------------------------------------------------");
        } else {
            System.out.println("TDI/ID\t姓名\t年龄\t工资\t职位\t奖金\t股票");
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }
            System.out.println("----------------------------------------------------");
        }
    }

    /**
     * 实现添加成员操作
     */
    private void addMember() {
        System.out.println("------------------添加成员------------------");
        System.out.print("请输入需要添加的成员ID:");
        int id = TSUtility.readInt();
        try {
            teamService.addMember(nameListService.getEmployee(id));
            System.out.println("添加成功!");
        } catch (TeamException e) {
            System.out.println("添加失败，" + e.getMessage());
        }

        // 按回车键继续
        TSUtility.readReturn();
    }

    /**
     * 实现删除成员操作
     */
    private void deleteMember() {
        System.out.println("------------------删除成员------------------");
        System.out.print("请输入要删除员工的TID：");
        int memberId = TSUtility.readInt();
        System.out.print("确认是否删除(Y/N)?");
        char delOrNot = TSUtility.readConfirmSelection();
        if (delOrNot == 'Y') {
            try {
                teamService.removeMember(memberId);
                System.out.println("删除成功！");
            } catch (TeamException e) {
                System.out.println("删除失败，" + e.getMessage());
            }
        }
        // 按回车键继续
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView teamView = new TeamView();
        teamView.enterMainMenu();
    }
}
