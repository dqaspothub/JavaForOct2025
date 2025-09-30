package com.java.basic;

public class StudentInfo {

    String name = "Kannathasan";
    char initial = 'E';
    int rollNo = 31;
    static int age = 31;

    public static void markDetails(){
        int mathMark = 100;
        int phyMark = 100;
        int chemMark = 100;
        int total  = mathMark+phyMark+chemMark;
        System.out.println(total);
    }

    public static void main(String[] args) {

        StudentInfo.markDetails();
        System.out.println(age);

    }
}
