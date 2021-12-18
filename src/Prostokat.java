public class Prostokat extends Figura
{

    public double b,c ;

    @Override
    double pole()
    {
        return b*c ;
    }

    @Override
    double obwod()
    {
        return (2*b) + (2*c);
    }
}
