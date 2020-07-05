package pl.sda.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class LogWriterSingleton {

    private static volatile LogWriterSingleton instance;

    private LogWriterSingleton() {

    }

    public static LogWriterSingleton getInstance() {
        if (instance == null) {

            synchronized (LogWriterSingleton.class) {
                if (instance == null) {
                    instance = new LogWriterSingleton();
                }
            }
        }
        return instance;
    }

    public void log(String text) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("log.txt",true));

            bw.write(LocalDate.now().toString()+" ");
            bw.write(text);
            bw.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bw!=null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
