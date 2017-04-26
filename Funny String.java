import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int q = in.nextInt();
    String[] numbers = new String[q];

    for(int a0 = 0; a0 < q; a0++){
        String s = in.next();
        numbers[a0] = s;
    }

    for(String str : numbers){

        int length = str.length();

        if(length==0||length==1){

            System.out.println("NO");

        }

        else{

            boolean isValid = false;

            long sum = 0;

            for(int i=1;i<length;i++){

                sum = 0;

                String form = "";

                if(i!=length-1){

                    isValid = false;

                    String temp = str.substring(0,i);

                    if(!(temp.length()*2>str.length())){

                        long code = Long.parseLong(temp);

                        sum = code;

                        while(form.length()<str.length()){

                            form = form + code;

                            code = code + 1;

                        }

                        if(form.equals(str)){

                            isValid = true;
                            break;

                        }

                    }

                    else{

                        continue;

                    }

                }


            }

            if(isValid){

                System.out.println("YES " + sum);

            }

            else{

                System.out.println("NO");

            }


        }

    }import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        boolean flag=false;
        for(int i=0;i<t;i++){
            String input=in.next();
            String reverse = new StringBuffer(input).reverse().toString();
            int j=0,k=0;
        
            for(j=1,k=1;j<input.length() && k<reverse.length();j++,k++){
                if((Math.abs((int)input.charAt(j)-(int)input.charAt(j-1)))==(Math.abs((int)reverse.charAt(k)-(int)reverse.charAt(k-1)))){
                flag=true;
            }
            else{
                flag=false;
                System.out.println("Not Funny");
                break;
            }
        }
        if(flag==true){
            System.out.println("Funny");
        }
            
        }
    }
}



    }
}
