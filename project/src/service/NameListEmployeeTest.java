package service;

import domain.Employee;
import domain.Programmer;
import domain.Status;
import org.junit.Test;

/**
 * ClassName:NameListEmployeeTest
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/19 12:50
 * @Version 1.0
 */
public class NameListEmployeeTest {
    @Test
    public void test1(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    @Test
    public void test2(){
        try {
            NameListService nameListService = new NameListService();
            System.out.println(nameListService.getEmployee(15));
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3(){
        try {
            NameListService nameListService = new NameListService();
            TeamService teamService = new TeamService();
            Programmer p  = (Programmer)nameListService.getEmployee(3);
            p.setStatus(Status.BUSY);

            teamService.addMember(nameListService.getEmployee(3));
            teamService.addMember(nameListService.getEmployee(6));
            teamService.addMember(nameListService.getEmployee(9));
            teamService.addMember(nameListService.getEmployee(8));
            teamService.addMember(nameListService.getEmployee(11));
            Programmer[] team = teamService.getTeam();
            for (int i = 0; i < team.length; i++) {
                System.out.println(team[i].getDetailsForTeam());
            }

        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}
