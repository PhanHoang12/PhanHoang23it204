package Gkk;

public class Main {
	 public static void main(String[] args) {
	        TextEditorView view = new TextEditorView();
	        Document document = new Document();
	        TextEditorController controller = new TextEditorController(document, view);
	        controller.openDocument();
	    }
}
