package boletin4_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Adry
 */
public class Circulo {
    private double radio;
    private final double Pi=3.14;
public Circulo(){
}
public Circulo(double radio) {
    this.radio =radio;
 }
    public double getRadio() {
        radio=Float.parseFloat(JOptionPane.showInputDialog("Radio "));
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea(){
        double area=Math.pow(radio, 2f);
        System.out.println("Area ="+area);
      return area;
    }
    public double calcularLonxitude(){
        double lonxitude=Pi*radio*2f;
        System.out.println("Lonxitude ="+ lonxitude);
        return lonxitude;
    }
}
