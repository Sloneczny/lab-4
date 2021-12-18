public class Kwadrat extends Figura
{

    double a;
    @Override
    double pole()
    {

        return a*a;
    }

    @Override
    double obwod()
    {

        return 4*a;
    }
}
