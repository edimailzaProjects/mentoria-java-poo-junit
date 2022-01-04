package com.edi.treinar.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.edi.treinar.Animal;
import com.edi.treinar.Lobo;

public class TestaLobo
{
    Animal animal = new Animal();
    Lobo lobo = new Lobo();
    
    @Test
    public void deveRetornarVertebrado()
    {
        String vertebrado = "É um aninal vertebrado";
        String mamifero = lobo.getGrupo();
        animal.setGrupo(mamifero);
        Assertions.assertEquals(vertebrado, animal.getGrupo());
    }
    
    @Test
    public void deveRetornarSelvagem()
    {
        String selvagem = "É um animal selvagem";
        Assertions.assertEquals(selvagem, lobo.getStatus());
    }
    
    @Test
    public void deveRetornarMata()
    {
        boolean ameaca = true;
        String mata = "Mata em caso de ameaça";
        Assertions.assertEquals(mata, lobo.ataca(ameaca));
    }
    
    @Test
    public void deveRetornarNaoMata()
    {
        boolean ameaca = false;
        String mata = "Não mata se não se sentir ameaçado";
        Assertions.assertEquals(mata, lobo.ataca(ameaca));
    }
    
}
