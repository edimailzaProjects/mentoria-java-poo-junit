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
    public void deveRetornarMorde()
    {
        boolean ameaca = true;
        String mata = "Morde em caso de ameaça";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }
    
    @Test
    public void deveRetornarNaoMorde()
    {
        boolean ameaca = false;
        String mata = "Não morde se não se sentir ameaçado";
        Assertions.assertEquals(mata, cachorro.ataca(ameaca));
    }

}
