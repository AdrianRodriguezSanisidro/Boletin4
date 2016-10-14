package boletin.pkg4;

/**
 *
 * @author Adry
 */
public class Coche {
    private int velocidade;
    public Coche(){
        velocidade=0;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void acelerar(int valor){
        int acelerar = this.velocidade+valor;
    }
    public void frenar (int menos){
        int frenar = this.velocidade-menos;
    }
    
}
