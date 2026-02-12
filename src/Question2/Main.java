package Question2;


import java.io.Reader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner readline=new Scanner(System.in);
        var agecheck=new AgeCheck();
        System.out.println(
                agecheck.checkAge(readline.nextInt())
        );


    }
}
