public class AppLauncher {
    //Main Body
    public static void main(String[] args) 
    { 
        //Construct HelloWorld Object
        HelloWorld student = new HelloWorld("Dylan", 20);
        HelloWorld THEjason = new HelloWorld("Dylan");

        student.introduce();
        THEjason.greet(); 
        THEjason.greet("How are you today?");
    } 
}
