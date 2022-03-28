package be.technifutur.superCanard.models.descendantsCanard;

import be.technifutur.superCanard.interfaces.ComportementCri;
import be.technifutur.superCanard.interfaces.ComportementVol;
import be.technifutur.superCanard.models.Canard;

public class Mandarin extends Canard
{
    @Override
    public void afficher()
    {
        System.out.println("Je suis un mandarin !");
    }

    public Mandarin(ComportementVol comportementVol, ComportementCri comportementCri)
    {
        this.comportementVol = comportementVol;
        this.comportementCri = comportementCri;
    }
}
