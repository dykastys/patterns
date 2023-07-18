package composite.printer;

import composite.documents.Document;

public interface Printer {

    void add(Document document);

    void remove(Document document);

    void clear();

    void printDocumentsToConsole();
}
