import java.util.*; 

public class UniqueString{

//Is Unique: Implement an algo to determine if a string has all unique chars. What if you cannot use additional data structures? hints #44, 117, 132 
//could push to hashset, compare lengths of string to hashset if equal all unique
//could do hashtable, if any value > 1 return false because you have duplicate 

    static void traverseString(String sample){
                    
            HashSet<Character> set = new HashSet<Character>(); 
            //technically dont need this boolean because I could just println "true or false"
            Boolean sameLength = false; 
            for( int i = 0; i < sample.length(); i++){
                set.add(sample.charAt(i));
            }
            System.out.println("set size is "+ set.size());
            System.out.println("string size is "+ sample.length());
            
            if(set.size() == sample.length()){
                sameLength = true ; 
            }

            System.out.println(sameLength); 
            set.clear();

        }
/**** Would have been better to make Hashtable of boolean values. 

    boolean [] char_set = new boolean[128]
    forloop(i,i,i){
        int val = string.charAt(i)
        if(char_set[val]){
            if its true, will enter forloop...which means you have seen it so you can return a false and kick out
        }
    }
    if you made it through entire forloop with setting off ifcheck, you can now return true. 
 *****/


//without additional data structure...you'd have to do nested for loop, compare each string to all other chars...if equal, returns false because not all unique. 
    static void traverseWithoutExtraStructure(String sample){
        Boolean isUnique = true;
        for ( int i = 0; i < sample.length()-1; i ++){
            for (int j = i+1; j < sample.length(); j++){
                if(sample.charAt(i) == sample.charAt(j)){
                    // System.out.println("at i "+ sample.charAt(i));
                    // System.out.println("at j " + sample.charAt(j));
                    isUnique = false; 
                    break;
                }
            }
        }
        System.out.println(isUnique);
    }

    public static void main(String[] args){
            // traverseString("hello");
            // traverseString("eight");
            // traverseString("flower");
            // traverseWithoutExtraStructure("boo");
            // traverseWithoutExtraStructure("cat");
            // traverseWithoutExtraStructure("flowerpower");
        }
}