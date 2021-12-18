public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */
        Kwadrat x =new Kwadrat();
        x.nazwaFigury("Kwadrat");
        x.a=5;
        System.out.println("Pole:" + x.pole());
        System.out.println("Ob:" + x.obwod());

        System.out.println("");

        Prostokat z = new Prostokat();
        z.nazwaFigury("Prostokat");
        z.b=10;
        z.c=15;
        System.out.println("Pole:" + z.pole());
        System.out.println("Ob:" + z.obwod());





    }
}
