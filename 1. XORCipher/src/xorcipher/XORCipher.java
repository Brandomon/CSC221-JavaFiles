/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package xorcipher;

import java.util.*;

/**
 *
 * @author Brandon LaPointe
 * Date : 03/03/2022 
 * 
 * This program will ask the user to enter a string and an integer between 0 and 255 (inclusive)
 * to be used as a key before XORing each character with the provided integer key and 
 * storing the result as an int. The program will then cast the stored int to a char and store 
 * it in a new char variable before printing the resulting integer and character to a line.
 * 
 */
public class XORCipher {
    private static Scanner in;
    
    static int userKey = 0;        //User input integer (Between 0 and 255 inclusive) to be used as the key for the XOR Cipher
    static int charXorKey = 0;     //Character of string after XOR with key integer, stored as integer (3a)
    static char intCastToChar;     //Integer value of character from original string after XOR with key (3b)
    static String userInput = "";  //User input string to encrypt and decrypt using XOR Cipher
    static String result = "";     //Final result of string conversion
    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        
        System.out.print("Enter a String: ");                                       //Get string from user for encryption
        userInput = in.nextLine();
        
        System.out.print("Enter an integer between 0 and 255 (inclusive): ");       //Get integer from user for key
        userKey = in.nextInt();
        
        while (userKey > 255 || userKey < 0){                                       //WHILE userKey is not within the given range
            System.out.println("Error: Input out of given range");                  //Display error message
            System.out.print("Enter an integer between 0 and 255 (inclusive): ");   //Get integer from user for key
            userKey = in.nextInt();
        }
        
        for (int index = 0; index < userInput.length(); index++) {  //Walks through string and for each character...
            charXorKey = userInput.charAt(index)^userKey;           //XOR the character with the provided integer key, storing as an int
            intCastToChar = (char)charXorKey;                       //Casts the int (charXorKey) to a char and stores it in a new char variable
            System.out.println(userInput.charAt(index) + " [" +     //Displays a formatted output of the original char, the original char
                       (int)userInput.charAt(index) + "] -> " +     //      casted to an int, followed by the encrypted char and the
                       intCastToChar + " [" + charXorKey + "]");    //      encrypted char casted to an int.
            
            result += intCastToChar;                                //Add integer casted to char to the end result
        }
        
        System.out.println("Result: " + result);
        System.out.println("~~~~~~~~~~~~~~~~");
    }
}

/*******************************************Examples From Program*******************************************
*run:
*Enter a String: CSC221
*Enter an integer between 0 and 255 (inclusive): 12
*C [67] -> O [79]
*S [83] -> _ [95]
*C [67] -> O [79]
*2 [50] -> > [62]
*2 [50] -> > [62]
*1 [49] -> = [61]
*Result: O_O>>=
*~~~~~~~~~~~~~~~~
*BUILD SUCCESSFUL (total time: 7 seconds)
* 
*run:
*Enter a String: O_O>>=
*Enter an integer between 0 and 255 (inclusive): 12
*O [79] -> C [67]
*_ [95] -> S [83]
*O [79] -> C [67]
*> [62] -> 2 [50]
*> [62] -> 2 [50]
*= [61] -> 1 [49]
*Result: CSC221
*~~~~~~~~~~~~~~~~
*BUILD SUCCESSFUL (total time: 4 seconds)
*
*run:
*Enter a String: New York
*Enter an integer between 0 and 255 (inclusive): 27
*N [78] -> U [85]
*e [101] -> ~ [126]
*w [119] -> l [108]
*  [32] -> ; [59]
*Y [89] -> B [66]
*o [111] -> t [116]
*r [114] -> i [105]
*k [107] -> p [112]
*Result: U~l;Btip
*~~~~~~~~~~~~~~~~
*BUILD SUCCESSFUL (total time: 13 seconds)
*
*run:
*Enter a String: U~l;Btip
*Enter an integer between 0 and 255 (inclusive): -1
*Error: Input out of given range
*Enter an integer between 0 and 255 (inclusive): 256
*Error: Input out of given range
*Enter an integer between 0 and 255 (inclusive): 27
*U [85] -> N [78]
*~ [126] -> e [101]
*l [108] -> w [119]
*; [59] ->   [32]
*B [66] -> Y [89]
*t [116] -> o [111]
*i [105] -> r [114]
*p [112] -> k [107]
*Result: New York
*~~~~~~~~~~~~~~~~
*BUILD SUCCESSFUL (total time: 13 seconds)
***************************************************************************************/