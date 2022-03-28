package be.technifutur.labyrinthe.modeles;

import be.technifutur.labyrinthe.interfaces.Labyrinthe;
import be.technifutur.labyrinthe.interfaces.builder.LabyrinthePosition;
import be.technifutur.labyrinthe.interfaces.builder.implementations.LabyrinthePositionImpl;
import be.technifutur.labyrinthe.interfaces.elements.LabyrintheElement;

public class ArrayLabyrinthe implements Labyrinthe
{
    private LabyrintheElement[][] grille;
    private LabyrinthePositionImpl entryPos;

    public ArrayLabyrinthe(int nbLn, int nbCol)
    {
        int i,j;
        this.grille = new LabyrintheElement[nbLn][nbCol];

        for(i = 0; i < nbLn; i++)
            for(j = 0; j < nbCol; j++)
            {
                grille[i][j].setPosition(new LabyrinthePositionImpl(i, j));
            }
    }

    public void addElement(LabyrintheElement element, int ln, int pos)
    {
        grille[ln][pos] = element;
    }

    public void setEntry(int ln, int col)
    {
        entryPos = new LabyrinthePositionImpl(ln, col);
    }

    @Override
    public LabyrintheElement getEntry()
    {
        return grille[entryPos.getLine()][entryPos.getColumn()];
    }

    @Override
    public LabyrintheElement getElement(LabyrintheElement element, Direction direction)
    {
        LabyrinthePosition pos = element.getPosition().getPosition(direction);
        return grille[pos.getLine()][pos.getColumn()];
    }
}
