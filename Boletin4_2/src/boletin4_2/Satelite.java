package boletin4_2;

/**
 *
 * @author Adry
 */
public class Satelite {
    private double meridiano,paralelo,distanciaTerra;
    public Satelite(){
    }
    public Satelite(double m,double p,double d){
        meridiano=m;
        paralelo=p;
        distanciaTerra=d;
    }
    public void verPosicion(float meridiano,float paralelo,float distanciaTerra){
        System.out.println("O satelite atopase no meridiano "+meridiano +" paralelo "+ paralelo +"a unha distancia da Terra de "+distanciaTerra);
}
}
