package ex_32_Collection_Framework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab253_Al_Students {
    public static void main(String[] args) {
        Student student1 = new Student("amit", "22");
        Student student2 = new Student("lucky","23");
        Student student3 = new Student("rohit", "25");

        List myClassData = new ArrayList<>();
        myClassData.add(student1);
        myClassData.add(student2);
        myClassData.add(student3);
        System.out.println(myClassData);

        student1.printDetails();
        student2.printDetails();
    }
}


class Student{
    private String name;
    private String rollNo;

    public Student(String name, String rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void printDetails(){
        System.out.println("Student Name : " + this.name);
        System.out.println("Student Roll No: " + this.rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';    }
}