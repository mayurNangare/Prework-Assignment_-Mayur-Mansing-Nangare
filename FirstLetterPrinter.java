import java.util.Scanner;

public class FirstLetterPrinter {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Sentence to extract the first letters of each word :");
        String strInput = scan.nextLine();

        // Method call;
        firstLetterPrinter(strInput);

    }

    //Method to split the sentence and add it to  array;
    public static void firstLetterPrinter(String str){

        String firstLetters[] = str.split(" ");

        for(int i = 0; i< firstLetters.length;i++){

            String extractedLetters = firstLetters[i];
            System.out.print(extractedLetters.charAt(0));
        }
    }
}
