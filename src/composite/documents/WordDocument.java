package composite.documents;

public class WordDocument implements Document {

    private final String text;

    public WordDocument(String text) {
        this.text = text;
    }

    @Override
    public void showDocInfo() {
        System.out.println(text);
    }
}
