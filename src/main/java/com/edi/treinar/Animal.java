package com.edi.treinar;

public class Animal
{
    protected String grupo;
    protected boolean domestico;

    public String getGrupo()
    {
        if (grupo.equals("Mam�fero") || grupo.equals("Ave") || grupo.equals("R�ptil") || grupo.equals("Anf�bio"))
        {
            return "� um aninal vertebrado";
        }
        else if (grupo.equals("Por�feros") || grupo.equals("Moluscos") || grupo.equals("Cnid�rios")
                || grupo.equals("Anel�deos") || grupo.equals("Artr�podes"))
        {
            return "� um animal invertebrado";
        }
        else
            return "N�o � um animal.";
    }

    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    public boolean isDomestico()
    {
        return domestico;
    }

    protected void setDomestico(boolean domestico)
    {
        this.domestico = domestico;
    }

    public String getStatus()
    {
        if (isDomestico())
        {
            return "� um animal dom�stico";
        }
        else
            return "� um animal selvagem";
    }

    public String ataca(boolean ameaca)
    {
        if (ameaca)
        {
            return "Ataca em caso de amea�a";
        }
        else
            return "N�o ataca";
    }

}
