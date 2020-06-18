package com.practice;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

  @Override
  public int compare(Student s1, Student s2) {
//    return s1.getName().compareTo(s2.getName());
	  return s1.getAge().compareTo(s2.getAge());
/*if(s1.getId()>s2.getId()) {
	return 1;
}else {
	return -1;
}*/
  }
}