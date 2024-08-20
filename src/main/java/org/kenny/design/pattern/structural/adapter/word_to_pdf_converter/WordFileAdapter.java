package org.kenny.design.pattern.structural.adapter.word_to_pdf_converter;

import java.io.IOException;

public interface WordFileAdapter {
    void convertToPDF(String inputFileName, String outputFileName) throws IOException;
}
