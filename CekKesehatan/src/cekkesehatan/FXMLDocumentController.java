/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Konia Septia
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton laki;
  
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton perempuan;
   
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField bb;
    @FXML
    private JFXTextField tb;
    @FXML
    private JFXTextField ideal;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private Button buttonOk;
    @FXML
    private Button buttonReset;
    

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Proses(ActionEvent event) {
        String Nama = nama.getText();
        int BB = Integer.parseInt(bb.getText());
        int TB = Integer.parseInt(tb.getText());
        String kelamin;
        int editideal = 0;
        String editsaran = null;
        String edithasil = null;
        
        if (laki.isSelected())
            kelamin = "laki-laki";
        else if (perempuan.isSelected())
            kelamin = "perempuan";
        else kelamin = " ";
        
        if (laki.isSelected())
            editideal = TB - 110;
            else if (perempuan.isSelected())
                editideal = TB - 100;
        
        if (BB == editideal){
            edithasil = "ideal";
            editsaran = "bagus sekali \n tetap jaga badan";
        }
        else if (BB >= editideal){
            edithasil = "gendut";
            editsaran = "jangan banyak makan \n jangan banyak tidur \n jangan minum susu";        
        }
        else if (BB <= editideal){
            edithasil = "kurus";
            editsaran = "makan yang banyak \n minum susu yang banyak \n istirahat yang cukup";        
        }
        
      hasil.setText("Nama : "+Nama+"\nBerat Badan : "+BB+"\nTinggi Badan : "+TB+"\nJenis Kelamin : "+kelamin+"\n");
      ideal.setText(""+editideal);
      saran.setText(""+editsaran);
    }

    @FXML
    private void Hapus(ActionEvent event) {
        hasil.setText("");
        nama.setText("");
        bb.setText("");
        tb.setText("");
        ideal.setText("");
        saran.setText("");
        laki.setSelected(false);
        perempuan.setSelected(false);
    }

    @FXML
    private void action_L(ActionEvent event) {
       
    }

    @FXML
    private void action_P(ActionEvent event) {
     
    }
    
    
}
