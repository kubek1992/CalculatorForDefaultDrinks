package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj swoją wagę [kg]");
        int weight = skaner.nextInt();
        System.out.println("Podaj swój wzrost [cm]");
        int height = skaner.nextInt();
        System.out.println("Podaj swój wiek");
        int age = skaner.nextInt();
        System.out.println("podaj swoją płeć Men/Women");
        String sex = skaner.next();

        System.out.println("Kalkulator alkoholowy - stezenie procentowe drinka");
        System.out.println("Oblicz ile mocy miał Twój drink");
        System.out.println("");
        System.out.println("Wprowadz pojemnosc szklanki");
        int pojSzkla = skaner.nextInt();
        System.out.println("Wprowadz moc alkoholu");
        int mocAlkoholu= skaner.nextInt();
        System.out.println("wprowadz ilosc alkoholu");
        int iloscAlkoholu = skaner.nextInt();
        int iloscNapoju = pojSzkla-iloscAlkoholu;

        int mocDrinka = (iloscAlkoholu*mocAlkoholu)/pojSzkla;

        System.out.println("Moc Twojego drinka to "+(iloscAlkoholu*mocAlkoholu)/pojSzkla+" %");

        System.out.println("Wprowadz ilosc wypitych drinkow");
        int ilosc = skaner.nextInt();

        int iloscCzystegoWypitego = (int) (ilosc*pojSzkla*mocDrinka*0.79*0.01);
        System.out.println(iloscCzystegoWypitego+"g");

        int UWRM = (int) 0.7;
        int UWRW = (int) 0.6;

        int TBWM = (int) ((int) 2.447 - (0.09156*age)+(0.1074*height)+(0.3362*weight));
        int TBWW = (int) (2.097+(0.1069*height)+(0.2466*weight));
        System.out.println("Podaj ilosc godzin picia alkoholu");
        int time = skaner.nextInt();

        if (sex.equalsIgnoreCase("MEN")) {
            System.out.println("zawartosc alkoholu we krwi w promilach to " +((iloscCzystegoWypitego / TBWM) * 0.8 - (time * 0.15))+"‰");
        }else {
            System.out.println("zawartosc alkoholu we krwi w promilach to " +((iloscCzystegoWypitego / TBWW) * 0.8 - (time * 0.15))+"‰");
        }
        System.out.println("Kalkulator pokazuje zawartość alkoholu we krwi po upływie czasu picia");













    }
}
