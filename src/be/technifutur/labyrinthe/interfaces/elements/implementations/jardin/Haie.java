package be.technifutur.labyrinthe.interfaces.elements.implementations.jardin;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Mur;

public class Haie extends AbstractLabyrintheElement implements Mur
{
    @Override
    public String getDescription()
    {
        return "Une haie.";
    }
}
