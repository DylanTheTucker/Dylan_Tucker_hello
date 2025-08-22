public class HelloWorld { 
    String name; 

    private int age;

    //Class constructor
    public HelloWorld(String name, int age) { 
        this.name = name; 
        this.age = age;
    }

    public HelloWorld(String name) { 
        this.name = name; 
    }

    //function
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 

    public void introduce() {
        System.out.println("Hello, my name is "     //enter after each plus sign
        + name 
        + " and I am " 
        + age 
        + " years old.");
    }

    public void greet(String greeting) {
        System.out.println(greeting);
    }
}
