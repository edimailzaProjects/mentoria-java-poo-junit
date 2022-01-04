package com.edi.treinar;

public class Lobo extends Animal
{
    private boolean domestico = false;
    private String grupo = "Mamífero";
    
    public String getGrupo()
    {
        return grupo;
    }

    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    public boolean isDomestico()
    {
        return this.domestico;
    }
    
    public void setDomestico(boolean domestico)
    {
        this.domestico = domestico;
    }
    
    
    public String ataca(boolean ameaca)
    {
        if (ameaca)
        {
            return "Mata em caso de ameaça";
        }
        else
            return "Não mata se não se sentir ameaçado";
    }

}
