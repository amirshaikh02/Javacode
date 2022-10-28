package com.fun;

class Student{
    int rollno;
    String name;

    public Student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }
    public Student(Student s1){
        this.rollno=s1.rollno;
        this.name=s1.name;
    }

    void display(){
        System.out.println("Rollno: "+rollno);
        System.out.println("Name : "+name);
    }

}

public class CopyConstructor {
    public static void main(String[] args) {
        Student s1=new Student(49,"rakesh");
        Student s2=new Student(s1);
        s1.display();
        s2.display();
    }
}
