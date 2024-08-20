package org.kenny.design.pattern.structural.adapter.word_to_pdf_converter;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordToPDFConverter implements WordFileAdapter {
    @Override
    public void convertToPDF(String inputFileName, String outputFileName) throws IOException {
        try (XWPFDocument doc = new XWPFDocument(Files.newInputStream(Paths.get(inputFileName)));
             PDDocument pdfDoc = new PDDocument()) {
            for (XWPFParagraph paragraph : doc.getParagraphs()) {
                PDPage page = new PDPage();
                pdfDoc.addPage(page);

                try (PDPageContentStream contentStream = new PDPageContentStream(pdfDoc, page)) {
                    contentStream.beginText();
//                    PDType0Font font = PDType0Font.load(pdfDoc, new File("C:\\Users\\User\\Downloads"));
//                    contentStream.setFont(font, 12);
                    contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                    contentStream.newLineAtOffset(100, 700);
                    contentStream.showText(paragraph.getText());
                    contentStream.endText();
                } catch (IOException e) {
                    System.err.println("Error writing content to PDF: " + e.getMessage());
                }
            }

            pdfDoc.save(outputFileName);
        } catch (IOException e) {
            System.err.println("Error saving PDF file: " + e.getMessage());
        }
    }
}

