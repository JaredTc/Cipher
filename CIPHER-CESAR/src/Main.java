import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        v1 console
//       String message = "fuck society";
//
//       int displacement = 3;
//       CesarCipher cc = new CesarCipher();
//
//       String ciphmessahe = cc.cipherCesar(message,displacement);
//       String descipher = cc.decipherCesar(ciphmessahe,displacement);
//
//        System.out.printf("Cipher Message: " + ciphmessahe + "\n");
//        System.out.printf("Descipher Message: " + descipher + "\n");
//        JOptionPane.showMessageDialog(null, "Cipher Message: " + ciphmessahe, );


//        v2 gui

        String message = JOptionPane.showInputDialog("Ingrese el mensaje a cifrar:");
        int displacement = 3;
        CesarCipher cc = new CesarCipher();

        String ciphmessahe = CesarCipher.cipherCesar(message,displacement);
        String descipher = CesarCipher.decipherCesar(ciphmessahe,displacement);

        String resultado = "Mensaje original: " + message + "\nMensaje cifrado: " + ciphmessahe
                + "\nMensaje descifrado: " + descipher;

        JOptionPane.showMessageDialog(null, resultado);

        }
    }
