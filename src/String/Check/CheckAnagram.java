package String.Check;
public class CheckAnagram {
    void AnagramorNot(String string1,String string2){
        int len=string1.length();
        int len1=string2.length();
        char[]array1=string1.toCharArray();
        char[]array2=string2.toCharArray();
        int count=0,count1=0;
        for(int i=0;i<string1.length();i++){
            if(array1[i]==' '){
                len--; 
            }
            if(array1[i]!=' '){
                for(int j=0;j<string1.length();j++){
                    if(array2[j]!=' '){
                        if(array1[i]==array2[j]){
                            array2[j]='$';
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        for(int j=0;j<string2.length();j++){
                 if(array2[j]=='$'||array2[j]==' '){
                    count1++;
                 }
        }
        if(count==len&&count1==len1) System.out.print("Anagram");
        else System.out.print("Not an Anagram");   
                  
    }
}
 