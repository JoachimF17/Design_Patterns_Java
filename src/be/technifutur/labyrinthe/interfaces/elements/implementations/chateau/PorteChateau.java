package be.technifutur.labyrinthe.interfaces.elements.implementations.chateau;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Porte;

public class PorteChateau extends AbstractLabyrintheElement implements Porte
{
    @Override
    public String getDescription()
    {
        return "Porte de chateau.";
    }
}
