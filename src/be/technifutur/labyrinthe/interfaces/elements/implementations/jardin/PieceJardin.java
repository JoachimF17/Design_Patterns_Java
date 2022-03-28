package be.technifutur.labyrinthe.interfaces.elements.implementations.jardin;

import be.technifutur.labyrinthe.abstraites.AbstractLabyrintheElement;
import be.technifutur.labyrinthe.interfaces.elements.Piece;

public class PieceJardin extends AbstractLabyrintheElement implements Piece
{
    @Override
    public String getDescription()
    {
        return "Piece de jardin.";
    }
}
