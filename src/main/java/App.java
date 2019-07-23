import module.decrypt;
import module.encrypt;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("\n Welcome to Ceaser cipher");
        boolean run = true;
        while(run){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("\t. Enter -> 1: to Encrypt\n\t. Enter -> 2:to Decrypt\n\t. Enter -> 0: to Exit");
            Integer branch = Integer.parseInt(myScanner.nextLine());

            if(branch.equals(1)) {
                System.out.println("\n Enter a word to encrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("You entered: " + stringWord);
                System.out.println("\n Enter the key to encrypt with");
                int intkey = myScanner.nextInt();
                encrypt Encrypt = new encrypt(stringWord,intkey);
                String encrypt= Encrypt.encrypter();
                System.out.println("\t| Your decrypt word is: " + encrypt);
                System.out.println("-----------------------------------------");



            }
            if(branch.equals(2)) {
                System.out.println("\n Enter a word to decrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("You entered: " + stringWord);
                System.out.println("\n Enter the key to decrypt with");
                int intkey = myScanner.nextInt();
                decrypt Decrypt = new decrypt(stringWord,intkey);
                String decrypt= Decrypt.decrypter();
                System.out.println("\t| Your decrypt word is: " + decrypt);
                System.out.println("-----------------------------------------");


            }

        }
    }
}
