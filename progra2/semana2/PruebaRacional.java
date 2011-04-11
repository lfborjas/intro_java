public class PruebaRacional{
    public static void main (String [] args)
    {
        Racional a = new Racional(20,15);
        Racional b = new Racional(30, 18);

        //1. Revisar que simplifique bien
        assert a.getNumerador()   == 4 : "Debería simplificar usando el mcd";
        assert a.getDenominador() == 3;

        assert b.getNumerador()   == 5;
        assert b.getDenominador() == 3;

        //2. Revisar toString:
        assert a.toString() == "4/3" : "El toString debería ser de la forma num/den";
        assert b.toString() == "5/3";

        //3. Revisar equals:
        assert a.equals(b) == false : "Dos referencias distintas no son iguales";
        assert a.equals(null) == false : "Nada es igual a la nulidad";
        assert a.equals(a) == true : "Una referencia es igual a sí misma";
        assert a.equals(new Racional(4,3)) == true : "Si tienen el mismo estado, son iguales";

        //4. Revisar inversos
        assert a.inversoAditivo().equals(new Rational(-4, 3)) : "El inverso para un número num/den debería ser -num/den";
        assert a.inversoMultiplicativo().equals(new Rational(3,4)): "El inverso mult para un n = num/den debería ser den/num";

        //5. Conversión a real
        assert a.toDouble() == 1.3333333333333333 : "La representación real de una fracción debería ser el cociente";

        //6. Suma y resta
        assert a.sumar(b).equals(new Rational(3,1)) : "Debería sumar dos racionales y obtener un racional";
        assert a.restar(b).equals(new Rational(2,1));

        //7. Producto
        assert a.producto(b).equals(new Rational(20,9)) : "Debería multiplicar dos racionales y obtener un racional";
        
        //7. División
        assert a.dividir(b).equals(new Rational(12,15)) : "Debería dividir dos racionales y obtener un racional";
    }
}
