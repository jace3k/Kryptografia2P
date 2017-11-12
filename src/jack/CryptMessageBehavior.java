package jack;

public class CryptMessageBehavior implements CryptingBehaviors {
    @Override
    public String crypt(String msg, String key) {
        StringBuilder cryptedMsg = new StringBuilder();
        int keyPos = 0;

        for(int i = 0; i < msg.length(); i++) {
            char cryptedChar = (char) (msg.charAt(i) + key.charAt(keyPos));
            cryptedMsg.append(cryptedChar);
            keyPos++;
            if(keyPos==key.length()) {
                keyPos = 0;
            }
        }
        return cryptedMsg.toString();
    }
}
