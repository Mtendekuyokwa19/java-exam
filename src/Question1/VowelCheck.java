package Question1;

public class VowelCheck {

    char[] vowels={'a','e','i','o','u'};
    public String vowelNameCheck(String firstname,String lastname){
        if(containsVowel(firstname.split("")[0])&&containsVowel(lastname.split("")[0])){
            return "you are an absolute vowelist";
        }
        if (containsVowel(firstname.split("")[0])||containsVowel(lastname.split("")[0])){

            return "you are a vowelist";
        }
        return "you are an antivowel person";
    }
    public   boolean containsVowel(String letter){
        for (char vowel : vowels) {
           if(letter.toLowerCase().toCharArray()[0]==vowel){
               return true;
           }
        }
        return false;
    }

}
