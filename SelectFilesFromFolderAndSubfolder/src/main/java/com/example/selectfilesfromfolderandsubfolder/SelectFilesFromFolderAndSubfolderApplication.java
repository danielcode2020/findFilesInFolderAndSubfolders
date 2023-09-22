package com.example.selectfilesfromfolderandsubfolder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SelectFilesFromFolderAndSubfolderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SelectFilesFromFolderAndSubfolderApplication.class, args);
        MyFileService.getAllFiles();
    }

}
