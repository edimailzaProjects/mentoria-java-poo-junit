package com.edi.treinar;

public class Lobo extends Animal
{
    private boolean domestico = false;
    private String grupo = "Mamífero";
    
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

    @Override
    public boolean isDomestico()
    {
        return this.domestico;
    }
    
    @Override
    public void setDomestico(boolean domestico)
    {
        this.domestico = domestico;
    }
    
    @Override
    public String ataca(boolean ameaca)
    {
        if (ameaca)
        {
            return "Mata " + super.mensagemAtaca();
        }
        else
            return "Não mata " + super.mensagemNaoAtaca();
    }
    
    public void uivar() {
        System.out.println("Costuma uivar.");
    }

}
