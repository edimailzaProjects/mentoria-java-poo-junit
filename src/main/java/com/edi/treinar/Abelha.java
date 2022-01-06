package com.edi.treinar;


public class Abelha extends Animal
{
    private boolean domestico = false;
    private String grupo = "Artrópodes";
    
   //Também funciona sem override
    
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
            return "Pica em caso de ameaça";
        }
        else
            return "Não pica se não se sentir ameaçado";
    }
    
    public String produzMel() {
        return "A abelha produz mel";
    }
    
}
