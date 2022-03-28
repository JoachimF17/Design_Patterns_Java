package be.technifutur.labyrinthe.interfaces.elements.implementations.jardin;

import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;
import be.technifutur.labyrinthe.interfaces.elements.Mur;
import be.technifutur.labyrinthe.interfaces.elements.Piece;
import be.technifutur.labyrinthe.interfaces.elements.Porte;

public class JardinFactory implements LabyrintheFactory
{
    @Override
    public Mur createMur()
    {
        return new Haie();
    }

    @Override
    public Piece createPiece()
    {
        return new PieceJardin();
    }

    @Override
    public Porte createPorte()
    {
        return new Barriere();
    }
}
