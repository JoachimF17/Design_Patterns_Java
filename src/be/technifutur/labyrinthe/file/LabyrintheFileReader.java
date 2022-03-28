package be.technifutur.labyrinthe.file;

import be.technifutur.labyrinthe.interfaces.builder.LabyrintheBuilder;
import be.technifutur.labyrinthe.interfaces.elements.LabyrintheFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LabyrintheFileReader
{
    public void read(File file, LabyrintheBuilder builder, LabyrintheFactory factory)
    {
        int i,j;
        List<String> liste = new ArrayList<>();

        try(Scanner sc = new Scanner(file);)
        {
            while(sc.hasNext())
                liste.add(sc.nextLine());

            int nbLn = liste.size();
            int nbCol = liste.get(0).length();

            builder.begin(nbLn, nbCol, factory);

            for(i = 0; i < nbLn; i++)
            {
                for(j = 0; j < nbCol; j++)
                {
                    switch (liste.get(i).charAt(j))
                    {
                        case 'm' -> builder.addMur(i, j);
                        case ' ' -> builder.addPiece(i, j);
                        case 'e' -> builder.setEntry(i, j);
                        case 'p' -> builder.addPorte(i, j);
                    }
                }
            }
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
