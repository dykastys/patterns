package factory.factory_entities;

import factory.images.Image;

public interface ImageFactory {

    Image getImageByDocType(DocType docType);
}
