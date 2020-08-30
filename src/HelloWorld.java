import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("in main");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.printf("%s", name);
    }
}
