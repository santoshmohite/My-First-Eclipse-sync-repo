package com.test;
public class Test2{
public void methodOne(Animal a) {
System.out.println("Animal version");
}
public void methodOne(Monkey m) {
System.out.println("Monkey version");
}
public static void main(String[] args) {
Test2 t=new Test2();
Animal a=new Animal();
t.methodOne(a);//Animal version
Monkey m=new Monkey();
t.methodOne(m);//Monkey version
Animal a1=new Monkey();
t.methodOne(a1);//Animal version
t.methodOne(null);
}
}