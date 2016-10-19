package boletin4_2;

/**
 *
 * @author Adry
 */
public class Satelite {
    private double meridiano,paralelo,distanciaTerra;
    public Satelite(){
        meridiano=0;
        paralelo=0;
        distanciaTerra=0;
    }
    public Satelite(double m,double p,double d){
        meridiano=m;
        paralelo=p;
        distanciaTerra=d;
    }
    public void verPosicion(){
        System.out.println("O satelite atopase no meridiano "+meridiano +" paralelo "+ paralelo +"a unha distancia da Terra de "+distanciaTerra);
}
}
