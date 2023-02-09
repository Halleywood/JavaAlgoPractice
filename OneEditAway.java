import java.util.*;

class OneEditAway{
    //there are three types of edits you can do on a string: insert one, delete one, or replace one. Given two strings, write a function to check if they are one or zero edits away from one another. 

    //pale, paleo --> TRUE 
    //pale, bale--> TRUE 
    //pale, bake--> FALSE 
    //pales, bales --> TRUE 

    //compare string lengths...could if check to make sure strings are equal or 1 letter away, if more than two wouldnt be one edit away. 
    //if you come to an index where not equal, increment both counters...if not equal another time it is done. or you finish looping return true. 
    //if 1 < 2
    //iterate until an index is not equal, the increment longer string...continue comparing like above 
    static boolean compareCharacters(String one, String two){
            int editCounter = 0; 
            if(one.length() == two.length()){
               int i = 0; 
               while(i < one.length()){
                    if(one.charAt(i) != two.charAt(i)){
                        editCounter++; 
                    } 
                    i++;
               }
            }
            else{
                int pointer1 = 0; 
                int pointer2 = 0; 
                if(one.length() > two.length()){
                    while(pointer2 < two.length()){
                        if(one.charAt(pointer1) != two.charAt(pointer2)){
                            editCounter++;
                            pointer1++;
                        }
                        else{
                            pointer1++; 
                            pointer2++; 
                        }      
                    }
                }
                if(one.length() <  two.length()){
                    while(pointer2 < two.length()){
                        if(one.charAt(pointer1) != two.charAt(pointer2)){
                            editCounter++;
                            pointer2++;
                        }
                        else{
                            pointer1++; 
                            pointer2++; 
                        }      
                    }
                }
            }

            if(editCounter > 1){
                System.out.println("FALSE, more than one edit away from eachother...");
                return false;
            }

            System.out.println("TRUE");
            return true; 
    }

    public static void main(String [] args){
        
        String one = "heo";
        String two = "hell";
        if(Math.abs((one.length()- two.length())) <= 1 ){
            compareCharacters(one, two);
        }
        else{
            System.out.println("FALSE, more than one edit away from eachother");
        }
    }
}