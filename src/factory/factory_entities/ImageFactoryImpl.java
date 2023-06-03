package factory.factory_entities;

import factory.images.DocImage;
import factory.images.Image;
import factory.images.PdfImage;
import factory.images.XlxImage;

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
