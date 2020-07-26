package io.epam.task.Java8Lamdas;
import java.util.*;
public class ListOfPalindromicStrings { 
  static boolean isPalindrome(String string) 
    { 
        int start = 0, end = string.length() - 1; 
        while (start < end)
        { 
            if (string.charAt(start) != string.charAt(end)) 
                return false;
            start++; 
            end--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int i;
        List<String> listOfStrings=new ArrayList<String>();  
        listOfStrings.add("madam");
        listOfStrings.add("adam");
        listOfStrings.add("dad");
        listOfStrings.add("anana");
        listOfStrings.add("mom");
        listOfStrings.add("list");
        System.out.println("Palindromic strings in the given list are:");
        for(i=0;i<6;i++)
        { 
        String string=listOfStrings.get(i);
        if (isPalindrome(string)) 
            System.out.println(string); 
        } 
} }