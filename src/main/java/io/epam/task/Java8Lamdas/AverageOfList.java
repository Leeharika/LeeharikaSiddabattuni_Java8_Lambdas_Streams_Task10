package io.epam.task.Java8Lamdas;
import java.util.*; 
import java.util.stream.IntStream;  
class AverageOfList { 
  
    public static void main(String[] args) 
    { 
        IntStream listOfInputs = IntStream.of(5,10,16,4,2,1,18,20);  
        OptionalDouble averageOfList = listOfInputs.average(); 
        System.out.println("Averenge of given list of inputs is:");
        if (averageOfList.isPresent()) 
        { 
            System.out.println(averageOfList.getAsDouble()); 
        } 
        else 
        { 
            System.out.println("-1"); 
        } 
    }
}