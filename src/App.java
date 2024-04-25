import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String palabra = "malintencionado";
        int intentosMaximos = palabra.length();
        int intentos = 0;

        // Para formar la palabra utilizo un arreglo
        char palabraFormada[] = new char[palabra.length()];

        // Inicializo la palabra con todo guiones
        for (int i = 0; i < palabraFormada.length; i++) {
            palabraFormada[i] = '-';
        }

        char letra;
        boolean letraCorrecto = false;
        boolean palabraEncontrada = false;

        while (!palabraEncontrada && intentos < intentosMaximos) {
            System.out.println("Palabra: " + String.valueOf(palabraFormada));
            System.out.println("Tenes " + (intentosMaximos - intentos) + " intentos.");

            System.out.print("Ingrese una letra: ");
            letra = sc.next().charAt(0);
            letra = Character.toLowerCase(letra);
            letraCorrecto = false;

            for (int i = 0; i < palabra.length(); i++) {
                if (letra == palabra.charAt(i)) {
                    letraCorrecto = true;
                    palabraFormada[i] = letra;
                }
            }

            if (letraCorrecto) {
                System.out.println("Bien ahi, le pegaste :D");
            } else {
                System.out.println("Mal ahi, sos croto D:");
            }
            
            System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

            if (String.valueOf(palabraFormada).equals(palabra)) {
                palabraEncontrada = true;
            }

            intentos++;
        }

        if (palabraEncontrada) {
            System.out.println("QUE GRANDE!!!! ADIVINASTE!!!!");
        } else {
            System.out.println("QUE CROTOO!!!! NO SUPISTE!!!!");
        }

        sc.close();
    }
}
