import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times to print message :");
        int number = sc.nextInt();
        while(number > 0) {
            System.out.println("Hello World");
            number--;
        }
    }
}
