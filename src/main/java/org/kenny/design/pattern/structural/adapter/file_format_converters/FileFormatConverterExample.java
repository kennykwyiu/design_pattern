package org.kenny.design.pattern.structural.adapter.file_format_converters;

public class FileFormatConverterExample {
    public static void main(String[] args) {
        FileConverter fileConverter = new ConcreteFileConverter();
        TargetConverter targetConverter = new FileFormatAdapter(fileConverter);

        targetConverter.convert("input.docx", "output.pdf");
    }
}
