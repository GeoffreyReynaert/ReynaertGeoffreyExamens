package Oef2;

import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ToggleGroup suiker;
    public ToggleGroup grootofKlein;
    public ProgressBar pgbklbekers;
    public ProgressBar pgbGrote;
    public ProgressBar pgbWater;
    public ProgressBar pgbKoffie;
    public ProgressBar pgbSuiker;
    public RadioButton rbtnKlein;
    clsKoffiemachine oMachine;

    public void initialize() {
        oMachine = new clsKoffiemachine(10, 10, 2000, 100, 50);
        refreshGuiMachine();
    }

    public void refreshGuiMachine() {

        pgbGrote.setProgress((double) oMachine.getiGrBekers() / 10);
        pgbklbekers.setProgress((double) oMachine.getiKlBekers() / 10);
        pgbWater.setProgress((double) oMachine.getDwater() / 2000);
        pgbKoffie.setProgress((double) oMachine.getIkoffie() / 100);
        pgbSuiker.setProgress((double) oMachine.getIsuiker() / 50);

    }

    public void btnVoerUit(MouseEvent mouseEvent) {

        if (!rbtnKlein.isSelected()){


        }
    }

}

