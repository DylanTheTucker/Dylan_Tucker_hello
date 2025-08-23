import java.util.Scanner;

public class AppLauncher {
    //Main Body
    public static void main(String[] args) 
    { 
        //Allows input for name and age
        Scanner sc = new Scanner(System.in);

        System.out.println("Name?");
        String name = sc.next();
        System.out.println("age?");
        int age = sc.nextInt();

        if(age < 0)
        {
            System.out.println("Error");
        }

        //Construct HelloWorld Object
        HelloWorld student = new HelloWorld(name, age);
        HelloWorld THEjason = new HelloWorld(name);

        //Calling the Methods
        student.introduce();
        THEjason.greet(); 
        THEjason.greet("How are you today?");
    } 
}
