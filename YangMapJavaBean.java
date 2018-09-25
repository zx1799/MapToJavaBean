package com.zx1799.work1;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class YangMapJavaBean {
     /*
     map转换JavaBean
      */
     public static void mapToBean(Map<String,Object> map, Object obj){
         try {
             BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
             PropertyDescriptor[] propertyDescriptor = beanInfo.getPropertyDescriptors();
             for (PropertyDescriptor pro:propertyDescriptor){
                 String key = pro.getName();
                 if (map.containsKey(key)){
                     Object value = map.get(key);
                     Method method = pro.getWriteMethod();
                     method.invoke(obj,value);
                 }
             }
         }catch (Exception e){
             e.printStackTrace();
         }
     }

     /*
     javaBean转换map
      */
     public static Map<String,Object> JavaBeanToMap(Object obj){
         if (obj == null){
             return null;
         }
         Map<String,Object> map = new HashMap<>();
         try {
             BeanInfo beanInfo = Introspector.getBeanInfo(obj.getClass());
             PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
             for (PropertyDescriptor pro:propertyDescriptors){
                 String key = pro.getName();
                 if (!key.equals("class")){     //过滤class的属性
                     //得到property对应的getter方法
                     Method method = pro.getReadMethod();
                     Object value = method.invoke(obj);
                     map.put(key, value);
                 }
             }
         }catch (Exception e){
             e.printStackTrace();
         }
         return map;
     }
}
