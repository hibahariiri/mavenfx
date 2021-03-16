package org.example;
import java.io.*;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class FileMaker {

    HashMap<String, String> cprTilFIl = new HashMap<String, String>();
    public void readFile(String tf) {
        try {
            File file = new File("/Users/hiba/IdeaProjects/mavenfx/data/" + tf);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String cpr = data.substring(0,11);
                String navn = data.substring(11);
                cprTilFIl.put(cpr,navn + ".txt");
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void writeToFile(String tf) {
        try{
            LocalDate date = LocalDate.now();
            FileWriter myWriter = new FileWriter("/Users/hiba/IdeaProjects/mavenfx/data/" + tf, true);
            SensorPulsoxi sensorPulsoxi = new SensorPulsoxi();
            PrintWriter pw = new PrintWriter(myWriter);
            SensorTemp st = new SensorTemp();

            pw.println(date + " " + "SpO2: " + sensorPulsoxi.SpO2());
            pw.println(date + " " + "Puls: " + sensorPulsoxi.puls());
            pw.println(date + " " + "Temperatur: " + st.temperaturB());
            pw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public HashMap<String, String> getCprTilFIl() {
        return cprTilFIl;
    }
}
