/**
 * File: PinyinUI.java
 * Description: Provides a user interface to encrypt and decrypt text with psuedo-Pinyin
 */
package pinyincrypto;
import pinyincrypto.*;
import java.io.*;
import java.*;

/**
 * @author Jason Miller
 * @category EL_ENG_X436_2_Project
 */
public class PinyinUI {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in), 1);
        // Local variables
        int swValue;
        do{
        // Display menu graphics
        System.out.println("====================================");
        System.out.println("|   PinyinCrypto v0.1              |");
        System.out.println("====================================");
        System.out.println("| Options:                         |");
        System.out.println("|        1. Type text to encrypt   |");
        System.out.println("|        2. Type text to decrypt   |");
        System.out.println("|        3. Exit                   |");
        System.out.println("====================================");
        swValue = Keyin.inInt(" Select option: ");
          
         // Switch construct
        switch (swValue) {
        case 1:                                              // Accept user input to record a game                   
           // Add the date
           System.out.println("Please enter some secret text to encrypt then press ENTER:");
           String plainsecret = stdin.readLine();            // get unencrpyted input from keyboard
           String secret = Encrypt2Pinyin.e2p(plainsecret);
           System.out.println("Your encrypted text is:");
           System.out.println(secret);
           break;
        case 2:
          System.out.println("Please enter some secret text to decrypt then press ENTER");
          
          String pinyinsecret = stdin.readLine();            // get encrpyted input from keyboard
          String plaintext = DecryptPinyin.p2t(pinyinsecret);
          System.out.println("Your decrypted text is:");
          System.out.println(plaintext);
          break;                                         
        case 3:
            System.out.println("Exit selected");          
            break;
        default:
          System.out.println("Invalid selection");
        }
}                 while(swValue != 3);

	}

}
//**********************************************************
//**********************************************************
//Program: Keyin
//Citation: I got this from
//http://www.java2s.com/Code/Java/Development-Class/Javaprogramtodemonstratemenuselection.htm
//Topics:
//1. Using the read() method of the ImputStream class
//in the java.io package
//2. Developing a class for performing basic console
//input of character and numeric types
//**********************************************************
//**********************************************************
class Keyin {

//*******************************
// support methods
//*******************************
//Method to display the user's prompt string
public static void printPrompt(String prompt) {
System.out.print(prompt + " ");
System.out.flush();
}

//Method to make sure no data is available in the
//input stream
public static void inputFlush() {
int dummy;
int bAvail;

try {
  while ((System.in.available()) != 0)
    dummy = System.in.read();
} catch (java.io.IOException e) {
  System.out.println("Input error");
}
}

//********************************
//data input methods for
//string, int, char, and double
//********************************
public static String inString(String prompt) {
inputFlush();
printPrompt(prompt);
return inString();
}

public static String inString() {
int aChar;
String s = "";
boolean finished = false;

while (!finished) {
  try {
    aChar = System.in.read();
    if (aChar < 0 || (char) aChar == '\n')
      finished = true;
    else if ((char) aChar != '\r')
      s = s + (char) aChar; // Enter into string
  }

  catch (java.io.IOException e) {
    System.out.println("Input error");
    finished = true;
  }
}
return s;
}

public static int inInt(String prompt) {
while (true) {
  inputFlush();
  printPrompt(prompt);
  try {
    return Integer.valueOf(inString().trim()).intValue();
  }

  catch (NumberFormatException e) {
    System.out.println("Invalid input. Not an integer");
  }
}
}

public static char inChar(String prompt) {
int aChar = 0;

inputFlush();
printPrompt(prompt);

try {
  aChar = System.in.read();
}

catch (java.io.IOException e) {
  System.out.println("Input error");
}
inputFlush();
return (char) aChar;
}

public static double inDouble(String prompt) {
while (true) {
  inputFlush();
  printPrompt(prompt);
  try {
    return Double.valueOf(inString().trim()).doubleValue();
  }

  catch (NumberFormatException e) {
    System.out
        .println("Invalid input. Not a floating point number");
  }
}
}
}