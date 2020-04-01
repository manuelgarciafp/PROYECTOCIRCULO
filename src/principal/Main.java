package principal;

import figura.Circulo;
// Este programa localiza la circunferencia y calcula el área y el perímetro de esta
public class Main {

    public static void main(String[] args) {
        // Localización inicial de la circunferencia
        double centrox=1;
        double centroy=1;
        
        // Radio inicial de la circunferencia
        double radio=5;
        
        // Crea la circunferencia con los datos iniciales dados anteriormmente
        Circulo c1 = new Circulo(centrox,centroy,radio);
        
        // Calcula y escribe el área de la circunferencia
        System.out.println("Area del circulo = " + c1.areaCirculo());
        
        // Calcula y escribe el perímetro de la circunferencia
        System.out.println("Perimetro del circulo = " + c1.perimetroCirculo());
        
        // Mueve la circunferencia +10x y +10y
        c1.moverCirculo(10,10);
        
        // Escribe la nueva localización de la circunferencia
        System.out.println("Centro x nuevo = " + c1.getCentrox());
        System.out.println("Centro y nuevo = " + c1.getCentroy());
    }
}
