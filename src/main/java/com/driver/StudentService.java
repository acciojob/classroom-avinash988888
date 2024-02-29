package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentRepository repoObj;

    public String addStudent(Student student) {
        String res = repoObj.addStudent(student);
        return res;
    }
    public String addTeacher(Teacher teacher){
        String res=repoObj.addTeacher(teacher);
        return res;
    }

    public String addStudentTeacherPair(String student,String teacher){
        String res= repoObj.addStudentTeacherPair(student,teacher);
        return res;
    }

    public Student getStudentByName(String name){

      return repoObj.getStudentByName(name);
    }

    public Teacher getTeacherByName(String name){
       return repoObj.getTeacherByName(name);
    }

    public List<String> getStudentsByTeacherName(String teacher){
        return repoObj.getStudentsByTeacherName(teacher);
    }
    public String deleteAllTeachers(){
       repoObj.deleteAllTeachers();
       return "deleted successfully";
    }

    public List<String> getAllStudent(){

        return repoObj.getAllStudent();
    }

}
