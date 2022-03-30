package firstlast;

public class First {
    public String first(String str1, String str2){
        if(str1.length()>=1){
           str1 = str1.substring(0,1);
        }else{
           str1 = "#";
        }
        if(str2.length()>=1){
           str2=  str2.substring(str2.length()-1);
        }else{
            str2 = "#";
        }
        return str1 + str2;
    }
}
