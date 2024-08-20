package org.kenny.design.pattern.structural.adapter.word_to_pdf_converter;

import java.io.IOException;

public class WordToPDFConverterApp {
    public static void main(String[] args) {
        WordFileAdapter converter = new WordToPDFConverter();

        String inputFileName = "C:\\Users\\User\\Downloads\\AZ004020_D_form_draft.docx";
        String outputFileName = "output.pdf";

        try {
            converter.convertToPDF(inputFileName, outputFileName);
            System.out.println("Conversion completed successfully!");
        } catch (IOException e) {
            System.err.println("Error duringconversion: " + e.getMessage());
        }
    }
}
