package com.amir;

public class Condition {
    public static void main(String[] args) {
  //        int salary=22300;
//        if (salary>30000)
//        {
//            salary=salary+5000;
//        }
//        else
//        {
//            salary=salary+3000;
//        }
//        System.out.println(salary);


        //MULTILPE IF-ELSE CONDITION
        int salary = 25400;

        if (salary<10000){
            salary+=3000;
        }else if (salary>20000){
            salary+=5000;
        }else {
            salary+=1000;
        }
        System.out.println(salary);
//        int n=3;
//        if(n>0){
//            System.out.println("more");
//        }
//        else {
//            System.out.println("less");
//        }


    }
}
