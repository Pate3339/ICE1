/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Name: Shubham Mehulkumar Patel
 * 
 * ID:991065005
 */
package StudentList;

 

import Student.Student;

 

public class StudentList {

    public static void main(String[] args){

        Student[] StudentList = new Student[3];

        StudentList[0] = new Student("1","Ronak Sheth");

        StudentList[1] = new Student("2","John Doe");

        StudentList[2] = new Student("3","abc");

       

        for(int  i = 0;i<studentList.length;i++){

            System.out.println(studentList[i].getStudentName());

        }

       

    }

}