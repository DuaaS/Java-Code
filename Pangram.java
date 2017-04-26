import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        String s=in.nextLine();
       String str = s.toLowerCase().replaceAll(" ", "");
       // System.out.println(s);
        char[] chars = str.toCharArray();
        Set<Character> set = new HashSet<Character>();
        for(char c: chars){
            set.add(c);
        }

       // System.out.println(set.size());
        if(set.size() >= 26)
           System.out.println("pangram");
        else
            System.out.println("not pangram");
    }
   
}