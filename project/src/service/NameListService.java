package service;

import domain.*;

import javax.sound.sampled.Port;

import static service.Data.*;

/**
 * ClassName: NameListService
 * Package: service
 * Description:负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 *
 * @Create 2023/9/16 15:45
 */

/*
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同对象，包括Employee、Programmer、Designer和Architect对象，
 *   以及相关联的Equipment子类的对象
 * Data类位于service包中
 * */
public class NameListService {
    private Employee[] employees;

    public NameListService() {

    }

    public Employee[] getAllEmployees() {
        return null;
    }

    public Employee getEmploy(int id) {
        return null;
    }
}
