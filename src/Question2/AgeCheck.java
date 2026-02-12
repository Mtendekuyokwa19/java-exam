package Question2;

import java.util.Date;

public class AgeCheck {
public String checkAge(int age){
   int currentYear= 2025;
   var yearBorn=currentYear-age;

   if (yearBorn>1995){
       return "You are genz";
   } else if (yearBorn>=1970&&yearBorn<=1995) {
       return "you are old generation";

   }
   return  "you are an old generation";
}
}
