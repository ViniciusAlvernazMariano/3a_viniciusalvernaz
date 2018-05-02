package br.edu.ifro;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TarefaController implements Initializable {
    
    @FXML
    private TextField txt1, txt2, txtResult;
    
    @FXML
    private Button btnAdicao, btnSubtracao, btnMultiplicacao, btnDivisao;
    
    @FXML
    private Label lbln1, lbln2;
    @FXML
    private Label lblresult;
    
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

    @FXML
    private void abrirCadastroAluno(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("Aluno.fxml"));
            Scene scene = new Scene(fxmlLoader.load(),900,682);
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Aluno");
            stage.setScene(scene);
            stage.show();
        }
        catch(IOException e){

}
    }

    @FXML
    private void fecharProjeto(ActionEvent event) {
    }
    
}
