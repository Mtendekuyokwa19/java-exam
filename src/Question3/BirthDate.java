package Question3;

import java.util.Date;

public class BirthDate {

public void calculateBirthDate(String date)    {
    int year=2026;
   var dateInArray=date.split("/") ;
    System.out.println(
            year-Integer.parseInt(dateInArray[2])

    );

}
}
