/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package ACT8_0E;

/**
 *
 * @author alumnat
 */
public class Quadrat extends Figura {
    double costat;
            
    public Quadrat(String color, double costat) {
        super(color);
        this.costat = costat;
    }
    
    @Override
    double calcularArea(){
        return costat * costat;
    }
    
    @Override
    double calcularPerimetre(){
        return costat * 4;
    }
}
