public class Student {

            int id;
            String name;
            int completedCredits;
            void printsummary(){
                System.out.println("Name: " + name);
                System.out.println("ID: " + id);
                System.out.println("Completed Credits: " + completedCredits);
            }
            int addCredits(int creditsAdded){
                completedCredits+=creditsAdded;
                return completedCredits;
            }
            void rename(String name) {
             this.name = name;
}

     }

