package com.practice;

public class Main {
	public static void main(String[] args) throws CloneNotSupportedException {
/*		String str="12341511661";
		System.out.println(str.substring(0, 5));

		Map<Student, String> map = new HashMap<Student,String>();
		map.put( new Student(5, "A",25),"Santosh");
		map.put( new Student(4, "D",18),"Akash");
		map.put( new Student(10, "C",12),"Trushna");
		map.put( new Student(2, "B",10),"Rekha");
		Collection<Student> keys= map.keySet();
		System.out.println("NAME"+" ID"+" Age");
		for(Student key:keys) {
			System.out.println(key.getName()+"---"+key.getId()+"---"+key.getAge());
		}
		System.out.println("================");   
		TreeMap<Student,String> tm=new TreeMap<Student,String>(new MyComparator());
		tm.putAll(map);
		Collection<Student> keys1= tm.keySet();

		for(Student key1:keys1) {
			System.out.println(key1.getName()+"---"+key1.getId()+"---"+key1.getAge());
		}

*/

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		Student s5=new Student();
		Student s6=new Student();
		Student s7=new Student();
		Student s8=new Student();
		Student s9=new Student();
		s2=null;
		s4=null;
		s5=null;
		Student s10=(Student)s3.clone();
		System.gc();
		System.out.println(Student.count);
	}
}
