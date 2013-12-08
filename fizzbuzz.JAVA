/*
Classic FizzBuzz that prints "Fizz" for numbers wholly divisible by 3, "Buzz" for numbers wholly divisible by 5, and "FizzBuzz" for numbers that are wholly divisible by 3 and 5. Top code is after some reading and refinement, bottom code that is commented out is my initial, "off the top of my head" attempt.
*/

public class FizzBuzz{

     public static void main(String []args){
        
        for(int i = 1; i < 100; i++) {
            String number = "";
            
            if(i % 3 == 0)
                number += "Fizz";
            if(i % 5 == 0)
                number += "Buzz";
            if(number.length() == 0)
                number = Integer.toString(i);
                
            System.out.println(number);
        }
        
     }
}

/* After writing the code below I realized that it probably wasn't the most efficient way to tackle the problem and did some research. My goal was to cut down on the number of conditionals and find a way to avoid repeating println. The above code is the result, removing one conditional and reducing the output to a single println which is much more in line with DRY.

public class FizzBuzz{
    
    public static void main(String []args){
    
        for(int i = 1; i < 100; i++){
            if(i % 15 == 0)
                System.out.println("FizzBuzz");
                else if(i % 3 == 0)
                    System.out.println("Fizz");
                    else if(i % 5 == 0)
                        System.out.println("Buzz");
                            else
                                System.out.println(i);
            
            
        }
    }
}
*/
