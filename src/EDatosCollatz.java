
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author andres
 */
public class EDatosCollatz {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n, l = 1, mayor = 0;

        do {
            n = Integer.parseInt(bf.readLine()); //lectura
        } while (n < 1 || n > 1000000); //mientras sea menor que 1 o mientras sea mayor que 1 millon volvemos a pedir el valor

        for (int i = 0; n > 1; i++) { //ciclo mientras n sea mayor que 1

            if (n > mayor) { //si n es mayor lo guardamos en mayor
                mayor = n;
            }

            l++;
            //System.out.println(n+", ");

            if (n % 2 != 0) { //si es impar

                n = (3 * n) + 1;  //entonces lo multiplicamos por 3 y le sumamos 1
            } else { //si no es impar

                n = n / 2; //lo dividimos entre 2
            }
        }

        System.out.println(l + " " + mayor); //mostramos resultados del algoritmo
    }

}
