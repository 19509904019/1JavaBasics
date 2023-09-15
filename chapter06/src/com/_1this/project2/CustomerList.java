package com._1this.project2;

/**
 * ClassName:CustomerList
 * Description:CustomerList为Customer对象的管理模块，
 * 内部使用数组管理一组Customer对象
 *
 * @Author ZY
 * @Create 2023/9/4 20:22
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;  // 存储客户对象的数组
    private int total;  //客户对象的数量

    /**
     * 生成固定长的数组存储客户对象的信息
     *
     * @param numberOfCustomer 存储客户对象数组的长度
     */
    public CustomerList(int numberOfCustomer) {
        customers = new Customer[numberOfCustomer];
    }

    /**
     * 添加客户信息
     *
     * @param customer 添加客户的对象
     * @return 成功返回true，失败返回false
     */
    public boolean addCustomer(Customer customer) {
        if (total < customers.length) {
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 删除指定客户对象操作
     *
     * @param index 指向需要删除的对象
     * @return 成功返回true，失败返回false
     */
    public boolean deleteCustomer(int index) {
        if (index >= 0 && index < total) {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i + 1];
            }
            customers[--total] = null;  // 删除成功后将最后一个位置置空
            return true;
        }
        return false;
    }

    /**
     * 修改客户信息操作
     *
     * @param index    指定被修改的客户对象
     * @param customer 修改后的客户对象
     * @return 成功返回true，失败返回false
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index >= 0 && index < total) {
            customers[index] = customer;
            return true;
        }
        return false;
    }

    /**
     * 查询客户信息操作
     *
     * @param index 指定查询的客户对象
     * @return 返回客户对象
     */
    public Customer getCustomer(int index) {
        if (index >= 0 && index < total) {
            return customers[index];
        }
        return null;
    }

    /**
     * 获取所有客户信息
     *
     * @return 返回所有客户信息
     */
    public Customer[] getAllCustomer() {
        Customer[] custs = new Customer[total];

        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取客户数量操作
     *
     * @return 返回客户数量
     */
    public int getTotal() {
        return total;
    }


}
