package be.technifutur.labyrinthe.interfaces.elements.implementations.chateau;

import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;
import be.technifutur.labyrinthe.interfaces.elements.Mur;
import be.technifutur.labyrinthe.interfaces.elements.Piece;
import be.technifutur.labyrinthe.interfaces.elements.Porte;

public class ChateauFactory implements LabyrintheFactory
{
    @Override
    public Mur createMur()
    {
        return new MurChateau();
    }

    @Override
    public Piece createPiece()
    {
        return new PieceChateau();
    }

    @Override
    public Porte createPorte()
    {
        return new PorteChateau();
    }
}
