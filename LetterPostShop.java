//Home Work 
// Thanakon Nokkhiao 644295024
package chap3;

import java.util.Scanner;

public class LetterPostShop {

    static void printMenu() {
        
        System.out.println("Songkhla Post Office");
        System.out.println("Program is created by Thanakon Nokkhiao");
        System.out.println("------------------- Menu -------------------");
        System.out.println("0 : Exit");
        System.out.println("1 : Noraml Letter");
        System.out.println("2 : Register Letter");
        System.out.println("3 : EMS Letter");
        System.out.println("---------------------------------------------");
    }

    static int noramlLetter(int wei) {
        int baht = 0;
        
        if ((wei >1000) && (wei<=2000)) {
            baht = 45;
        } else if ((wei >500) && (wei<=1000)) {
            baht = 25;
        } else if ((wei >250) && (wei<=500)) {
            baht = 15;
        } else if ((wei >100) && (wei<=250)) {
            baht = 9;
        } else if ((wei >20) && (wei<=100)) {
            baht = 5;
        } else {
            baht = 3;
        }

        return baht;

    }//end noramlLetter
    
    static int emsLetter(int wei) {
        int baht = 0;
        
        if ((wei >1000) && (wei<=2000)) {
            baht = 77;
        } else if ((wei >500) && (wei<=1000)) {
            baht = 62;
        } else if ((wei >250) && (wei<=500)) {
            baht = 47;
        } else if ((wei >100) && (wei<=250)) {
            baht = 37;
        } else if ((wei >20) && (wei<=100)) {
            baht = 32;
        } else {
            baht = 27;
        }

        return baht;

    }//end EMSLetter

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        printMenu();
        do {
            
            System.out.print("Please Enter menu [0-3] : ");
            menu = sc.nextInt();
            System.out.println("");
            int weight, baht;
            switch (menu) {
                case 0:
                    break;
                case 1:
                    System.out.println("1. Noraml Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    baht = noramlLetter(weight);
                    System.out.println("\tNormal Letter Service Price : "+baht+" baht");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("2. Register Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    baht = noramlLetter(weight);
                    System.out.println("\tNormal Letter Service Price : "+(baht+13)+" baht");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("3. EMS Letter");
                    System.out.print("\tEnter weight (g) : ");
                    weight = sc.nextInt();
                    baht = emsLetter(weight);
                    System.out.println("\tEMS Letter Service Price : "+baht+" baht");
                    System.out.println("");
                    break;
                default:System.out.println("Again!");
            }

        } while (menu != 0);
        
        System.out.println("OK! Good Bye!");

    }

}//end class
