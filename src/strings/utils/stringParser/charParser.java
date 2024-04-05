package strings.utils.stringParser;

//анализатор символов
public class charParser {

    //алфавит русского языка по типам букв
    char[] vowels = {'а', 'о', 'у', 'ы', 'э', 'я', 'ё', 'ю', 'и', 'е'}; //гласные буквы
    char[] consonants = {'й', 'м', 'н', 'л', 'р', 'б', 'в', 'г', 'д', 'з', //согласные буквы
                        'ж', 'п', 'ф', 'к', 'т', 'с', 'ш', 'х', 'ц', 'ч', 'щ'};
    char[] separatingSigns = {'ь', 'ъ'}; //разделительные знаки

    int counterVowels = 0; //счетчик гласных
    int counterConsonants = 0; //счетчик согласных
    int counterSeparatingSigns = 0; //разделительных знаков

    String word; //слово для буквенного анализа

    charParser(String word){
        this.word = word;
    }

    //счетчик глаcных букв
    void countVowels(char ch){
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == ch) counterVowels++;
        }
    }

    //счетчик соглаcных букв
    void countConsonants(char ch){
        for (int i = 0; i < consonants.length; i++) {
            if (consonants[i] == ch) counterConsonants++;
        }
    }

    //счетчик разделительных знаков
    void countSeparatingSigns(char ch){
        for (int i = 0; i < separatingSigns.length; i++) {
            if (separatingSigns[i] == ch) counterSeparatingSigns++;
        }
    }

    //счетчик типов букв
    void countLetterTypes(){
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            countVowels(ch);
            countConsonants(ch);
            countSeparatingSigns(ch);
        }
    }

    void printResultCount(){
        System.out.println("В слове " + word);
        System.out.println("гласных букв - " + counterVowels);
        System.out.println("согласнысох букв - " + counterConsonants);
        System.out.println("разделительных знаков - " + counterSeparatingSigns);
    }

    void extractCh(){
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            System.out.print("'" + ch + "',");
        }
    }

    public static void main(String[] args) {
        charParser chPars = new charParser("диметилцеллюлоза");
        chPars.countLetterTypes();
        chPars.printResultCount();
    }
}
