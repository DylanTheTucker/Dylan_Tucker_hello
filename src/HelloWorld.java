import java.util.Scanner;

public class HelloWorld { 
    String name; 

    private int age = 256;

    Scanner scanner = new Scanner(System.in);

    //Class constructor
    public HelloWorld(String name, int age) { 
        this.name = name; 
        this.age = age;
    }

    //constructor with no age
    public HelloWorld(String name) { 
        this.name = name; 
    }

    //constructor that takes user input
    public HelloWorld() {
        this.name = userName();
        
        this.age = userAge();
    }

    //function
    public void greet(HelloWorld nameGet) { 
        System.out.println("Hello, " + nameGet.name + "!"); 
    } 

    //greeting with age
    public void introduce() {
        System.out.println("Hello, my name is "     //enter after each plus sign
        + name 
        + " and I am " 
        + age 
        + " years old.");
    }

    //custom greeting
    public void greet(String greeting) {
        System.out.println(greeting);
    }

    //get user name
    public String userName() {
        System.out.println("Please enter your name");
        String s = scanner.nextLine();

        if (s.equals("")) {
            return userName(); //re-asks if no name given
        }
        return s;
    }

    public int userAge() {
        System.out.println("Please enter your age");
        int i = scanner.nextInt();

        if (i < 0) {
            return userAge(); //re-asks if negative number given
        }
        return i;
    }
}
