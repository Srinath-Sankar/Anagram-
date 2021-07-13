package String.Check;
import java.util.Scanner;
import java.lang.String;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String string1="a decimal point";
        String string2="im a dot in place";
        new CheckAnagram().AnagramorNot(string1,string2);
        
    }
    
}

