package com.haidai.entity;
//创建枚举类
public enum MyColor{
    RED("红色",1),YELLOW("黄色",2),GREEN("绿色",3);
    private String name;
    private int index;

    MyColor() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    MyColor(String name, int index) {
        this.name = name;
        this.index = index;
    }

    @Override
    public String toString() {
        return "MyColor{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }
}
//创建测试类
class Test{
    public static void main(String[] args) {
        for (MyColor value : MyColor.values()) { //values（）返回的是个对象数组
            System.out.println(value.getName() +"--->"+value.getIndex());
        }
    }
}
/* 运行结果
红色--->1
黄色--->2
绿色--->3
 */



