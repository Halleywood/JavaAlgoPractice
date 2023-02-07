import java.util.*;

class PalindromePermutation{
    //given a string, write a function that checks its permutation(s) is a palindrome 
    //pseudocode: 
    //iterate through string, pushing frequencies to a hashtable. 
    //then cycle through keys, keeping a counter of odd values. if counter > 1, not a palidrome. Can only be pairs/sets of pairs/one odd set if total number of chars is odd** 
    //will need to check total chars for odd and even. 

    //push string to char array 
    //iterate thru array and add to map 
    //cycle through key/value pairs...if char.length is even, can have no odd values. if char.length is odd, can only have one odd value. 
    static void checkFrequency(HashMap<Character, Integer> map){
       int oddValues = 0; 
       for( int i : map.values()){
        if (i % 2 != 0){
            oddValues++; 
        }
       }
       if(oddValues > 1){
        System.out.println("FALSE, NO PALINDROME COULD EXIST");
       }
       else{
         System.out.println("TRUE, there could be palindrome");
       }
    
    }


    static void isPalindrome(char [] inputArray){
        HashMap<Character, Integer> map = new HashMap<>();
        int stringLength = 0; 
        for(char c : inputArray){
            //I don't know if spaces or just chars considered in palindrome. I am considering only characters considered, spaces do not effect outcome. Would take this check out if spaces were part of solution. 
            if (c != ' '){
                //could check length while making array if white space mattered. 
                stringLength++; 
                //if it already exists in map, add to frequency
                if(map.containsKey(c)){
                    map.put(c, map.get(c) + 1); 
                }
                //else, add first appearance to hashmap
                else{
                    map.put(c, 1);
                }
                }
                }
        //then feed map to frequency checking method, find how many characters appear odd times. if more than 1, not a palindrome. can only have 1 key/set that is odd or none. 
        checkFrequency(map);  
    }
    
    public static void main(String []args){
        String input = "tact cao"; 
        char [] inputCharsArray = input.toLowerCase().toCharArray(); 
     
        isPalindrome(inputCharsArray);
    }


}