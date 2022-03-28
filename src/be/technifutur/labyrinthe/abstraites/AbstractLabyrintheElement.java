package be.technifutur.labyrinthe.abstraites;

import be.technifutur.labyrinthe.interfaces.builder.implementations.LabyrinthePositionImpl;

public abstract class AbstractLabyrintheElement
{
    private LabyrinthePositionImpl position;

    public LabyrinthePositionImpl getPosition()
    {
        return position;
    }

    public void setPosition(LabyrinthePositionImpl position)
    {
        this.position = position;
    }
}
