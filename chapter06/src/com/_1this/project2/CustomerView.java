package com._1this.project2;

/**
 * ClassName:CustomerView
 * Description:CustomerView为主模块，负责菜单的显示和处理用户操作
 *
 * @Author ZY
 * @Create 2023/9/5 11:06
 * @Version 1.0
 */
public class CustomerView {
    // 生成长度为10的数组存储客户对象
    CustomerList customerList = new CustomerList(10);

    /**
     * 进入主界面的方法
     */
    public void enterMainMenu() {

        boolean isFlag = true;
        while (isFlag) {
            // 登录界面
            System.out.println("----------拼电商客户管理系统----------");
            System.out.println("\t\t\t1.添加客户");
            System.out.println("\t\t\t2.修改客户");
            System.out.println("\t\t\t3.删除客户");
            System.out.println("\t\t\t4.客户列表");
            System.out.println("\t\t\t5.退出");
            System.out.print("请选择(1-5):");
            // 选择选项
            char selection = CMUtility.readMenuSelection();
            switch (selection) {
                case '1' -> addNewCustomer();
                case '2' -> modifyCustomer();
                case '3' -> deleteCustomer();
                case '4' -> listAllCustomers();
                case '5' -> {
                    System.out.print("是否确认退出(Y/N):");
                    char input = CMUtility.readConfirmSelection();
                    if (input == 'Y') {
                        System.out.println("退出成功！");
                        isFlag = false;
                    }
                }
            }
        }
    }

    private void addNewCustomer() {
        System.out.println("----------添加客户信息----------");
        // 录入客户信息
        System.out.print("姓名:");
        String name = CMUtility.readString(4);
        System.out.print("性别:");
        char gender = CMUtility.readChar();
        System.out.print("年龄:");
        int age = CMUtility.readInt();
        System.out.print("电话:");
        String phoneNumber = CMUtility.readString(12);
        System.out.print("邮箱:");
        String email = CMUtility.readString(50);

        // 生成新用户存储添加的信息
        Customer customer = new Customer(name, gender, age, phoneNumber, email);
        boolean flag = customerList.addCustomer(customer);
        if (flag) {
            System.out.println("添加成功！");
        } else {
            System.out.println("可添加长度已满，添加失败！");
        }
    }

    /**
     * 修改客户信息
     */
    private void modifyCustomer() {
        System.out.println("----------修改客户信息----------");
        while (true) {
            // 客户列表为空
            if (customerList.getTotal() == 0) {
                System.out.println("客户列表为空！");
                break;
            }
            // 输入需要修改的客户序号
            System.out.println("请输入需要修改的客户序号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            // 修改客户信息
            if (customerList.getCustomer(index - 1) == null) {
                System.out.println("所要修改的客户不存在！");
                break;
            } else {
                System.out.print("姓名(" + customerList.getCustomer(index - 1).getName() + "):");
                String name = CMUtility.readString(4, customerList.getCustomer(index - 1).getName());
                System.out.print("性别(" + customerList.getCustomer(index - 1).getGender() + "):");
                char gender = CMUtility.readChar(customerList.getCustomer(index - 1).getGender());
                System.out.print("年龄(" + customerList.getCustomer(index - 1).getAge() + "):");
                int age = CMUtility.readInt(customerList.getCustomer(index - 1).getAge());
                System.out.print("电话(" + customerList.getCustomer(index - 1).getPhoneNumber() + "):");
                String phoneNumber = CMUtility.readString(12, customerList.getCustomer(index - 1).getPhoneNumber());
                System.out.print("邮箱(" + customerList.getCustomer(index - 1).getEmail() + "):");
                String email = CMUtility.readString(50, customerList.getCustomer(index - 1).getEmail());

                // 生成新的客户信息接收修改后的信息
                Customer customer = new Customer(name, gender, age, phoneNumber, email);
                boolean flag = customerList.replaceCustomer(index - 1, customer);
                if (flag) {
                    System.out.println("修改成功！");
                    break;
                } else {
                    System.out.println("输入错误或存储长度不足，修改失败！");
                    break;
                }
            }
        }
    }

    /**
     * 删除客户数据
     */
    private void deleteCustomer() {
        System.out.println("----------删除客户信息----------");
        while (true) {
            // 存储列表为空
            if (customerList.getTotal() == 0) {
                System.out.println("客户列表为空！");
                return;
            }

            //输入需要删除的客户序号
            System.out.print("输入需要删除的客户序号(-1退出)：");
            int index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            // 删除客户数据
            if (customerList.getCustomer(index - 1) == null) {
                System.out.println("删除的用户不存在！");
                return;
            }

            // 确认是否删除
            System.out.print("确认是否删除(Y/N):");
            char input = CMUtility.readConfirmSelection();
            if (input == 'N') {
                return;
            }
            boolean flag = customerList.deleteCustomer(index - 1);
            if (flag) {
                System.out.println("删除完成！");
            } else {
                System.out.println("无法找到指定客户，删除失败！");
            }
        }
    }


    private void listAllCustomers() {
        System.out.println("----------查看客户信息----------");
        System.out.println("序号\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
        if (customerList.getTotal() == 0) {
            System.out.println("未添加客户！");
        } else {
            // 获取所有客户信息
            Customer[] custs = customerList.getAllCustomer();
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i + 1) + "\t" + custs[i].getInfo());
            }
        }
    }
    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
