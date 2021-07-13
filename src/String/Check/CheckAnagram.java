package String.Check;
public class CheckAnagram {
    void AnagramorNot(String A,String B){
        int len=A.length();
        int len1=B.length();
        char[]C=A.toCharArray();
        char[]D=B.toCharArray();
        int count=0,count1=0;
        for(int i=0;i<A.length();i++){
            if(C[i]==' '){
                len--; 
            }
            if(C[i]!=' '){
                for(int j=0;j<B.length();j++){
                    if(D[j]!=' '){
                        if(C[i]==D[j]){
                            D[j]='$';
                            count++;
                            break;
                        }
                    }
                }
            }
        }
        for(int j=0;j<B.length();j++){
                 if(D[j]=='$'||D[j]==' '){
                    count1++;
                 }
        }
        if(count==len&&count1==len1) System.out.print("Anagram");
        else System.out.print("Not an Anagram");   
                  
    }
}
 