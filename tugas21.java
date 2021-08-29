import java.util.*;

public class tugas21 {
    public static void main(String args[]) {
        String finaltext = "";
        char alphabet;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan text : ");
        String plaintext = sc.nextLine();
        System.out.print("Jumlah pergeseran : ");
        int shift = sc.nextInt();

        // merubah setiap huruf pada text yang diinputkan
        for (int i = 0; i < plaintext.length(); i++) {
            // membaca setiap huruf
            alphabet = plaintext.charAt(i);

            // merubah huruf lowercase
            if (alphabet >= 'a' && alphabet <= 'z') {
                // menggeser huruf sesua jumlah pergeseran
                alphabet = (char) (alphabet + shift);
                // jika huruf melewati z
                if (alphabet > 'z') {
                    // mengulang dari huruf a
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                finaltext = finaltext + alphabet;
            }

            // merubah huruf uppercase
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                // membaca setiap huruf
                alphabet = (char) (alphabet + shift);

                // jika huruf melewati Z
                if (alphabet > 'Z') {
                    // mengulang dari huruf A
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                finaltext = finaltext + alphabet;
            } else {
                finaltext = finaltext + alphabet;
            }

        }
        System.out.println("Output Text: " + finaltext);
    }
}