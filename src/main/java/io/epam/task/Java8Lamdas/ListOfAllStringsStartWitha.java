package io.epam.task.Java8Lamdas;
import java.util.stream.Stream; 
public class ListOfAllStringsStartWitha { 
	  
	    public static void main(String[] args) 
	    { 
	    	System.out.println("The strings that starts with 'a' and of length three are:");
	        Stream<String> listOfStrings = Stream.of("all","the","numbers","are","in","the","list"); 
	        listOfStrings.filter(string -> string.startsWith("a") && string.length()==3)
	        .forEach(System.out::println); 
	    } 
}
