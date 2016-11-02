/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class PessoaTest {


    @Test
    public void testaConstrutorComTelefoneNegativo(){
        Pessoa p = new Pessoa("Felipe",-123456789);
        assertEquals(-123456789,p.getTelefone());
    }
    @Test
    public void testaNumeroDeTelefoneComPrimeiroNumeroIgualAZero(){
        //Assumindo que o número de telefone seja do Brasil terá 8 digitos sem contar o dd
        //o primeiro algarismo, de acordo com  código nacional, deverá ser diferente de 0
        Pessoa p = new Pessoa("TestePessoa",01234567);
        assertEquals(01234567,p.getTelefone());
    }
    @Test
    public void testaTelefoneComUmDigito(){
        Pessoa p = new Pessoa("TestePessoa",0);
        assertEquals(0,p.getTelefone());
    }
    
    @Test
    public void testaTelefoneComUmDigitoENegativo(){
        Pessoa p = new Pessoa("TestePessoa",-9);
        assertEquals(-9,p.getTelefone());
    }
    @Test
    public void testaPessoasComMesmoNumeroENomesDiferentes(){
        Pessoa p = new Pessoa("TesteA",36789889);
        Pessoa p1 = new Pessoa("TesteB",36789889);
        assertEquals(p.getTelefone(),p1.getTelefone());
    }
    @Test
    public void testaObjetosDiferentesMasComMesmoTelefoneENomeGerandoDuplicidade(){
        Pessoa p = new Pessoa("TesteA",36789889);
        Pessoa p1 = new Pessoa("TesteA",36789889);
        assertEquals(p.getNome(),p1.getNome());
        assertEquals(p.getTelefone(),p1.getTelefone());
    }
}
