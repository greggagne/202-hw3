import java.util.Scanner;

public class SymbolMatching {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a phrase: ");
        String phrase = keyboard.nextLine();

        // the list of symbols in the phrase
        Scanner symbolList  = new Scanner(phrase);

        String symbol; // a symbol may be a word or a #

        while (symbolList.hasNext()) {
            symbol = symbolList.next();

            System.out.println(symbol);
        }


    }
}
