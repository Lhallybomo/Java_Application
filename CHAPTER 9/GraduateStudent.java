
package chapter_9.inheritance;


public class GraduateStudent extends Student {
   
    String researchTopic;
    
    public GraduateStudent(String studentId,String name,int age,
            String gender,String researchTopic){
        super(studentId,name,age,gender);
        this.researchTopic = researchTopic;
    }
    
    
    public void coductResearch(){
        System.out.printf("%s is conducting a research on ",
                researchTopic);
    }
    @Override public void display(){
        super.display();
        System.out.printf("Research Topic: %s%n",researchTopic);
    }
    
}
