package be.technifutur.labyrinthe.interfaces.elements.implementations.chateau;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Mur;

public class MurChateau extends AbstractLabyrintheElement implements Mur
{
    @Override
    public String getDescription()
    {
        return "Mur de chateau.";
    }
}
