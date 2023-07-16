package adapter;

import adapter.docx_handler.DocxFilesHandler;
import adapter.docx_handler.DocxHandlerImpl;
import adapter.pdf_handler.AdapterDocxToPdf;
import adapter.pdf_handler.PdfFilesHandler;


/**
 * Адаптер - является первым типом интерфейса, к которому хотим привести второй интерфейс.
 * Содержит ассоциацию - интерфейс второго типа.
 * */
public class Main {

    public static void main(String[] args) {
        DocxFilesHandler docxHandler = new DocxHandlerImpl();
        docxHandler.handleDocx("docx file");

        System.out.println("\n===================================================\n");

        PdfFilesHandler pdfFilesHandler = new AdapterDocxToPdf(docxHandler);
        pdfFilesHandler.handlePdf("docx file");
    }
}
