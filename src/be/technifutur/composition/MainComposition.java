package be.technifutur.composition;

import be.technifutur.composition.models.A;
import be.technifutur.composition.models.B;

public class MainComposition
{
    public static void main(String[] args)
    {
        A a = new A();
        System.out.println(a.getValue());
        a.inc();
        System.out.println(a.getValue());

        B b = new B();
        System.out.println(b.getValue());
        b.inc();
        System.out.println(b.getValue());

        System.out.println(b.isEven());
    }
}
