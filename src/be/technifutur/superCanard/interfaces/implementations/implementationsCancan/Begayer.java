package be.technifutur.superCanard.interfaces.implementations.implementationsCancan;

import be.technifutur.superCanard.interfaces.ComportementCri;

public class Begayer implements ComportementCri
{
    ComportementCri comportementCri;

    public Begayer(ComportementCri comportementCri)
    {
        this.comportementCri = comportementCri;
    }

    @Override
    public String crier()
    {
        return comportementCri.crier() + "\n" + comportementCri.crier();
    }
}
