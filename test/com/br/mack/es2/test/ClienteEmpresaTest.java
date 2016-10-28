/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.entidade.ClienteEmpresa;
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
public class ClienteEmpresaTest {
    
    public ClienteEmpresaTest() {
    }
    
    @Test
    public void testaSetCodigoNegativo(){
        Empresa empresa = new Empresa(1,"EmpresaTeste");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(21,empresa,12345678,"NomeTeste",23321);
        cliente_empresa.setCodigo(-21);
        assertNotNull(cliente_empresa.getCodigo());
    }

   
}

