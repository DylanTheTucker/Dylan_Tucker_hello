public class AppLauncher {
    //Main Body
    public static void main(String[] args) 
    { 
        //Construct HelloWorld Object
        HelloWorld student = new HelloWorld("Jason", 20); //Intro to name and age
        HelloWorld THEjason = new HelloWorld("Dylan"); //Only name, multiple class constructors
        HelloWorld user = new HelloWorld(); //get user name and age

        //introduce student
        student.introduce(); 

        //introduce jason AND show off custom greeting
        THEjason.greet(); 
        THEjason.greet("How are you today?");

        //showcase use of user input
        user.introduce();
    } 
}
