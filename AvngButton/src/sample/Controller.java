package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField buton;
    @FXML
  private Button hulk;
    @FXML
    private Button Ironman;
    @FXML
    private Button Antman;
    @FXML
    private Button captain;



    public void Buton(ActionEvent e){
        if(e.getSource().equals(captain)){
            System.out.println("Captain was clicked by: "+buton.getText());
        }
        else if(e.getSource().equals(hulk)){
            System.out.println("hulk was clicked by : "+buton.getText());

        }
        else if(e.getSource().equals(Antman)){
            System.out.println("ant man was clicked by"+buton.getText());
        }
        else if(e.getSource().equals(Ironman)){
            System.out.println("iron man was clicked by : "+buton.getText());
        }




    }
}
