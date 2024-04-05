public class metodo_Triangulo {

    //metodo triangulo
    /*Triangulo: Metodos que permitan conocer el Area, el Perimetro e hipotenusa. */

    public int area(int base,int altura){

        int area=(base*altura)/2;
        return area;
    }

    public double hipotenusa(int base, int altura){

        double hipotenusa=Math.sqrt( (Math.pow(altura, 2))+Math.pow(base, 2) );
        return hipotenusa;
    }



    public int perimetro(int base,int altura, int hipotenusa){

        int perimetro=base+altura+hipotenusa;
        return perimetro;
    }

    
}
