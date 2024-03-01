package com.driver;

public class Teacher {

    private String name;

    private int numberOfStudents;

    private int age;

    public Teacher() {

    }
    public  void  setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public void setNumberOfStudents(int numberOfStudents){
        this.numberOfStudents=numberOfStudents;
    }
    public String getName(){
        return name;
    }

    public int getAge(int age){
        return age;
    }

   // public int getNumberOfStudents(int numberOfStudents){
      //  return numberOfStudents;
    //}
public int getNumberOfStudents(){
     return numberOfStudents;
   }
    public Teacher(String name,int numberOfStudents,int age){
        this.name=name;
        this.age=age;
        this.numberOfStudents=numberOfStudents;
    }


}