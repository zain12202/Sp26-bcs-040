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

        System.out.println("\nafter changing student 1 name and credits");
        s1.name="Zain";
        s1.completedCredits=130;   
        s1.printsummary();
        System.out.println("\nafter changing student 1 name and credits");
        System.out.println("Student 1 credits after adding 10 credits: " + s1.addCredits(13));
        System.out.println("Student 2 credits after adding 10 credits: " + s2.addCredits(10));
    }

}