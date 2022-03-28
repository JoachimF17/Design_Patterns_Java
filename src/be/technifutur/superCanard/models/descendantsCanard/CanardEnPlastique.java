package be.technifutur.superCanard.models.descendantsCanard;

import be.technifutur.superCanard.interfaces.ComportementCri;
import be.technifutur.superCanard.interfaces.ComportementVol;
import be.technifutur.superCanard.models.Canard;

public class CanardEnPlastique extends Canard
{
    @Override
    public void afficher()
    {
        System.out.println("Je suis un canard en plastique !");
    }

    public CanardEnPlastique(ComportementVol comportementVol, ComportementCri comportementCri)
    {
        this.comportementVol = comportementVol;
        this.comportementCri = comportementCri;
    }
}
