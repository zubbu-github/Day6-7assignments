package assignment2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class vowelorconsonents {
	 public static void main(String[] args) throws   IOException  {

	 char n;
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the character you want to check:");
    n = (char) bf.read();
    switch(n)
    {
        case 'a':
        System.out.println("The given character "+n+" is vowel");
        break;

        case 'e':
        System.out.println("The given character "+n+" is vowel");
        break;

        case 'i':
        System.out.println("The given character "+n+" is vowel");
        break;

        case 'o':
        System.out.println("The given character "+n+" is vowel");
        break;

        case 'u':
        System.out.println("The given character "+n+" is vowel");
        break;

        default:
        System.out.println("The given character "+n+" is consonant");
        break;
    }
}
}

