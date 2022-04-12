package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id ;
    String name ;
    void setStudent(){
        //  System.out.println("Enter The ");
        System.out.println("Enter The ID And NAME :");
        id = sc.nextInt();
        name = sc.next();
    }
}
class Internal extends Student{
    int m1 ;
    int m2 ;
    void setMarks(){
        System.out.println("Enter Marks M1 And M2:");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
    }
}

