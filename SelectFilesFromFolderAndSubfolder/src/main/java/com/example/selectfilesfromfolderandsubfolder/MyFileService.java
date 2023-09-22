package com.example.selectfilesfromfolderandsubfolder;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;


@Service
public class MyFileService {

    public static void getAllFiles(){
        var path = Path.of("src/main/resources/test");
        try (var collected = Files.walk(path).filter(Files::isRegularFile)) {
            var files = collected.collect(Collectors.toSet());
            files.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
