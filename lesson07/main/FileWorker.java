package com.andersenlab.lesson07.main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileWorker {

    public static boolean isFileEmpty(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        return br.readLine() == null;
    }

    //read csv file
    public String[][] getDataArrayFromFile(File file) {
        List<String[]> rows = null;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            rows = new ArrayList<>();
            String data;

            while ((data = reader.readLine()) != null) {
                rows.add(data.split(";"));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        return rows.toArray(new String[rows.size()][]);
    }

    //get header from array of data
    public String[] getHeaderFromData(String[][] data) {
        return data[0];
    }

    //get int data from array of data
    public int[][] getDataFromDataArray(String[][] data) {
        int[][] intData = new int[data.length - 1][data.length];

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                intData[i - 1][j] = Integer.parseInt(data[i][j]);
            }
        }

        return intData;
    }

    //create appData object
    public AppData getObjectOfData(String[][] data) {
        AppData appData = new AppData();
        appData.setHeader(getHeaderFromData(data));
        appData.setData(getDataFromDataArray(data));

        return appData;
    }

    //write to csv
    public void writeToFile(File file, AppData appData) {
        BufferedWriter writer = null;
        StringBuilder stringBuilder;

        try {
            writer = new BufferedWriter(new FileWriter(file));
            stringBuilder = new StringBuilder();

            for (int i = 0; i < appData.getHeader().length; i++) {
                stringBuilder.append(appData.getHeader()[i]).append(";");
            }
            for (int i = 0; i < appData.getData().length; i++) {
                stringBuilder.append('\n');
                for (int j = 0; j < appData.getData()[i].length; j++) {
                    stringBuilder.append(appData.getData()[i][j]).append(";");
                }
            }
            writer.write(stringBuilder.toString());
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
