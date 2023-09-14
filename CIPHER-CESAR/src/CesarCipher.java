public class CesarCipher {
    public static String cipherCesar(String message, int displacement){
        StringBuilder cipherMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++){
            char character = message.charAt(i);

            if (Character.isLetter(character)){
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                character = (char) (base + (character - base + displacement) % 26);

            }
            cipherMessage.append(character);

        }
        return cipherMessage.toString();
    }

    public static String decipherCesar(String cipherMessage, int displacement){
        return cipherCesar(cipherMessage, -displacement);
    }

}
