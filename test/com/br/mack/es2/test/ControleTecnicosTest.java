/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.controle.ControleTecnicos;
import com.br.mack.es2.entidade.Tecnico;
import com.br.mack.es2.persistencia.TecnicoDAO;
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
   }
}
