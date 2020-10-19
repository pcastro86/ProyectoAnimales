package ejecutables;

import modelos.Perro;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        //System.out.println(perro.getNumeroPatas());
        perro.setNumeroPatas(4); // uso los setters para poder meterle valores a los atrb
        System.out.println(perro.getNumeroPatas()); // uso el getter para poder mostrar ese atrb
    }
}
