public class Demo2{
    public static void main(String args[]){
        Student a = new Student();
         a.name = "Ali";
         Student b = a;
         b.name = "Sara";
         Student c = new Student();
         c.name = a.name;
         System.out.println("Student a name: " + a.name);
         System.out.println("Student b name: " + b.name);
         System.out.println("Student c name: " + c.name);
         if(a==b){
             System.out.println("a and b are equal");
         }
         else{
                System.out.println("a and b are not equal");
         }
         if(a==c){
             System.out.println("a and c are equal");
         }
            else{
                    System.out.println("a and c are not equal");
            }
            b=new Student();
            b.name="Hira";
         System.out.println("Student a name: " + a.name);
         System.out.println("Student b name: " + b.name);
         System.out.println("Student c name: " + c.name);
         

}
}