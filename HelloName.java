package by.epam.task1.main;

public class HelloName {

    public static String sayHello(String s) {
        return "Hello, " + s;
    }

    public static void main(String[] args) {
        System.out.println(HelloName.sayHello("name"));
    }
}