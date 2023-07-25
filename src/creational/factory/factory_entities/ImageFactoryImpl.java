package creational.factory.factory_entities;

import creational.factory.images.DocImage;
import creational.factory.images.Image;
import creational.factory.images.PdfImage;
import creational.factory.images.XlxImage;

public class ImageFactoryImpl implements ImageFactory {

    @Override
    public Image getImageByDocType(DocType docType) {
        return switch (docType) {
            case PDF -> new PdfImage();
            case DOCX -> new DocImage();
            case XLX -> new XlxImage();
        };
    }
}
