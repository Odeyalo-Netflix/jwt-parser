package com.odeyalo.netflix.jwt;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleFileReader implements FileReader {

    @Override
    public byte[] readFile(Path path) throws IOException {
        return Files.readAllBytes(path);
    }
}
