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
        String vertebrado = "É um aninal vertebrado";
        String mamifero = cachorro.getGrupo();
        animal.setGrupo(mamifero);
        Assertions.assertEquals(vertebrado, animal.getGrupo());
    }
    
    @Test
    public void deveRetornarDomestico()
    {
        String domestico = "É um animal doméstico";
        Assertions.assertEquals(domestico, cachorro.getStatus());
    }
    
    @Test
    public void deveRetornarMordeUsandoSuperClasse()
    {
        boolean ameaca = true;
        String mata = "Ataca em caso de ameaça.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }
    
    @Test
    public void deveRetornarMordeSemSuperClasse()
    {
        boolean ameaca = true;
        boolean ladrao = true;
        String mata = "Morde em caso de ameaça.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca, ladrao));
    }
    
    @Test
    public void deveRetornarNaoMordeUsandoSuperClasse()
    {
        boolean ladrao = false;
        boolean ameaca = false;
        String mata = "Não morde se não se sentir ameaçado.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca, ladrao));
    }
    
    @Test
    public void deveRetornarNaoMordeSemSuperClasse()
    {
        boolean ameaca = false;
        String mata = "Não ataca se não se sentir ameaçado.";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }

}
