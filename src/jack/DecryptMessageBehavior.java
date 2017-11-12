package jack;

public class DecryptMessageBehavior implements CryptingBehaviors {
    @Override
    public String crypt(String msg, String key) {
        StringBuilder decryptedMsg = new StringBuilder();
        int keyPos = 0;

        for(int i = 0; i < msg.length(); i++) {
            char decryptedChar = (char) (msg.charAt(i) - key.charAt(keyPos));
            decryptedMsg.append(decryptedChar);
            keyPos++;
            if(keyPos==key.length()) keyPos = 0;
        }
        return decryptedMsg.toString();
    }
}
