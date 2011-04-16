public class Racional{
    private int numerador;
    private int denominador;

    public Racional(int num, int den){
        int mayorComunDivisor = gcd(num, den);
        this.numerador = num / mayorComunDivisor;
        this.denominador = den / mayorComunDivisor;
    }

    private int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return gcd(b, a%b);
    }

    public int getDenominador(){
        return denominador;
    }

    public int getNumerador(){
        return numerador;
    }

    public String toString(){
        return String.format("%d/%d", numerador, denominador);
    }

    public boolean equals(Racional otro){
        if(otro == null) return false;
        else if(otro == this) return true;
        else
            return otro.getNumerador() == this.numerador
                && otro.getDenominador() == this.denominador;
    }

    public Racional inversoAditivo(){
        return new Racional(-this.numerador, this.denominador);
    }

    public Racional inversoMultiplicativo(){
        return new Racional(this.denominador, this.numerador);
    }

    public double toDouble(){
        return numerador/denominador;
    }

    public Racional sumar(Racional otro){
        return new Racional(this.numerador*otro.denominador+this.denominador*otro.numerador, 
                            this.denominador*otro.denominador);
    }

    public Racional restar(Racional otro){
        return new Racional(this.numerador*otro.denominador-this.denominador*otro.numerador, 
                            this.denominador*otro.denominador);
    }

    public Racional producto(Racional otro){
        return new Racional(this.numerador*otro.numerador, this.denominador*otro.denominador);
    }

    public Racional dividir(Racional otro){
        return this.producto(otro.inversoMultiplicativo());
    }
} 

