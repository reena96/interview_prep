package com.company.Casting;




class Student{
    public void computeGrade(){
        System.out.println("Grade in Student");
    }
}


    class GraduateStudent extends Student{
        public void computeGrade(){
            System.out.println("Grade in Graduate Student");
        }


    }

    class UnderGraduateStudent extends Student{
        public void computeGrade(){
            System.out.println("Grade in UnderGraduate Student");
        }
    }




public class TestCompute {
    public static void main(String args[]) {
        Student roster = new Student();
        roster = new GraduateStudent();
        roster.computeGrade();
        Student x2 = new Student();
        Student x = (Student)new GraduateStudent();// Also Upcasting
        Student x1 = new GraduateStudent();// Also Upcasting
        GraduateStudent y = (GraduateStudent)new Student(); // ClassCastException
        // if the runtime type of an object is a subtype of what you're trying to cast it into

    }
}