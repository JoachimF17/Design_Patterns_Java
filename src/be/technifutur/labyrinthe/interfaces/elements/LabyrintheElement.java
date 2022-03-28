package be.technifutur.labyrinthe.interfaces.elements;

import be.technifutur.labyrinthe.interfaces.builder.LabyrinthePosition;

import javax.swing.text.Position;

public interface LabyrintheElement
{
    String getDescription();
    LabyrinthePosition getPosition();
    void setPosition(LabyrinthePosition position);
}
