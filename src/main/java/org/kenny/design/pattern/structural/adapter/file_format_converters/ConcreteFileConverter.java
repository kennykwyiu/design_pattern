package org.kenny.design.pattern.structural.adapter.file_format_converters;

public class ConcreteFileConverter implements FileConverter {
    public void convertFile(String inputFilePath, String outputFilePath) {
        System.out.println("Converting file from " + inputFilePath + " to " + outputFilePath);
    }
}
