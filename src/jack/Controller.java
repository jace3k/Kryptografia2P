package jack;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TextField cryptoMsgRead;
    public TextField cryptoMsgWrite;
    public TextField cryptoKey;
    public TextField decryptoKey;
    public TextField decryptoMsgWrite;
    public TextField decryptoMsgRead;

    private Cryptogram cryptogram;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cryptogram = new Cryptogram();
    }


    public void makeReset(ActionEvent actionEvent) {
        cryptoMsgRead.setText("");
        cryptoMsgWrite.setText("");
        cryptoKey.setText("");

        decryptoMsgRead.setText("");
        decryptoMsgWrite.setText("");
        decryptoKey.setText("");
    }

    public void makeCrypt(ActionEvent actionEvent) {
        String message = cryptoMsgWrite.getText();
        cryptogram.setKey(cryptoKey.getText());
        String cryptedMsg = cryptogram.cryptMessage(message);
        cryptoMsgRead.setText(cryptedMsg);
    }

    public void makeDecrypt(ActionEvent actionEvent) {
        String message = decryptoMsgWrite.getText();
        cryptogram.setKey(decryptoKey.getText());
        String decryptedMsg = cryptogram.decryptMessage(message);
        decryptoMsgRead.setText(decryptedMsg);

    }

}
