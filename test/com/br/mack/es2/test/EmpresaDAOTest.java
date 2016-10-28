/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;



import com.br.mack.es2.entidade.Empresa;
import com.br.mack.es2.persistencia.EmpresaDAO;
import java.util.Collection;
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
public class EmpresaDAOTest {
    
   
    @Test
   public void testaGetEmpresas(){
       EmpresaDAO dao = new EmpresaDAO();
       Collection<Empresa> empresas = dao.getEmpresas();
       assertNotNull(empresas);
   }
   
   @Test
   public void testeVoltaEmpresa(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao.voltaEmpresa());
   }
   
   @Test 
   public void testaConstrutorEmpresaDAO(){
       EmpresaDAO dao = new EmpresaDAO();
       assertNotNull(dao);
   }
}
