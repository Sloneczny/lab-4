public class Dom implements Budynek
{
    private double pow;
    private String adres;
    private int value;
    private int ile;
    private int ok , po;





    public int getPo() {
        return po;
    }

    public void setPo(int po) {
        this.po = po;
    }


    public int getOk() {
        return ok;
    }

    public void setOk(int ok) {
        this.ok = ok;
    }




    public int getIle() {
        return ile;
    }

    public void setIle(int ile) {
        this.ile = ile;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    ;

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }


    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }






    @Override
    public double powierzchnia(double pow) {
        this.pow=pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres=adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int value)
    {
        this.value =value;
        return value;
    }

    @Override
    public void liczbaMieszkancow(int ile)
    {
        this.ile=ile;

    }

    @Override
    public void kolorDomu(KolorEnum kolor)
    {
        System.out.println("Kolor domu: " + kolor);


    }

    @Override
    public int sciany(int ok, int po)
    {
        this.ok=ok;
        this.po=po;

        return ok + po;

    }

    public void podsumowanie()
    {
        System.out.println("Adres: " + adres );
        System.out.println("Powierzchnia:  "+pow);
        System.out.println("Liczba Okien: " + value);
        System.out.println("Liczba mieszkańców: " + ile);
        System.out.println("Sciany : " + (ok + po));



    }

    @Override
    public String toString() {
        return "Dom{" +
                "pow=" + pow +
                ", adres='" + adres + '\'' +
                ", value=" + value +
                ", ile=" + ile +
                ", suma=" +(ok +po)+
                '}';
    }
}
