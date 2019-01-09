package ArrayAndArrayLists;

import java.util.LinkedList;
import java.util.Stack;

public class CheckForPallindrome {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindromeHard("abccba"));
        // should return false
        System.out.println(checkForPalindromeHard("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeHard("I did,did I"));
        // should return false
        System.out.println(checkForPalindromeHard("hello"));
        // should return false
        System.out.println(checkForPalindromeHard("Don't'nod"));
        
        // should return true
        System.out.println(checkForPalindromeIgnore("abccba"));
        // should return true
        System.out.println(checkForPalindromeIgnore("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindromeIgnore("I did,did I"));
        // should return false
        System.out.println(checkForPalindromeIgnore("hello"));
        // should return true
        System.out.println(checkForPalindromeIgnore("Don't'nod"));
    }

    public static boolean checkForPalindromeHard(String string) {

        String reversed= "";
        Stack<String> st = new Stack<String>();
        for(int i =0 ; i< string.length();i++) {
        	st.push(String.valueOf(string.charAt(i)));
        }
        
        while(!st.isEmpty())
        	reversed+=st.pop();
        
        if(reversed.equals(string))
        return true;
        else
        	return false;
    }
    
    public static boolean checkForPalindromeIgnore(String string) {

        String reversed= "",nopunctuation="";
        Stack<String> st = new Stack<String>();
        for(int i =0 ; i< string.length();i++) {
        	if(string.toLowerCase().charAt(i)>='a' && string.toLowerCase().charAt(i)<='z') {
        	st.push(String.valueOf(string.toLowerCase().charAt(i)));
        	nopunctuation+=string.toLowerCase().charAt(i);}
        }
        
        while(!st.isEmpty())
        	reversed+=st.pop();
        
        if(reversed.equals(nopunctuation))
        return true;
        else
        	return false;
    }
}
