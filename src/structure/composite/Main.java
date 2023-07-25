package structure.composite;

import structure.composite.documents.Document;
import structure.composite.documents.PdfDocument;
import structure.composite.documents.WordDocument;
import structure.composite.printer.DocPrinter;
import structure.composite.printer.Printer;

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
