package com.test;
class Test1{
public void methodOne(int i) {
System.out.println("general method");
}
public void methodOne(int...i) {
System.out.println("var-arg method");
}
public static void main(String[] args) {
Test1 t=new Test1();
t.methodOne();//var-arg method
t.methodOne(10,20);//var-arg method
t.methodOne(10);//general method
t.methodOne(10,10,10,10,10);
}
}