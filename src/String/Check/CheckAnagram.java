package String.Check;
public class CheckAnagram {
    void AnagramorNot(String string1,String string2){
        int len=string1.length();
        int len1=string2.length();
        char[]array1=string1.toCharArray();
        char[]array2=string2.toCharArray();
        int count=0,count1=0;
        for(int iterator=0;iterator<string1.length();iterator++){
            if(array1[iterator]==' '){
                len--; 
            }
            if(array1[iterator]!=' '){
                for(int iterator1=0;iterator1<string1.length();iterator1++){
                    if(array2[iterator1]!=' '){
                        if(array1[iterator]==array2[iterator1]){
                            array2[iterator1]='$';
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        for(int iterator1=0;iterator1<string2.length();iterator1++){
                 if(array2[iterator1]=='$'||array2[iterator1]==' '){
                    count1++;
                 }
        }
        if(count==len&&count1==len1) System.out.print("Anagram");
        else System.out.print("Not an Anagram");   
                  
    }
}
 