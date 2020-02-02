package Oef1;

import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {

    public Label lblResult;
    public Button btnDelete;
    public TitledPane txtIndexOf;
    public TextField txtUserInput;
    public RadioButton RbtVooraan;
    public ToggleGroup VoorOfAchter;
    public Button btnToevoegen;
    ArrayList<String> arrayTekstwaarden = new ArrayList<String>(10);

    public void initialize() {
        if (arrayTekstwaarden.size() == 0) {
            lblResult.setText("De lijst is leeg");
            txtIndexOf.setText("De lijst is leeg");
        }
    }


    public void btnBegin(MouseEvent mouseEvent) {
        myBeginFunction(arrayTekstwaarden);
    }

    public void btnTerug(MouseEvent mouseEvent) {
        myTerugFunction(arrayTekstwaarden);
    }

    public void btnVerder(MouseEvent mouseEvent) {
        myVolgendeFunction(arrayTekstwaarden);
    }

    public void btnEind(MouseEvent mouseEvent) {
        myEindFunction(arrayTekstwaarden);
    }

    public void btnDelete(MouseEvent mouseEvent) {
        myDeleteFunction(arrayTekstwaarden);
    }

    public void btnToevoegen(MouseEvent mouseEvent) {
        String userInput = txtUserInput.getText();
        myarrayAddFunction(userInput);
    }

    public void myEindFunction(ArrayList array) {
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "de lijst is nog leeg gelieve eerst de lijst op te vullen");
        } else {
            lblResult.setText(String.valueOf(array.get(array.size() - 1)));
            txtIndexOf.setText(String.valueOf(array.size() - 1));
        }
    }

    public void myarrayAddFunction(String userinput) {

        if (txtUserInput.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "geen lege invoer ");
        }else if(arrayTekstwaarden.size()==10){JOptionPane.showMessageDialog(null,"de lijst is vol");
        } else {
            if (RbtVooraan.isSelected()) {
                arrayTekstwaarden.add(0, userinput);
            } else {
                arrayTekstwaarden.add(userinput);
            }
            txtUserInput.clear();
        }
        System.out.println(arrayTekstwaarden);
        System.out.println(arrayTekstwaarden.size());
    }

    public void myBeginFunction(ArrayList array) {
        if (array.isEmpty()) {
            JOptionPane.showMessageDialog(null, "de lijst is nog leeg gelieve eerst de lijst op te vullen");
        } else {
            lblResult.setText(String.valueOf(array.get(0)));
            txtIndexOf.setText(String.valueOf(array.indexOf(array.get(0))));
        }
    }

    public void myTerugFunction(ArrayList array) {
        if (Integer.parseInt(txtIndexOf.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "je kan niet verder terug");
        } else {
            lblResult.setText(String.valueOf(array.get(Integer.parseInt(txtIndexOf.getText()) - 1)));
            txtIndexOf.setText(String.valueOf(array.indexOf(lblResult.getText())));
        }
    }

    public void myVolgendeFunction(ArrayList array) {
        if (Integer.parseInt(txtIndexOf.getText()) == array.size() - 1) {
            JOptionPane.showMessageDialog(null, "je kan niet verder terug");
        } else {
            lblResult.setText(String.valueOf(array.get(Integer.parseInt(txtIndexOf.getText()) + 1)));
            txtIndexOf.setText(String.valueOf(array.indexOf(lblResult.getText())));
        }
    }

    public void myDeleteFunction(ArrayList array) {
        if (array.size() == 0) {
            JOptionPane.showMessageDialog(null, "men kan niets deleten aangezien er niets in de lijst is");
            lblResult.setText("De lijst is leeg");
            txtIndexOf.setText("De lijst is leeg");
        } else {
            array.remove(Integer.parseInt(txtIndexOf.getText()));
            lblResult.setText(String.valueOf(array.get(0)));
            txtIndexOf.setText(String.valueOf(array.indexOf(array.get(0))));
        }
    }
}