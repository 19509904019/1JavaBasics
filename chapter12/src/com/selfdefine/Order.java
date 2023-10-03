package com.selfdefine;

/**
 * ClassName: Order
 * Package: com.selfdefine
 * Description:
 *
 * @Create 2023/10/3 20:43
 */
public class Order<T>{
    // 声明了类的泛型参数以后，就可以在类的内部使用此泛型参数

    T t;
    int orderId;

    public Order(){}

    public Order(T t, int orderId){
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
}
