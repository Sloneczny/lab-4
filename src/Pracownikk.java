public class Pracownikk implements Pracownik
{
    private String imie;
    private String nazwisko;
    private String status;
    private  StanowiskoEnum stanowisko;
    private  int placa;


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
    public void setpłaca(int placa)
    {
this.placa=placa;
    }

    @Override
    public void setSanowisko(StanowiskoEnum stanowisko)
    {
this.stanowisko=stanowisko;
    }

    @Override
    public void setStatus(String status)
    {
this.status=status;
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

    public String getStatus() {
        return status;
    }

    public StanowiskoEnum getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(StanowiskoEnum stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Pracownikk{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", status='" + status + '\'' +
                ", stanowisko=" + stanowisko +
                ", placa=" + placa +
                '}';
    }
}

