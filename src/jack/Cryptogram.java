package jack;

public class Cryptogram {
    private String key;
    private CryptingBehaviors cryptingBehavior;


    public String cryptMessage(String msg) {
        setCryptingBehavior(new CryptMessageBehavior());
        return cryptingBehavior.crypt(msg, key);
    }

    public String decryptMessage(String msg) {
        setCryptingBehavior(new DecryptMessageBehavior());
        return cryptingBehavior.crypt(msg, key);
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setCryptingBehavior(CryptingBehaviors cryptingBehavior) {
        this.cryptingBehavior = cryptingBehavior;
    }
}
