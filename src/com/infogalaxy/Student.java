package com.infogalaxy;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    int id ;
    String name ;
    void setStudent(){
        System.out.println("Enter The ID :");
        id = sc.nextInt();
        System.out.println("Enter The Name:");
        name = sc.next();
    }
    }
class Internal extends Student{
    int im1 ;
    int im2 ;
    void setInternal(){
        System.out.println("Enter The im1 Marks:");
        im1 = sc.nextInt();
        System.out.println("Enter The im2 Marks");
        im2 = sc.nextInt();
    }
    void getInternal(){
        System.out.println("Internal ID:"+id);
        System.out.println("Internal Name:"+name);
        System.out.println("im1 :"+im1);
        System.out.println("im2 :"+im2);
    }
}
class External extends Student{
    int em1;
    int em2;
       void setExternal(){
           System.out.println("Enter Em1 :");
           em1 = sc.nextInt();
           System.out.println("Enter EM2");
           em2 = sc.nextInt();
       }
       void getExternal(){
           System.out.println("Student External ID:"+id);
           System.out.println("Student External Name:"+name);
           System.out.println("Em1:"+em1);
           System.out.println("Em2:"+em2);
       }
}
class Main{
    public static void main(String[] args){
       Internal internal = new Internal();
       External external = new External();
       internal.setStudent();
       internal.setInternal();
       external.setStudent();
       external.setExternal();
       internal.getInternal();
       external.getExternal();

    }
}

