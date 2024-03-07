package com.driver;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {



    HashMap<String,Student> dbs=new HashMap<>();
    HashMap<String,Teacher> dbt=new HashMap<>();
    HashMap<String,List<String>> dbts=new HashMap<>();
    public String addStudent(Student student){
        String dbkey=student.getName();
        dbs.put(dbkey,student);
        return "studnt has been add to db";
    }

    public String addTeacher(Teacher teacher){
        String dbkey=teacher.getName();
        dbt.put(dbkey,teacher);
        return "teacher has been add to db";
    }

    public String addStudentTeacherPair(String teacher,String student ) {
        if (dbts.get(teacher) == null) {
            List<String> studlist = new ArrayList<>();
            studlist.add(student);
            dbts.put(teacher, studlist);

        } else {
            List<String> studlist = dbts.get(teacher);
            studlist.add(student);
            dbts.put(teacher, studlist);
        }
        return "student teacher added successfully";
    }

        public List<String> getAllStudent(){
            List<String> studentlist=new ArrayList<>();
            for(Student student:dbs.values()){
                studentlist.add(student.getName());
            }
            return studentlist;
        }
        public List<String> getAllTeacher(){
        List<String> teacherlist=new ArrayList<>();
        for(Teacher teacher:dbt.values()){
            teacherlist.add(teacher.getName());
        }
        return teacherlist;
    }
    public Student getStudentByName(String name){

        return dbs.get(name);

    }

    public Teacher getTeacherByName(String name){

      return dbt.get(name);
    }



    public List<String> getStudentsByTeacherName(String teacher){
        List<String> studbyteacher=new ArrayList<>();
        if(dbts.get(teacher)!=null){
            studbyteacher=dbts.get(teacher);
        }

        return studbyteacher;
    }

    public String deleteTeacherByName(String teacher){
        dbs.remove(teacher);

        return "deleted successfully";
    }



}
