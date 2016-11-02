/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleTecnicos;
import entidade.Tecnico;
import Persistencia.TecnicoDAO;
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
public class ControleTecnicosTest {
    
   @Test
   public void inserirTecnicoComTelefoneNegativo(){
       Tecnico t = new Tecnico("TesteTecnico",-91);
       TecnicoDAO dao = new TecnicoDAO();
       dao.put(t);
       ControleTecnicos ct = new ControleTecnicos();
       Tecnico tecnico = ct.inserir(t.getTelefone(), t.getNome());
       //Se o tecnico retornado dessa função é exatamente o tecnico que mandei adicionar
       assertEquals(tecnico.getNome(),t.getNome());
       assertEquals(tecnico.getTelefone(),t.getTelefone());
   }
   
//   @Test
//   public void inserirTecnicoComMesmoTelefoneEMesmoNomeMasSendoObjetosDiferentes(){
//       Tecnico t = new Tecnico("TesteTecnico",34546789);
//       Tecnico t2 = new Tecnico("TesteTecnico",34546789);
//       TecnicoDAO dao = new TecnicoDAO();
//       dao.put(t);
//       dao.put(t2);
//       ControleTecnicos ct = new ControleTecnicos();
//       assertSame(t.getNome(), t2.getNome());
//       assertSame(t.getTelefone(),t2.getTelefone());
//   }
   
}
