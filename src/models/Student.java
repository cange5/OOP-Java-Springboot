package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Student {
    String name;
    List<Integer> grades = new ArrayList<>();

    public Student (){
    }

    public Student (String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public void setGrades(List<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public float getAverageGrade(){
        int sum=0;
        float average=0;
        for (int grade: this.grades) {
            sum=sum+grade;
        }
        average= (float) sum /this.grades.size();
        return average;
    }

    public Student compareStudents(Map<String, Student> s){
        Student bestStudent = new Student();
        float average, max=0;
        for (Map.Entry<String, Student> ele: s.entrySet()) {
            average=ele.getValue().getAverageGrade();
            if(average>max){
                max=average;
                bestStudent = ele.getValue();
            }
        }

        return bestStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
