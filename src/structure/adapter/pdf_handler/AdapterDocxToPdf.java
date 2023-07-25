package structure.adapter.pdf_handler;

import structure.adapter.docx_handler.DocxFilesHandler;

public class AdapterDocxToPdf implements PdfFilesHandler {

    private final DocxFilesHandler docxFilesHandler;

    public AdapterDocxToPdf(DocxFilesHandler docxFilesHandler) {
        this.docxFilesHandler = docxFilesHandler;
    }

    @Override
    public void handlePdf(String file) {
        String pdf = "Handle in pdf...\n";
        this.docxFilesHandler.handleDocx(pdf + file);
    }
}
