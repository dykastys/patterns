package factory.images;

public class PdfImage implements Image {

    @Override
    public void showImage() {
        System.out.println("It's pdf image...");
    }
}
