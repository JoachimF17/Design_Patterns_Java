package be.technifutur.labyrinthe.interfaces.builder;

import be.technifutur.labyrinthe.interfaces.Labyrinthe;
import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;

public interface LabyrintheBuilder
{
    void setEntry(int ln, int col);
    void begin(int nbLn, int nbCol, LabyrintheFactory factory);
    void addMur(int ln, int col);
    void addPiece(int ln, int col);
    void addPorte(int ln, int col);
    void end();
    Labyrinthe getLabyrinthe();
}
