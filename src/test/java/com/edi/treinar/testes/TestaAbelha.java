package com.edi.treinar.testes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.edi.treinar.Abelha;
import com.edi.treinar.Animal;

public class TestaAbelha
{
    Abelha abelha = new Abelha();
    Animal animal = new Animal();
    
    @Test
    public void deveRetornarInvertebrado()
    {
        String invertebrado = "É um animal invertebrado";
        String artropodes = abelha.getGrupo();
        animal.setGrupo(artropodes);
        Assertions.assertEquals(invertebrado, animal.getGrupo());
    }
    
    @Test
    public void deveRetornarSelvagem()
    {
        String selvagem = "É um animal selvagem";
        Assertions.assertEquals(selvagem, abelha.getStatus());
    }
    
    @Test
    public void deveRetornarProduzMel()
    {
        String mel = "A abelha produz mel";
        Assertions.assertEquals(mel, abelha.produzMel());
    }
}
