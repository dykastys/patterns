package composite.documents;

public class PdfDocument implements Document{

    private final String text;

    public PdfDocument(String text) {
        this.text = text;
    }

    @Override
    public void showDocInfo() {
        System.out.println(text);
    }
}
