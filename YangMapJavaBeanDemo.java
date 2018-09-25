package com.zx1799.work1;

import java.util.Map;

public class YangMapJavaBeanDemo {
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setName("zx1799");
        p1.setAge(20);
        Map<String,Object> map = YangMapJavaBean.JavaBeanToMap(p1);
        System.out.println(map);

        Person p2 = new Person();
        YangMapJavaBean.mapToBean(map, p2);
        System.out.println(p2);
    }
}
