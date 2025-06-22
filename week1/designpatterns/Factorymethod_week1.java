package week1.designpatterns;

public class Factorymethod_week1 {

    interface Document {
        void open();
    }

    static class WordDocument implements Document {
        public void open() {
            System.out.println("Launching Word Document");
        }
    }

    static class PdfDocument implements Document {
        public void open() {
            System.out.println("Launching PDF Document");
        }
    }

    static class ExcelDocument implements Document {
        public void open() {
            System.out.println("Launching Excel Document");
        }
    }

    // Abstract Factory
    abstract static class DocumentFactory {
        public abstract Document createDocument();
    }

    // Concrete Factory Classes
    static class WordDocFactory extends DocumentFactory {
        public Document createDocument() {
            return new WordDocument();
        }
    }

    static class PdfDocFactory extends DocumentFactory {
        public Document createDocument() {
            return new PdfDocument();
        }
    }

    static class ExcelDocFactory extends DocumentFactory {
        public Document createDocument() {
            return new ExcelDocument();
        }
    }

    public static void main(String[] args) {
        DocumentFactory factory1 = new WordDocFactory();
        Document document1 = factory1.createDocument();
        document1.open();

        DocumentFactory factory2 = new PdfDocFactory();
        Document document2 = factory2.createDocument();
        document2.open();

        DocumentFactory factory3 = new ExcelDocFactory();
        Document document3 = factory3.createDocument();
        document3.open();
    }
}
