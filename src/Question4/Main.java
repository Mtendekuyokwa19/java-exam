package Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
AverageGrade grades=new AverageGrade();
        double[] marks= new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
        Scanner readline=new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter grade");
           marks[i]=readline.nextFloat();

        }
        System.out.println(

                grades.message(marks)
        );
    }
}
