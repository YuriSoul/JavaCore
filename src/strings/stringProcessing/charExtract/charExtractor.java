package strings.stringProcessing.charExtract;

public class charExtractor {
    String str; //строка для извлечения символов
    int indexCh; //индекс символа строки для извлечения
    char ch; //извлекаемый символ

    charExtractor(String str, int indexCh){
        this.str = str;
        this.indexCh = indexCh;
    }

    //для извлечения из строки одного из символов используют метод char charAt(int where)
    // - где where индекс символа который необходимо извлечь
    char extractCh(){
        return ch = str.charAt(indexCh);
    }

    void printExtractedChar(){
        System.out.println("В сторке " + str + " " + indexCh + "-й символ " + ch);
    }

    public static void main(String[] args) {
        charExtractor charExtractor = new charExtractor("Крамбамбулька", 13);
        charExtractor.extractCh();
        charExtractor.printExtractedChar();
    }
}
