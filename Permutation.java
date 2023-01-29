import java.util.*;

public class Permutation{
    //Check Permutation: Given two strings, write a method to decide if one is permutation of the other Hints #1, 84, 122, 131 
    //would push all values into hash table for one string...then go thru second string and see if it exists in dictionary. 
    //if it exists, delete one incase char exists multiple times
    //in the end, hashtable should be empty if it is permutaion. 

    // time complexity: O(2n)--> O(n), worst case scenario, you have to go thru string1 then look up every character in string 2? 
    //space complexity: O(n)--> worst case, have to create hashtable as big as string1? 
    //if check if strings are same length, if not they are not permutations and you can skip algo. 

    //holds characters and their frequencies 
    static HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();
 
    static boolean compareStringLengths(String one, String two){
        if(one.length() == two.length()){
            return true;
        }
        return false;
    }

    static void addToHashMap(String one){
        //converts string to an array for iteration  
        char [] charactersOfString = one.toCharArray();

        //now we know equal, push one string to hashtable
        for( char c : charactersOfString){
            if( characterMap.containsKey(c)){
                characterMap.put(c, characterMap.get(c) + 1);
            }
            else{
                characterMap.put(c, 1);
            }
        }
    }

    static boolean isPermutation(String one, String two){

        if(!compareStringLengths(one, two)){
        System.out.println("two strings are not equal lengths, therefore not perms");
        return false;
        }
        
        addToHashMap(one);
        
        //then iterate thru second string
        //if char not in hash, will exit. If frequency < 0, will exit. 
        char [] secondStringChars = two.toCharArray();

        for( char c: secondStringChars){
            if(characterMap.containsKey(c) && characterMap.get(c) >= 1){
                characterMap.put(c, characterMap.get(c) - 1);
            }
            else{
                System.out.println("NOT permutations");
                return false;
            }
        }

        System.out.println(characterMap);
        System.out.println("ARE PERMUTATIONS");
        return true; 
    }

    public static void main (String[] args){
        isPermutation("racecar", "monkeys");
    }
}