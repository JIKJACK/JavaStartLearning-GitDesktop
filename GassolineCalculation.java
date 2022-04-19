package chap3;

import java.util.Scanner;

public class GassolineCalculation {

    static final double PTT[] = {36.50, 33.24, 41.54, 29.34};
    static final double BCP[] = {37.74, 35.24, 42.64, 28.99};
    static final double SHELL[] = {37.34, 35.04, 41.84, 28.20};
    static final double ESSO[] = {37.03, 35.34, 41.55, 29.10};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menu = 0, brand = 0, carType = 0;
        double amount = 0.0;

        System.out.println("Gasoline Calculation");
        System.out.println("Program is created by JIKJACK");

        do {
            System.out.println("------------------- Menu -------------------");
            System.out.println("1. Check In");
            System.out.println("2. Print Receipt");
            System.out.println("3. Print Tax Invoice");
            System.out.println("0. ESC.");
            System.out.print("Please Enter Menu [0-3] : ");

            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    brand = checkIn();
                    carType = getCar();
                    amount = getAmount();
                    break;
                case 2:
                    printReceipt(brand, carType, amount);
                    break;
                case 3:
                    printTaxInvoice(brand, carType, amount);
                    break;
            }

        } while (menu != 0);
        System.out.println("Good luck ;D");
    }//end main

    static int checkIn() {
        Scanner sc = new Scanner(System.in);

        int brand = 0;

        System.out.println("------------------- Petrol Brand -------------------");
        System.out.println("1. PTT\t\t(ปตท)");
        System.out.println("2. BCP\t\t(บางจาก)");
        System.out.println("3. Shell\t(เซลล์)");
        System.out.println("4. Esso \t(เอสโซ่)");
        System.out.print("Please Select Petrol Brand : ");

        brand = sc.nextInt();
        return brand;

    }//end checkIn

    static int getCar() {
        Scanner sc = new Scanner(System.in);
        int carType = 0;

        System.out.println("------------------- Car Type -------------------");
        System.out.println("1. Sedan\tรถเก๋ง");
        System.out.println("2. pickup truck\tรถกระบะ");
        System.out.print("Please Enter Car Type : ");

        carType = sc.nextInt();
        if (carType == 1) {
            carType = getPetro();
        } else if (carType == 2   ) {
            carType = 4;
        } else {
            getCar();
        }

        return carType;

    }//end getCar

    static int getPetro() {
        Scanner sc = new Scanner(System.in);
        int petroType = 0;

        System.out.println("------------------- Petro Type -------------------");
        System.out.println("1. Gasohol 95");
        System.out.println("2. Gasohol 91");
        System.out.println("3. Benzin 91");
        System.out.print("Please Enter Petro Type : ");

        petroType = sc.nextInt();

        return petroType;
    }//end getPetro

    static double getAmount() {
        Scanner sc = new Scanner(System.in);
        double amount = 0.0;

        System.out.print("Please Enter Amount : ");

        amount = sc.nextDouble();
        return amount;
    }//end getAmount

    static void printReceipt(int brand, int carType, double amount) {

        double litre = 0.0;
        double price = getPrice(brand, carType);
        litre = amount / price;

        System.out.println("\t--------------------------------------------");
        System.out.print("\t");
        switch (brand) {
            case 1:
                System.out.println("PTT Gas Station");
                break;
            case 2:
                System.out.println("BCP Gas Station");
                break;
            case 3:
                System.out.println("Shell Gas Station");
                break;
            case 4:
                System.out.println("Esso Gas Station");
                break;
        }//end switch

        System.out.println("\tReceipt");
        System.out.println("\t--------------------------------------------");
        System.out.println("\tHDS\t" + String.format("%.1f", litre) + " Litre\t" + amount + " Baht");
        System.out.println("\t--------------------------------------------");

    }//end printReceipt

    static void printTaxInvoice(int brand, int carType, double amount) {
        double litre = 0.0;
        double price = getPrice(brand, carType);
        litre = amount / price;

        System.out.println("\t--------------------------------------------");
        System.out.print("\t");
        switch (brand) {
            case 1:
                System.out.println("PTT Gas Station");
                break;
            case 2:
                System.out.println("BCP Gas Station");
                break;
            case 3:
                System.out.println("Shell Gas Station");
                break;
            case 4:
                System.out.println("Esso Gas Station");
                break;
        }//end switch

        System.out.println("\tTax Invoice");
        System.out.println("\t--------------------------------------------");
        System.out.println("\tHDS\t" + String.format("%.1f", litre) + " Litre\t" + amount + " Baht");
        System.out.println("\tAmount : " + String.format("%.0f", (amount - (amount / 1.07) * 0.07)));
        System.out.println("\tVAT 7% : " + String.format("%.0f", ((amount / 1.07) * 0.07)));
        System.out.println("\tTotal Amount : " + String.format("%.2f", amount));
        System.out.println("\t--------------------------------------------");

    }//end printTaxInvoice

    static double getPrice(int brand, int carType) {
        double price = 0.0;
        carType--;

        switch (brand) {
            case 1:
                price = PTT[carType];
                break;
            case 2:
                price = BCP[carType];
                break;
            case 3:
                price = SHELL[carType];
                break;
            case 4:
                price = ESSO[carType];
                break;
        }
        return price;
    }//end getPrice

}//end class