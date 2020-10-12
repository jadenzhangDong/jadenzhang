package com.jadenzhang.springboottest.test.genericity;

public class ObjectTools<T> {
    private T obj;
    public T getObj(){
        return obj;
    }
    public void setObj(T obj){
        this.obj = obj;
    }

    public static void main(String[] args) {
        ObjectTools<String> tools = new ObjectTools<>();
        tools.setObj(new String("yiersansi"));
        String obj = tools.getObj();
        System.out.println(obj);

        ObjectTools<Integer> tool = new ObjectTools<>();
        tool.setObj(10);
        int objInteger = tool.getObj();
        System.out.println(objInteger);
    }
}
