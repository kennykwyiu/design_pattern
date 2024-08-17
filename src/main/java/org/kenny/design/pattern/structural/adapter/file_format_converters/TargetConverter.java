package org.kenny.design.pattern.structural.adapter.file_format_converters;

public interface TargetConverter {
    void convert(String inputFilePath, String outputFilePath);
}
