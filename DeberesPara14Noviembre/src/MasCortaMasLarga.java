import javax.swing.*;

public class MasCortaMasLarga {
    public static void main(String[] args) {

        int cantidadPalabras=3;//Integer.parseInt(JOptionPane.showInputDialog("Cuantas palabras vas a ingresar:"));
        System.out.println("La cantidad de palabras es: "+cantidadPalabras);
        String palabra="";

        for (int i = 1; i < cantidadPalabras+1; i++) {
            palabra=JOptionPane.showInputDialog("Introduce palabra: ");
            System.out.println("Palabra "+i+": "+palabra);
                        
        }

        System.out.println("La palabra más larga es: ");
        System.out.println("La palabra más corta es: ");
    }
}
