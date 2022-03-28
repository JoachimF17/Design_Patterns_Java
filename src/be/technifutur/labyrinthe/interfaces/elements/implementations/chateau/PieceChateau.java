package be.technifutur.labyrinthe.interfaces.elements.implementations.chateau;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Piece;

public class PieceChateau extends AbstractLabyrintheElement implements Piece
{
    @Override
    public String getDescription()
    {
        return "Piece de chateau.";
    }
}
