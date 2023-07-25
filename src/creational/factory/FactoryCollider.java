package creational.factory;

import creational.factory.factory_entities.DocType;
import creational.factory.factory_entities.ImageFactory;
import creational.factory.factory_entities.ImageFactoryImpl;
import creational.factory.images.Image;

/**
 * Шаблон Factory нужен, когда необходимо создавать объекты различных классов одного интерфейса.
 * Так же, используем, когда где-то нужно использовать SWITCH CASE.
 * */
public class FactoryCollider {

    public static void main(String[] args) {
        Image docImage = getImageByDoc(DocType.DOCX);
        Image pdfImage = getImageByDoc(DocType.PDF);
        Image xlxImage = getImageByDoc(DocType.XLX);

        docImage.showImage();
        pdfImage.showImage();
        xlxImage.showImage();
    }

    private static Image getImageByDoc(DocType docType) {
        ImageFactory imageFactory = new ImageFactoryImpl();
        return imageFactory.getImageByDocType(docType);
    }
}
