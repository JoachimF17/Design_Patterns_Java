package be.technifutur.superCanard;

import be.technifutur.superCanard.interfaces.ComportementCri;
import be.technifutur.superCanard.interfaces.ComportementVol;
import be.technifutur.superCanard.models.Canard;
import be.technifutur.superCanard.models.descendantsCanard.CanardEnPlastique;
import be.technifutur.superCanard.models.descendantsCanard.Colvert;
import be.technifutur.superCanard.models.descendantsCanard.Mandarin;

public class Main
{
    public static void main(String[] args)
    {
        ComportementVol nePasVoler = () -> "Je ne vole pas !";
        ComportementVol volerAvecDesAiles = () -> "Je vole avec des ailes !";
        ComportementCri canardMuet = () -> "Je ne cancane pas !";
        ComportementCri cancan = () -> "Je cancane !";
        ComportementCri coincoin = () -> "Je fais coin coin !";

        Canard[] canards = new Canard[]{
                new CanardEnPlastique(nePasVoler, coincoin),
                new Colvert(volerAvecDesAiles, cancan),
//                new Leurre(nePasVoler, canardMuet),
                new Mandarin(volerAvecDesAiles, cancan)
        };

        /*for(Canard c : canards)
        {
            c.afficher();
            c.effectuerCri();
            c.effectuerVol();
            c.nager();
            System.out.println();
        }

        System.out.println("Le chasseur tire !");

        for(Canard c : canards)
        {
            c.setComportementCri(new Begayer(c.getComportementCri()));
            c.effectuerCri();
        }*/

        for(Canard c : canards)
        {
            c.afficher();
            c.effectuerCri();
            c.alterner(coincoin, cancan);
            c.effectuerCri();
            System.out.println();
        }
    }
}
