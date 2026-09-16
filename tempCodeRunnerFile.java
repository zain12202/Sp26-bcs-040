public class Demo1{
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="John";
        s1.id=001; 
        s1.completedCredits=120;
        s2.name="Alice";
        s2.id=002;
        s2.completedCredits=90;
        s1.printsummary();
        s2.printsummary();
        
    }
}