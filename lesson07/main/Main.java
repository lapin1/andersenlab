package com.andersenlab.lesson07.main;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        AppData appData;
        File file = new File("src/main/java/com/andersenlab/lesson07/main/file.csv");
        FileWorker fileWorker = new FileWorker();

        //write to file
        AppData appData1 = new AppData();
        appData1.setHeader(new String[]{"test1", "test2", "test3"});
        appData1.setData(new int[][]{{11, 22, 33}, {33, 44, 55}});

        fileWorker.writeToFile(file, appData1);


        //read from file
        String[][] data = fileWorker.getDataArrayFromFile(file);

        appData = fileWorker.getObjectOfData(data);
        System.out.println(appData);

    }
}
