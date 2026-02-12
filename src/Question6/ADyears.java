package Question6;

public class ADyears {
    int currentYear=2026;
public String calculateYearAD(int year){
   return "Years from" +year+"AD"+"to 2026  "+((+currentYear-year))+"   years";
}

    public String calculateYearBC(int year){
        return "Years from" +year+"BC"+"to 2026   "+((currentYear+year)-1)+"  years";
    }
    public String  calculateYear(int year,yearType yearType){
    if(yearType== yearType.AD){
        return calculateYearAD(year);
    }
    return calculateYearBC(year);

    }
    public boolean isOkAuth(int year){
   if (year==0||year<0||year>currentYear){
       return false;
   }
   return true;
    }
}
enum yearType{
    AD,
    BC
}
