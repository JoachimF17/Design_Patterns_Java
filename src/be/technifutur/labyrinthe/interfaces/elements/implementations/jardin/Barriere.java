package be.technifutur.labyrinthe.interfaces.elements.implementations.jardin;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Porte;

public class Barriere extends AbstractLabyrintheElement implements Porte
{
    @Override
    public String getDescription()
    {
        return "Une barriere en bois.";
    }
}
