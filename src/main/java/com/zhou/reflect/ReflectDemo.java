package com.zhou.reflect;

import java.lang.reflect.Method;

/**
 * @Author: zhou.liu
 * @Date: 2022/4/21 15:39
 * @Description:
 */
public class ReflectDemo {

    public void showClassInfo(Object obj){

        Method[] methods = obj.getClass().getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.getName());
            try {
                Object result = method.invoke(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
