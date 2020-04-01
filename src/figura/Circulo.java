
package figura;

public class Circulo {
    
    // Declaro las variables de la circunferencia
    private double centrox;
    private double centroy;
    private double radio;
    
    // Construyo una clase vacía
    public Circulo() {
    
    }
    
    // Construyo la clase circulo
    public Circulo(double centrox, double centroy, double radio){
        this.centrox = centrox;
        this.centroy = centroy;
        this.radio = radio;
    }

    // Método GET de la coordenada 'x' de la circunferencia
    public double getCentrox() {
        return centrox;
    }

    // Método SET de la coordenada 'x' de la circunferencia
    public void setCentrox(double centrox){
        this.centrox = centrox;
    }

    // Método GET de la coordenada 'y' de la circunferencia
    public double getCentroy(){
        return centroy;
    }

    // Método SET de la coordenada 'y' de la circunferencia
    public void setCentroy(double centroy) {
        this.centroy = centroy;
    }

    // Método GET del radio de la circunferencia
    public double getRadio(){
        return radio;
    }

    // Método SET del radio de la circunferencia
    public void setRadio(double radio){
        this.radio =radio;
    }

    // Declaro un STRING
    @Override
    public String toString(){
        return "Circulo(" + "centrox=" + centrox + ", centroy=" + centroy + ",radio=" + radio + ')';
    }
    
    // Cálculo del perímetro de la circunferencia
    public double perimetroCirculo(){
        return 2 * Math.PI * this.radio;
    }

    // Cálculo del area de la circunferencia
    public double areaCirculo(){
        return Math.PI * Math.pow(this.radio,2);
    }

    // Cálculo para mover la circunferencia
    public void moverCirculo (double deltax, double deltay){
        this.centrox = this.centrox + deltax;
        this.centroy = this.centroy + deltay;
    }

    // Cálculo para aumentar o disminuir la circunferencia
    public void escalaCirculo(double s){
        this.radio = this.radio * s;
    }
}