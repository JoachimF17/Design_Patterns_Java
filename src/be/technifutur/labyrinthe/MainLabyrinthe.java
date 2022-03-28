package be.technifutur.labyrinthe;

import be.technifutur.labyrinthe.interfaces.elements.LabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;
import be.technifutur.labyrinthe.interfaces.elements.implementations.chateau.ChateauFactory;
import be.technifutur.labyrinthe.interfaces.elements.implementations.jardin.JardinFactory;

import java.util.ArrayList;
import java.util.List;

public class MainLabyrinthe
{
    public static void main(String[] args)
    {
        int i, rdm;
        LabyrintheFactory lf = getFactory("Jardin");
        List<LabyrintheElement> labyChateau = new ArrayList<>();

        for(i = 0; i < 50; i++)
        {
            rdm = (int)(Math.random()*3)+1;

            switch (rdm)
            {
                case 1 -> labyChateau.add(lf.createPiece());
                case 2 -> labyChateau.add(lf.createPorte());
                case 3 -> labyChateau.add(lf.createMur());
            }
        }

        for(LabyrintheElement le : labyChateau)
            System.out.println(le.getDescription());
    }

    public static LabyrintheFactory getFactory(String nom)
    {
        return nom.equals("Chateau") ? new ChateauFactory() : new JardinFactory();
    }
}
