package ru.gb.java_core.homework5.task1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;


public class FileBackup {
    private File sourceDirectory;
    private File backupDirectory;


    public void createBackup(String sourceDir) throws IOException {
        sourceDirectory = new File(sourceDir);
        backupDirectory = new File(sourceDirectory, "backup");

        if (!backupDirectory.exists()){
            if (!backupDirectory.mkdir()){
                throw new IOException("Failed to create backup");
            }
        }

        File[] files = sourceDirectory.listFiles();
        if (files != null){
            for (File file : files){
                if (file.isFile()){
                    Path sourcePath = file.toPath();
                    Path backupPath = new File(backupDirectory, file.getName()).toPath();
                    Files.copy(sourcePath, backupPath, StandardCopyOption.REPLACE_EXISTING);
                }
            }
        }
    }
}
