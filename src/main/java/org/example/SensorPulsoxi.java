package org.example;

import java.util.Random;

public class SensorPulsoxi {

    public int puls() {

        //under 50 bradykardi, hvis over 100 er det tarkykardi.

        Random r = new Random();

        double Minpuls = 45;
        double Maxpuls = 105;
        double puls = Minpuls + (Maxpuls - Minpuls)* r.nextDouble();

        return (int) puls;

    }

    public double SpO2(){

        Random r = new Random();

        double Minspo2 = 95;
        double Maxspo2 = 100;
        double spo2 = Minspo2 + (Maxspo2 - Minspo2)* r.nextDouble();

        return spo2;

    }



}
