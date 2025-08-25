import java.util.Scanner;

public class AppLauncher {
    //Main Body
    public static void main(String[] args) 
    { 
        try {
            
            //Allows input for name and age
            Scanner sc = new Scanner(System.in);

            System.out.println("Name?");
            String name = sc.next();

            //incase you try to put empty name
            if(name.isEmpty())
            {
                System.out.println("Invaild");
                System.exit(0);
            }
            System.out.println("age?");
            int age = sc.nextInt();
            //Incase you try to put a number less then 0
            if(age < 0)
            {
                System.out.println("Invaild");
                System.exit(0);
            }
            //Construct HelloWorld Object
            HelloWorld student = new HelloWorld(name, age);
            HelloWorld THEjason = new HelloWorld(name);

            //Calling the Methods
            student.introduce();
            THEjason.greet(); 
            THEjason.greet("How are you today?");
        } 
         catch (Exception e) {
            System.out.println("Invaild");
        }
    } 
}
