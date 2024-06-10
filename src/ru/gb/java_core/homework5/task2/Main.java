package ru.gb.java_core.homework5.task2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 3, 1, 0, 2, 3};
        try {
            writeArrayToFile(array, "src/ru/gb/java_core/homework5/task2/.bin");
        } catch (IOException e ){
            e.printStackTrace();
        }
    }

    public static void writeArrayToFile(int[] array, String fileName) throws IOException {
        if (array.length != 9){
            throw  new IllegalArgumentException("There are not 9 elements in array.");
        }

        int packedData = 0;

        for (int i = 0; i < array.length; i++ ){
            packedData <<= 2;
            packedData |= (array[i] & 0x3);
        }
        try (FileOutputStream fos = new FileOutputStream(fileName)){
            fos.write((packedData >> 16) & 0xFF);
            fos.write((packedData >> 8) & 0xFF);
            fos.write(packedData  & 0xFF);
        }
    }
}
