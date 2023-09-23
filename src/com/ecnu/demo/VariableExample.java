package com.ecnu.demo;

public class VariableExample {

    // 成员变量
    private String name;
    private int age;
    // 定义一个字符型常量
    public static final char LETTER_A = 'A';
    // 定义一个字符串常量
    public static final String GREETING_MESSAGE = "Hello, world!";
    // 方法中的局部变量
    public void method() {
        int num1 = 10; // 栈中分配的局部变量
        String str = "Hello, world!"; // 栈中分配的局部变量
        System.out.println(num1);
        System.out.println(str);
    }

    // 静态局部变量
    public static void method2(int num2) {
        int sum = num2 + 10; // 栈中分配的局部变量
        System.out.println(sum);
    }

    // 构造方法中的局部变量
    public VariableExample(String name, int age) {
        this.name = name; // 对成员变量进行赋值
        this.age = age; // 对成员变量进行赋值
        int num3 = 20; // 栈中分配的局部变量
        String str2 = "Hello, " + this.name + "!"; // 栈中分配的局部变量
        System.out.println(num3);
        System.out.println(str2);
    }

    public static void main(String[] args) {
        VariableExample variableExample = new VariableExample();
        // 调用实例方法
        variableExample.method();
        // 调用静态方法
        VariableExample.method2(1);
    }

}

