package com.edi.treinar;

public class Cachorro extends Animal
{
    private String raca;
    private String grupo = "Mam�fero";
    private boolean domestico = true;

    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        this.raca = raca;
    }

    public boolean isDomestico()
    {
        return domestico;
    }

    public void setDomestico(boolean domestico)
    {
        this.domestico = domestico;
    }

    public String getGrupo()
    {
        return grupo;
    }

    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }
    
    public String ataca(boolean ameaca)
    {
        if (ameaca)
        {
            return "Morde em caso de amea�a";
        }
        else
            return "N�o morde se n�o se sentir amea�ado";
    }
}
