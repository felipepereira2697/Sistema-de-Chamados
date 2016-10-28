/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.persistencia.ClienteDAO;
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
public class ClienteDAOTest {
    
   @Test
   public void testaValidarCPF(){
       ClienteDAO dao = new ClienteDAO();
       //retorna se fail se for falso
       //retornará true pois este cliente não existe
       assertTrue(dao.validarCPF(1234567891));
       
   }
   
   @Test
   public void testaGerarCodigo(){
      ClienteDAO dao = new ClienteDAO();
      //espero que tenha sucesso pois ele não conseguirá recuperar código algum
      assertNotNull(dao.gerarCodigo());
   }
   
   
   @Test public void testaVoltaCashCliente(){
       ClienteDAO dao = new ClienteDAO();
       assertNotNull(dao.voltaCashCliente());
   }

  
}
