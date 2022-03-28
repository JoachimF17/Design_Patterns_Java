package be.technifutur.labyrinthe.interfaces;

import be.technifutur.labyrinthe.interfaces.elements.LabyrintheElement;
import be.technifutur.labyrinthe.modeles.Direction;

public interface Labyrinthe
{
    LabyrintheElement getEntry();
    LabyrintheElement getElement(LabyrintheElement element, Direction direction);
}
