package be.technifutur.singleton.models;

public class Mare
{
    private static Mare mare;

    private Mare()
    {

    }

    public static Mare getMare()
    {
        if (mare == null) mare = new Mare();

        return mare;
    }
}
