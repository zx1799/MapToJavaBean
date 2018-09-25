作业2：利用反射，完成地图和的JavaBean的相互转化

反射：就是通过类文件对象，去使用该文件中的成员变量，构造方法，成员方法。

类别：成员变量：Field构造方法：构造成员方法：方法

public interface BeanInfo：使用BeanInfo界面创建一个BeanInfo类，并提供关于bean的方法，属性，事件和其他功能的显示信息.Introspector类提供了一种标准的工具来了解目标Java Bean支持的属性，事件和方法。

public static BeanInfo getBeanInfo（class <？> beanClass）throws IntrospectionException：内省Java Bean并了解其所有属性，暴露的方法和事件。

PropertyDescriptor描述了Java Bean通过一对访问器方法导出的一个属性。
