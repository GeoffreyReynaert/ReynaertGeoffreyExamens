package Oef2;

import javax.swing.*;

public class clsKoffiemachine {
    private int iGrBekers;
    private int iKlBekers;
    private double dwater;
    private int ikoffie;
    private int isuiker;

    public clsKoffiemachine(int iGrBekers,int iKlBekers,double dwater,int ikoffie,int isuiker){
        this.iGrBekers=iGrBekers;
        this.iKlBekers=iKlBekers;
        this.dwater=dwater; //Ml
        this.ikoffie=ikoffie;  //Gram
        this.isuiker=isuiker;
    }


    public int getiGrBekers() {
        return iGrBekers;
    }

    public int getiKlBekers() {
        return iKlBekers;
    }

    public double getDwater() {
        return dwater;
    }

    public int getIkoffie() {
        return ikoffie;
    }

    public int getIsuiker() {
        return isuiker;
    }

    public void groteTasMaken(){
        {
            if(iGrBekers <= this.iGrBekers)
            {
                this.iGrBekers -= iGrBekers;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Er zijn te weinig bekers Error bij maken");
            }
        }
    }
}
