public class metodo_circulo {

    //metodo ciuclo
    /*Circulo: Metodos que permitan conocer el Area y el Perimetro. */

    public double area(int radio){

        double area=(Math.PI*Math.pow(radio, 2));
        return area;
    }

    public double perimetro(int radio){

        double perimetro=Math.PI*2*radio;
        return perimetro;
    }

    
}
