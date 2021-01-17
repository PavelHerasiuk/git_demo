package by.epam.task1.main;

public class HelloName {

    public static String sayHello(String s) {
         return "Hello, " + s + "\nNice to met you";
    }

    public static void main(String[] args) {
        System.out.println(HelloName.sayHello("name"));
    }
}
