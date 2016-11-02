/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.controle.ControladorPrincipal;
import com.br.mack.es2.controle.ControleEmpresas;
import com.br.mack.es2.entidade.Empresa;
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
    
   @Test
   public void testaInserir(){
       ControladorPrincipal cp = new ControladorPrincipal();
       ControleEmpresas controle_empresas = cp.getCtrEmpresa();
       Empresa empresa = new Empresa(9090,"TesteEmpresa");
       controle_empresas.inserir(empresa.getNumeroContrato(),empresa.getNomeEmpresa());
       boolean inseriu = controle_empresas.checar(new Long(9090), "EmpresaTeste");
       assertEquals(true,inseriu);
   }
}
