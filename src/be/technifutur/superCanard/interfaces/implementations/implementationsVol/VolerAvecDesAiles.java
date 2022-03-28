package be.technifutur.superCanard.interfaces.implementations.implementationsVol;

import be.technifutur.superCanard.interfaces.ComportementVol;

public class VolerAvecDesAiles implements ComportementVol
{
    @Override
    public String voler()
    {
        return "Je vole avec des ailes !";
    }
}
