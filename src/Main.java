import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder frase = new StringBuilder();
        String palabra;

        while (!(palabra = sc.nextLine()).equalsIgnoreCase("FIN")) {
            frase.append(palabra).append(" ");
        }

        System.out.println(frase.toString().trim());
    }
}