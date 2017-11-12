package jack;

public class DecryptMessageBehavior implements CryptingBehaviors {
    char xorKey;

    @Override
    public String crypt(String msg, String key) {
        StringBuilder decryptedMsg = new StringBuilder();
        int keyPos = 0;
        xorKey = key.charAt(key.length()-1);

        for(int i = 0; i < msg.length(); i++) {
            char xorChar = (char) (msg.charAt(i) ^ xorKey);
            char decryptedChar = (char) (xorChar - key.charAt(keyPos));

            decryptedMsg.append(decryptedChar);
            keyPos++;
            if(keyPos == key.length()) keyPos = 0;
        }
        return decryptedMsg.toString();
    }
}
