package org.kenny.design.pattern.structural.adapter.file_format_converters;

public class FileFormatAdapter implements TargetConverter {
    private FileConverter fileConverter;

    public FileFormatAdapter(FileConverter fileConverter) {
        this.fileConverter = fileConverter;
    }

    public void convert(String inputFilePath, String outputFilePath) {
        fileConverter.convertFile(inputFilePath, outputFilePath);
    }
}
