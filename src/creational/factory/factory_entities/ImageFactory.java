package creational.factory.factory_entities;

import creational.factory.images.Image;

public interface ImageFactory {

    Image getImageByDocType(DocType docType);
}
