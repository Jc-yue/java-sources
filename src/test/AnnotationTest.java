package test;

/**
 * @description:TODO
 * @author:yjc
 * @date:2019/4/12 16:33
 * @version:1.0
 */

public class AnnotationTest {

    public static void main(String[] args) {
        add("", 2);



    }


    @demo.annotation.MyFirstAnnotaion(userName = "yjc",age = 25)
    public static void add(String userName,int age) {
        System.out.println("userName:" + userName + "       age:" + age);
    }

}
