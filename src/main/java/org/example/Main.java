package org.example;


import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;

public class Main {

    private static Object SensorPulsoxi;

    public static void main(String[] args) throws FileNotFoundException {

        DecimalFormat numberFormat = new DecimalFormat("#.00");
        SensorTemp ST = new SensorTemp();
        SensorPulsoxi SP = new SensorPulsoxi();
        Scanner Tastatur = new Scanner(System.in);

        //Her kan man indtaste sin alder.
        System.out.println("Indtast din alder: ");
        int alder;
        alder = Tastatur.nextInt();
        Tastatur.nextLine();

        if (alder <= 11) {
            System.out.println("Du er barn, og din temperatur ligger på: " + numberFormat.format(ST.temperaturB()));
        } else {
            System.out.println("Du er voksen, og din temperatur ligger på: " + numberFormat.format(ST.temperaturV()));
        }

        System.out.println("Din puls ligger på: " + SP.puls());

        System.out.println("Din iltmætning ligger på: " + numberFormat.format(SP.SpO2()) + "%");

        SensorPulsoxi SensorPulsoxi = new SensorPulsoxi();

        /*FileMaker fm = new FileMaker();

        fm.readFile("CPRNR.txt");
        System.out.println(fm.getCprTilFIl());
        fm.writeToFile(fm.getCprTilFIl().get("130572-0232"));

         */
    }
}


//* Her tastes cpr det ind med bindesteg
// cpr = cpr.substring(0,6)+"-"+cpr.substring(6,10);         System.out.println(cpr);



