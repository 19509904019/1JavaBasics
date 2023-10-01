package com.map;

/**
 * ClassName:Product
 * Description:
 *
 * @Author ZY
 * @Create 2023/9/26 16:24
 * @Version 1.0
 */
public class Product implements Comparable {
    private String name;
    private double price;

    public Product() {
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "{商品名：" + name +
                        ", 价格：" + price + "}";
    }

    /**
     * 当前类需要实现Comparable中的抽象方法：compareTo(Object o)
     * 在此方法中，指明如何判断当前类的对象的大小。比如：按照价格的高低进行大小的比较
     *
     * @param o the object to be compared.
     * @return 如果返回值是正数，则当前对象大
     * 如果返回值是负数，则当前对象小
     * 如果返回值是0，则一样大
     */
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof Product p) {
            if (this.price == p.price) {
                return CharSequence.compare(this.name, p.name);
            }

            return Double.compare(this.price, p.price);
        }


        throw new RuntimeException("类型不匹配");
    }
}
