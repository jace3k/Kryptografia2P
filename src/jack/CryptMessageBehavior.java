package jack;

public class CryptMessageBehavior implements CryptingBehaviors {
    char xorKey;

    @Override
    public String crypt(String msg, String key) {
        StringBuilder cryptedMsg = new StringBuilder();
        int keyPos = 0;
        xorKey = key.charAt(key.length()-1);

        for(int i = 0; i < msg.length(); i++) {
            char cryptedChar = (char) (msg.charAt(i) + key.charAt(keyPos));
            char xorChar = (char) (cryptedChar ^ xorKey);

            cryptedMsg.append(xorChar);
            keyPos++;
            if(keyPos == key.length()) keyPos = 0;
        }
        return cryptedMsg.toString();
    }
}
