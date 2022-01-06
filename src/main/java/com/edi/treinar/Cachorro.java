package com.edi.treinar;

public class Cachorro extends Animal
{
    private String raca;
    private String grupo = "Mamífero";
    private boolean domestico = true;

    public String getRaca()
    {
        return raca;
    }

    public void setRaca(String raca)
    {
        this.raca = raca;
    }

    @Override
    public boolean isDomestico()
    {
        return domestico;
    }

    @Override
    public void setDomestico(boolean domestico)
    {
        this.domestico = domestico;
    }

    @Override
    public String getGrupo()
    {
        return grupo;
    }

    @Override
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }
    
    //Sobrescarga
    public String ataca(boolean ameaca, boolean ladrao)
    {
        
        if (ameaca && ladrao)
        {
            return "Morde " + super.mensagemAtaca();
        }
        else
            return "Não morde " + super.mensagemNaoAtaca();
    }
}
