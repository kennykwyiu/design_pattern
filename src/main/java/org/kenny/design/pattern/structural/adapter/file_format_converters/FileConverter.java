package org.kenny.design.pattern.structural.adapter.file_format_converters;

public interface FileConverter {
    void convertFile(String inputFilePath, String outputFilePath);
}
