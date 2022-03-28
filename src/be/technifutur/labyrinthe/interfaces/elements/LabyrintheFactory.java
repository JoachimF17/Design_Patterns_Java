package be.technifutur.labyrinthe.interfaces.elements;

public interface LabyrintheFactory
{
    Mur createMur();
    Piece createPiece();
    Porte createPorte();
}
