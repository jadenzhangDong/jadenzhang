package com.example.demo.spring;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class ObjectTest extends fatherObject implements brotherObject{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);



    }
    public void test(){
        String s = new String();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        new HashMap<String, Object>();
        ArrayList<String> strings = new ArrayList<>();
        Collections.sort(strings);
        Arrays.sort(strings.toArray());

        idea:for (String string: strings) {
            if(true){
                break idea;
            }
        }

        Byte byt1e = '2';

    }
    public void test(String s){

    }


    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        TestController testController = new TestController();
        Class clazz1 = testController.getClass();
        Class clazz2 = TestController.class;
        Constructor declaredConstructor = clazz2.getDeclaredConstructor();
        System.out.println(declaredConstructor);
        Class<?> clazz3 = Class.forName("com.example.demo.spring.TestController");
        Object o = clazz3.newInstance();
        System.out.println(o);
    }

    @Override
    public void test1() {

    }
}
abstract class fatherObject{
    abstract void test1();
}
interface brotherObject{
    void test1();
}
interface sisterObject{
    void test1();
}
