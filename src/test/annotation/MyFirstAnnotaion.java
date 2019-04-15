package demo.annotation;

/**
 * @description:自定义第一个注解
 * @author:yjc
 * @date:2019/4/12 16:25
 * @version:1.0
 */

public @interface MyFirstAnnotaion {

    /**
     * 我们自定义的注解是可以带成员变量的，定义带成员变量的注解叫做元数据Annotation
     * 在注解中定义成员变量，语法类似于声明方法一样
     *
     * 注意：在注解上定义的成员变量只能是String、数组、Class、枚举类、注解
     */
    String userName();
    int age();
}
