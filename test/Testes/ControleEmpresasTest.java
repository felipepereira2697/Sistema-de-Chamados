/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleEmpresas;
import entidade.Empresa;
import Persistencia.EmpresaDAO;
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
public class ControleEmpresasTest {
    
   @Test(expected = NullPointerException.class)
   public void testaValidar(){
       EmpresaDAO dao = new EmpresaDAO();
       Collection<Empresa>empresas = null;
       Empresa empresa = new Empresa(1,"Empresa");
       empresas.add(empresa);
       ControleEmpresas controle_empresas = new ControleEmpresas();
       int validou = controle_empresas.validar(1, empresa.getNomeEmpresa());
       assertEquals(1,validou);
   }
}
