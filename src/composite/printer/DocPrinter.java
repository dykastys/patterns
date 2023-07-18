package composite.printer;

import composite.documents.Document;

import java.util.ArrayList;
import java.util.List;

public class DocPrinter implements Printer {

    private List<Document> documents = new ArrayList<>();

    @Override
    public void add(Document document) {
        this.documents.add(document);
    }

    @Override
    public void remove(Document document) {
        this.documents.remove(document);
    }

    @Override
    public void clear() {
        this.documents = new ArrayList<>();
    }

    @Override
    public void printDocumentsToConsole() {
        System.out.println("Show all documents by printer...\n");
        this.documents.forEach(Document::showDocInfo);
    }
}
