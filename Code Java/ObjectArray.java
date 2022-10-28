class Student{
    int rollno;
    String name;
    String Class;
    String branch;

    public Student(int rollno,String name,String Class,String branch){
            this.rollno=rollno;
            this.name=name;
            this.Class=Class;
            this.branch=branch;
    }
}
public class ObjectArray {
    public static void main(String[] args) {
        Student student[];
        student= new Student[5];
        student[0]=new Student(23,"Virat","SE","IT");
        student[1]=new Student(23,"Rohit","TE","ENTC");
        student[2]=new Student(23,"Pant","BE","CO");
        student[3]=new Student(23,"KL Rahul","FE","CIVIT");
        student[4]=new Student(23,"Shikhar","SE","IT");
  
    }
}
