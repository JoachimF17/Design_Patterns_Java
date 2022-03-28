package be.technifutur.superCanard.interfaces.implementations.implementationsVol;

import be.technifutur.superCanard.interfaces.ComportementVol;

public class NePasVoler implements ComportementVol
{
    @Override
    public String voler()
    {
        return "Je ne vole pas !";
    }
}
