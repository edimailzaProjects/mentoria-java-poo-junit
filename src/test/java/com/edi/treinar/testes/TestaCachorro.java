package com.edi.treinar.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.edi.treinar.Animal;
import com.edi.treinar.Cachorro;

public class TestaCachorro
{
    Animal animal = new Animal();
    Cachorro cachorro = new Cachorro();
    
    @Test
    public void deveRetornarVertebrado()
    {
        String vertebrado = "� um aninal vertebrado";
        String mamifero = cachorro.getGrupo();
        animal.setGrupo(mamifero);
        Assertions.assertEquals(vertebrado, animal.getGrupo());
    }
    
    @Test
    public void deveRetornarDomestico()
    {
        String domestico = "� um animal dom�stico";
        Assertions.assertEquals(domestico, cachorro.getStatus());
    }
    
    @Test
    public void deveRetornarMordeUsandoSuperClasse()
    {
        boolean ameaca = true;
        String mata = "Ataca em caso de amea�a.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }
    
    @Test
    public void deveRetornarMordeSemSuperClasse()
    {
        boolean ameaca = true;
        boolean ladrao = true;
        String mata = "Morde em caso de amea�a.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca, ladrao));
    }
    
    @Test
    public void deveRetornarNaoMordeUsandoSuperClasse()
    {
        boolean ladrao = false;
        boolean ameaca = false;
        String mata = "N�o morde se n�o se sentir amea�ado.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca, ladrao));
    }
    
    @Test
    public void deveRetornarNaoMordeSemSuperClasse()
    {
        boolean ameaca = false;
        String mata = "N�o ataca se n�o se sentir amea�ado.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }

}
