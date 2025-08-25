public class HelloWorld { 
    String name; 

    private int age;

    /**Class constructor 
     * Setting the Perimeter for HelloWorld class
    */
    public HelloWorld(String name){
        this.name = name;
    }

    /**Class constructor p2 
     * Setting the Perimeter for HelloWorld class
     * With age
    */
    public HelloWorld(String name, int age) { 
        this.name = name; 
        this.age = age;
    }

    /**Greet Function 
     * Has a set message within the Function
    */
    public void greet() { 
        System.out.println("Hello, " + name + "!"); 
    } 

    /**Introduce Function
     * Has a set message within the Function
     */
    public void introduce() {
        System.out.println("Hello, my name is "     //enter after each plus sign
        + name 
        + " and I am " 
        + age 
        + " years old.");
    }

    /**Overload for Greet Function 
     * Allows for custom message
    */
    public void greet(String greeting) {
        System.out.println(greeting);
    }
}
