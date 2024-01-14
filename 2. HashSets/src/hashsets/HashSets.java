/**
 *
 * @author Brandon LaPointe
 * Date : 03/10/2022 
 * 
 * This program will represent the sets T, W, and O from the homework assignment given in class.
 * The program will compute and print out the cardinality of T,W, and O, compute the output of T union W,
 * compute the output of the complement of (T union W) relative to O, computes and prints whether {"The Wrath of Kahn" ,
 * "The Search for Spock" , and "The Voyage Home"} is a subset of T, and finally computes and prints whether 
 * {"The Wrath of Kahn" , "The Search for Spock" , and "The Voyage Home"} is a proper subset of T.
 * 
 */

package hashsets;
import java.util.*;

public class HashSets {
    
    public static void main(String[] args) {
        
        //Create a HashSet of type String called T
        HashSet<String> T = new HashSet<>();
        
        //Add elements into set T
        T.add("The Wrath of Kahn");
        T.add("The Search for Spock");
        T.add("The Voyage Home");
        T.add("The Undiscovered Country");
        
        //Create a HashSet of type String called W
        Set<String> W = new HashSet<>();
        
        //Add elements into set W
        W.add("A New Hope");
        W.add("The Empire Strikes Back");
        W.add("Return of the Jedi");
        
        //Create a HashSet of type String called O
        Set<String> O = new HashSet<>();
        
        //Add elements into set O
        O.add("The Empire Strikes Back");
        O.add("Return of the Jedi");
        
        //Compute the cardinality of each set
        System.out.println("The Cardinality of each set:");
        System.out.println("T = " + T.size());
        System.out.println("W = " + W.size());
        System.out.println("O = " + O.size());
        
        //Compute the output of T union W
        System.out.println("\nThe union of T and W:");
        T.addAll(W);
        System.out.println(T);
        
        //Compute the output of the complement of (T union W) relative to O
        System.out.println("\nThe complement of (T union W) relative to O:");
        T.removeAll(O);
        System.out.println(T);
        
        //Computes and prints whether {"The Wrath of Kahn" , "The Search for Spock" , and "The Voyage Home"} is a subset of T        
        //Clear modified set T of all elements
        T.clear();
        
        //Add original elements into set T
        T.add("The Wrath of Kahn");
        T.add("The Search for Spock");
        T.add("The Voyage Home");
        T.add("The Undiscovered Country");
        
       //Create new set of {"The Wrath of Kahn" , "The Search for Spock" , and "The Voyage Home"}
        Set<String> Z = new HashSet<>();
        
        //Add elements into set Z
        Z.add("The Wrath of Kahn");
        Z.add("The Search for Spock");
        Z.add("The Voyage Home");
        
        //Computes and prints whether {"The Wrath of Kahn" , "The Search for Spock" , and "The Voyage Home"} is a subset of T  
        System.out.println("\nSet {\"The Wrath of Kahn\" , \"The Search for Spock\" , \"The Voyage Home\"} is a subset of T: " + T.containsAll(Z));
        
        //Computes and prints whether {"The Wrath of Kahn" , "The Search for Spock" , and "The Voyage Home"} is a proper subset of T
        System.out.print("\nSet {\"The Wrath of Kahn\" , \"The Search for Spock\" , \"The Voyage Home\"} is a proper subset of T: ");
        if (T.containsAll(Z) && !T.equals(Z))
            System.out.print("true");
        else
            System.out.print("false");
        
        //Extra blank line for formatting
        System.out.println("\n");
        
    }
}


/**************************************Output**************************************
run:
The Cardinality of each set:
T = 4
W = 3
O = 2

The union of T and W:
[A New Hope, The Wrath of Kahn, The Empire Strikes Back, Return of the Jedi, The Voyage Home, The Search for Spock, The Undiscovered Country]

The complement of (T union W) relative to O:
[A New Hope, The Wrath of Kahn, The Voyage Home, The Search for Spock, The Undiscovered Country]

Set {"The Wrath of Kahn" , "The Search for Spock" , "The Voyage Home"} is a subset of T: true

Set {"The Wrath of Kahn" , "The Search for Spock" , "The Voyage Home"} is a proper subset of T: true

BUILD SUCCESSFUL (total time: 0 seconds)
 **********************************************************************************/