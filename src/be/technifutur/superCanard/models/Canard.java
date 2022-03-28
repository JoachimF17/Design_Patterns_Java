package be.technifutur.superCanard.models;

import be.technifutur.superCanard.interfaces.ComportementCri;
import be.technifutur.superCanard.interfaces.ComportementVol;

public abstract class Canard
{
    protected ComportementVol comportementVol;
    protected ComportementCri comportementCri;

    public void nager()
    {
        System.out.println("Je nage !");
    }

    abstract public void afficher();

    public void effectuerVol()
    {
        System.out.println(comportementVol.voler());
    }

    public void effectuerCri()
    {
        System.out.println(comportementCri.crier());
    }

    public void setComportementVol(ComportementVol comportementVol)
    {
        this.comportementVol = comportementVol;
    }

    public void setComportementCri(ComportementCri comportementCri)
    {
        this.comportementCri = comportementCri;
    }

    public ComportementCri getComportementCri()
    {
        return comportementCri;
    }

    public void alterner(ComportementCri c1, ComportementCri c2)
    {
        this.setComportementCri(this.getComportementCri() == c1 ? c2 : c1);
    }
}
