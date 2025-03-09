
package chapter_9.inheritance;


public class Student {
    String studentId;
    String name = "John";
    int age = 15;
    String gender = "M";
    
    public Student(String studentId,String name,int age,String gender){
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.gender= gender;
    }
    
    
    public void study(){
        System.out.printf("%s is the studying ", name);
    }
    public void display(){
        System.out.printf("Student ID is %s%n", studentId);
        System.out.printf("Student name is %s%n", name);
         System.out.printf("Student age is %d%n", age);
          System.out.printf("Student gender is %s%n", gender);
    }
}
