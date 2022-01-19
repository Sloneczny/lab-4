public class Student implements StudentI
{
     private String imie;
     private String nazwisko;
    private String numer;
    private  Wydział wydzial;
    private  String urodzenia;


    @Override
    public void nazwisko(String nazwisko)
    {
        this.nazwisko=nazwisko;
    }

    @Override
    public void imie(String imie)
    {
this.imie=imie;
    }

    @Override
    public void setNumer(String numer)
    {
this.numer=numer;
    }

    @Override
    public void setWydzial(Wydział wydzial)
    {
this.wydzial=wydzial;
    }

    @Override
    public void setUrodzenia(String urodzenia)
    {
this.urodzenia=urodzenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNumer() {
        return numer;
    }

    public Wydział getWydzial() {
        return wydzial;
    }

    public String getUdodzenia() {
        return urodzenia;
    }

    public void setUdodzenia(String urodzenia) {
        this.urodzenia = urodzenia;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", numer='" + numer + '\'' +
                ", wydzial=" + wydzial +
                ", urodzenia='" + urodzenia + '\'' +
                '}';
    }
}
