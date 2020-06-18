package com.practice;
public class Student implements Cloneable {
  private int id;

  private String name;
  
  private Integer age;
  
  @Override
	protected void finalize() throws Throwable {
	  count--;
	}
  
  public Object clone()throws CloneNotSupportedException{  
	return  super.clone();
  }
  public  static int count;
  
  {
	  count++;
  }
  

  public Integer getAge() {
	return age;
}

public void setAge(Integer age) {
	this.age = age;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}

}