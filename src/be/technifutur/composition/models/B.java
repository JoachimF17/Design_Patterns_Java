package be.technifutur.composition.models;

public class B
{
    A a = new A();

    public int getValue()
    {
        return a.getValue();
    }

    public void inc()
    {
        a.inc();
    }

    public boolean isEven()
    {
        return a.cpt % 2 == 0;
    }
}
