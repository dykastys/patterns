package structure.composite.printer;

import structure.composite.documents.Document;

public interface Printer {

    void add(Document document);

    void remove(Document document);

    void clear();

    void printDocumentsToConsole();
}
