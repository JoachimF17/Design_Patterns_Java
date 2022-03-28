package be.technifutur.labyrinthe.interfaces.builder;

import be.technifutur.labyrinthe.modeles.Direction;

public interface LabyrinthePosition
{
    public LabyrinthePosition getPosition(Direction direction);
    public int getLine();
    public int getColumn();
}
