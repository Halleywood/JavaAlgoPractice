import java.util.ArrayList;
import java.util.Random;

class BubbleSort{
    public static void main(String[] args){
        //
        Random rand = new Random(); 
        // System.out.println(rand);
        int[] numbers = new int [10]; 
        for(int i=0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100); 
        }
        System.out.println("before sorting...");
        printArray(numbers);

        boolean neededSwap = true; 
        while(neededSwap){
            neededSwap = false; 
   
        for( int i =0; i < numbers.length -1; i++){
            if( numbers[i] > numbers [i+1]){
                neededSwap = true; 
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp; 
            }
        } 
        }
        System.out.println("After sorting"); 
        printArray(numbers);
    }

    public static void printArray(int[] numbers){
        for(int number : numbers){
            System.out.println(number);
        }
    }

    //now we need to sort numbers. Use while loop and true false boolen. 
}