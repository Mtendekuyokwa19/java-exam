package Question6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readline=new Scanner(System.in);
        Scanner readString=new Scanner(System.in);
ADyears aDyears=new ADyears();
int year=0;
yearType yearType= Question6.yearType.AD;
var yearTypeInString="";
        System.out.println("enter year");
        year=readline.nextInt();
if( !aDyears.isOkAuth(year) ){
    System.out.println("Err input");
    return;
}


        System.out.println("enter type(BC/AD)");
yearTypeInString=readString.next();

if (yearTypeInString.equalsIgnoreCase("bc")){
    System.out.println(
            aDyears.calculateYear(year, Question6.yearType.BC)
    );

    return;
} else if ( yearTypeInString.equalsIgnoreCase("ad") ) {

    System.out.println(
            aDyears.calculateYear(year, Question6.yearType.AD)
    );
    return;
}
        System.out.println("Err in input");

}


}
