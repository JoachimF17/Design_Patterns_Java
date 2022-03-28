package be.technifutur.singleton;

import be.technifutur.singleton.models.Mare;

public class MainSingleton
{
    public static void main(String[] args)
    {
        Mare mare = Mare.getMare();
        Mare mare2 = Mare.getMare();

        System.out.println(mare == mare2);
    }
}
