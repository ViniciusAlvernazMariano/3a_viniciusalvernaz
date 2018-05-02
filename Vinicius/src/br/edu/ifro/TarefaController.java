package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TarefaController implements Initializable {
    
    @FXML
    private TextField txt1, txt2, txtResult;
    
    @FXML
    private Button btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao;
    
    @FXML
    private Label lbln1, lbln2, lblResult;
    
    @FXML
    private void Adicao(ActionEvent event) {
        Double N1 = Double.parseDouble(txt1.getText());
        Double N2 = Double.parseDouble(txt2.getText());
        Double resultado= N1 + N2;
        txtResult.setText(resultado.toString());
    }
    @FXML
    private void Subtracao(ActionEvent event) {
        Double N1 = Double.parseDouble(txt1.getText());
        Double N2 = Double.parseDouble(txt2.getText());
        Double resultado= N1 - N2;
        txtResult.setText(resultado.toString());
    }
    
    @FXML
    private void Multiplicacao(ActionEvent event) {
        Double N1 = Double.parseDouble(txt1.getText());
        Double N2 = Double.parseDouble(txt2.getText());
        Double resultado= N1 * N2;
        txtResult.setText(resultado.toString());
    }
    @FXML
    private void Divisao(ActionEvent event) {
        Double N1 = Double.parseDouble(txt1.getText());
        Double N2 = Double.parseDouble(txt2.getText());
        Double resultado= N1 / N2;
        txtResult.setText(resultado.toString());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
