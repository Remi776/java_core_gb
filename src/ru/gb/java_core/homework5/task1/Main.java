package ru.gb.java_core.homework5.task1;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileBackup fileBackup = new FileBackup();
        try {
            fileBackup.createBackup("src/ru/gb/java_core/homework5/task1");
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
