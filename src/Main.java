

public class Main {


    public static void main(String[] args) {
    Student s1 =new Student();
    s1.setImie("JAN");
    s1.setNazwisko("KOWALSKI");
    s1.setWydzial(Wydział.INFORMARYKA);
    s1.setNumer("gd4848");
    s1.setUrodzenia("18.10.1559");
        System.out.println("student1 " + s1.toString());

        Student s2 =new Student();
        s2.setImie("KAROL");
        s2.setNazwisko("JOPEK");
        s2.setWydzial(Wydział.BW);
        s2.setNumer("gd8847");
        s2.setUrodzenia("15.08.1889");
        System.out.println("student2 " + s2.toString());


        Pracownikk p1 =new Pracownikk();
        p1.setImie("Adrian");
        p1.setNazwisko("JAROSZ");
        p1.setpłaca(50);
        p1.setSanowisko(StanowiskoEnum.Elektryk);
        p1.setStatus("Aktywny");
        System.out.println("Pierwsyz pracownik"+ p1.toString());

        Pracownikk p2 =new Pracownikk();
        p2.setImie("Bartek");
        p2.setNazwisko("KOPPO");
        p2.setpłaca(80);
        p2.setSanowisko(StanowiskoEnum.MEchanik);
        p2.setStatus("Aktywny");
        System.out.println("Drugi pracownik"+ p2.toString());








        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów


        zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
