package com.edi.treinar;

public class Animal
{
    protected String grupo;
    protected boolean domestico;

    public String getGrupo()
    {
        if (grupo.equals("Mamífero") || grupo.equals("Ave") || grupo.equals("Réptil") || grupo.equals("Anfíbio"))
        {
            return "É um aninal vertebrado";
        }
        else if (grupo.equals("Poríferos") || grupo.equals("Moluscos") || grupo.equals("Cnidários")
                || grupo.equals("Anelídeos") || grupo.equals("Artrópodes"))
        {
            return "É um animal invertebrado";
        }
        else
            return "Não é um animal.";
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
            return "É um animal doméstico";
        }
        else
            return "É um animal selvagem";
    }

    public String ataca(boolean ameaca)
    {
        if (ameaca)
        {
            return "Ataca em caso de ameaça";
        }
        else
            return "Não ataca";
    }

}
