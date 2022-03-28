package be.technifutur.labyrinthe.interfaces.builder.implementations;

import be.technifutur.labyrinthe.interfaces.Labyrinthe;
import be.technifutur.labyrinthe.interfaces.builder.LabyrintheBuilder;
import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;
import be.technifutur.labyrinthe.modeles.ArrayLabyrinthe;

public class ArrayLabyrintheBuilder implements LabyrintheBuilder
{
    ArrayLabyrinthe grille;
    LabyrintheFactory facto;

    public void setEntry(int ln, int col)
    {
        grille.setEntry(ln, col);
    }

    @Override
    public void begin(int nbLn, int nbCol, LabyrintheFactory factory)
    {
        grille = new ArrayLabyrinthe(nbLn, nbCol);
        facto = factory;
    }

    @Override
    public void addMur(int ln, int col)
    {
        grille.addElement(facto.createMur(),ln, col);
    }

    @Override
    public void addPiece(int ln, int col)
    {
        grille.addElement(facto.createPiece(), ln, col);
    }

    @Override
    public void addPorte(int ln, int col)
    {
        grille.addElement(facto.createPorte(), ln, col);
    }

    @Override
    public void end()
    {

    }

    @Override
    public Labyrinthe getLabyrinthe()
    {
        return grille;
    }
}
