package com.zhou.reflect.entity;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/21 15:48
 * @Description:
 */
@Resource
public class Computer implements Serializable {
    @Resource
    private String brand;

    public double price;

    private String color;

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public Computer(String brand, double price, String color) {
        super();
        this.brand = brand;
        this.price = price;
        this.color = color;
        System.out.println("有参构造");
    }

    public Computer() {
        super();
        System.out.println("无参构造");
    }

    public void showInfo(){
        System.out.println(this.toString());
    }

}