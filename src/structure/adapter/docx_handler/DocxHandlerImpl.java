package structure.adapter.docx_handler;

public class DocxHandlerImpl implements DocxFilesHandler {

    @Override
    public void handleDocx(String file) {
        System.out.println("Handle " + file + " in docx.");
    }
}
