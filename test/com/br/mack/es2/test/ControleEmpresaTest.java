/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.controle.ControladorPrincipal;
import com.br.mack.es2.controle.ControleEmpresas;
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
public class ControleEmpresaTest {
    
   @Test(expected=NullPointerException.class)
   public void testaChecar(){
       Collection<Empresa> empresas = null;
       ControleEmpresas controle_empresas = new ControleEmpresas();
       Empresa empresa = new Empresa(9090,"TesteEmpresa");
       empresas.add(empresa);
       boolean checou = controle_empresas.checar(empresa.getNumeroContrato(),empresa.getNomeEmpresa());
       assertEquals(true,checou);
   }
}
