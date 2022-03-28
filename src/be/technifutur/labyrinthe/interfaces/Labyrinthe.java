package be.technifutur.labyrinthe.interfaces;

import be.technifutur.labyrinthe.interfaces.elements.LabyrintheElement;

public interface Labyrinthe
{
    LabyrintheElement getEntry();
    LabyrintheElement getElement(LabyrintheElement element);
}
