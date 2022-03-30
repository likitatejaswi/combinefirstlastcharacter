import firstlast.First;

import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1 = s.nextLine();
        System.out.println("Enter second string");
        String str2 = s.nextLine();

        First first = new First();
        String result = first.first(str1,str2);
        System.out.println("Final result :"+result);


    }
}