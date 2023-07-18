package composite;

import composite.documents.Document;
import composite.documents.PdfDocument;
import composite.documents.WordDocument;
import composite.printer.DocPrinter;
import composite.printer.Printer;

/**
 * Композит - группирует несколько объектов в древовидную структуру используя один класс.
 * Позволяет работать с несколькими классами через один объект.
 * */
public class Main {

    public static void main(String[] args) {
        Printer printer = new DocPrinter();

        Document firstWordDocument = new WordDocument("first word document's text");
        Document secondWordDocument = new WordDocument("second word document's text");
        Document pdfDocument = new PdfDocument("pdf document's text");

        printer.add(firstWordDocument);
        printer.add(secondWordDocument);
        printer.add(pdfDocument);

        printer.printDocumentsToConsole();
    }
}
