import java.util.Scanner;

public class SentanceReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sentence = sc.next();
        int length = 0;
        while (sentence.charAt(length) != '\0'){
            length++;
            if (length == sentence.length()){
                break;
            }
            char[] reversed = new char[length];
            for (int i=0; i<length; i++){
                reversed[i] = sentence.charAt(length -1 -i);
            }
            System.out.println("Reversed sentance:" );
            for (char c : reversed){
                System.out.print(c);
            }
            System.out.println();


        }
    }
}
