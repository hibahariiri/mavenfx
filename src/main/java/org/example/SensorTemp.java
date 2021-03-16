package org.example;

import java.text.DecimalFormat;
import java.util.Random;

public class SensorTemp {

    public double temperaturV() {

        Random r = new Random();

        double Mintempv = 34;
        double Maxtempv = 40;
        double Tempv = Mintempv + (Maxtempv - Mintempv)* r.nextDouble();

        return Tempv;

    }

    public double temperaturB() {

        Random r = new Random();

        double Mintempb = 34;
        double Maxtempb = 41;
        double Tempb = Mintempb + (Maxtempb - Mintempb)* r.nextDouble();

        return Tempb;


    }

    //rigtige måde at bruge math.random
    public double temperatur() {

        Random r = new Random();
        double rangeMin = 10;
        double rangeMax = 100;
        double randomValue = rangeMin + (rangeMax - rangeMin)* r.nextDouble();

        return randomValue;


    }



}
