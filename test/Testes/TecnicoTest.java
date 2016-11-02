/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import entidade.Tecnico;
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
public class TecnicoTest {
    
  @Test
  public void testaConstrutorTecnicoComTelefoneNegativoComUmDigitoApenas(){
      Tecnico tecnico = new Tecnico("TecnicoTeste",-1);
      assertEquals(-1,tecnico.getTelefone());
  }
  
  @Test
  public void testaConstrutorTecnicoComTelefoneComUmDigitoApenas(){
      Tecnico tecnico = new Tecnico("TecnicoTeste",2);
      assertEquals(2,tecnico.getTelefone());
  }
}
