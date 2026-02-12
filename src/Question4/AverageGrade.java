package Question4;

import java.util.ArrayList;

public class AverageGrade {
    public String message(double[] marks){
        ArrayList<Grade> markCollection=new ArrayList<Grade>();
        for (double mark : marks) {
           markCollection.add(whatMark(mark)) ;
        }
        if(
            markCollection.contains(Grade.FAILED)){
            return "Please do better";
        };
        return "Great work";
    }
public  Grade whatMark(double grade){
   if (grade>=75){
       return Grade.DISTINCTION;
   }
   if (grade>=65){
       return Grade.CREDIT;
   }
   if (grade>=50){
       return Grade.GENRALPASS;
   };
   return Grade.FAILED;
}
}
enum Grade{
    DISTINCTION,
    CREDIT,
    GENRALPASS,
    FAILED
}
