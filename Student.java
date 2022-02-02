/*

Date: Jan 29th 2022

Author: Shubham Patel

This is comment.

*/

package Student;

public class Student{

   

    String studentId;

    private String studentName;

    private String address;

   

    public String getAddress() {

        return address;

    }

 

    public void setAddress(String address) {

        this.address = address;

    }

   

    public Student(String studentId,String studentName){

        this.studentId = studentId;

        this.studentName=studentName;               

    }

    public String getStudentId() {

        return studentId;

    }

    public void setStudentId(String studentId) {

        this.studentId = studentId;

    }

    public String getStudentName() {

        return studentName;

    }

 

    public void setStudentName(String studentName) {

        this.studentName = studentName;

    }

}