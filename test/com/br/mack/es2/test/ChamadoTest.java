/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;

import com.br.mack.es2.entidade.Chamado;
import com.br.mack.es2.entidade.ClienteEmpresa;
import com.br.mack.es2.entidade.Empresa;
import com.br.mack.es2.entidade.Tecnico;
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
public class ChamadoTest {
    
    public ChamadoTest() {
    }
    
 
    @Test
    public void testaConstrutorComPrioridadeNegativa(){
            Tecnico tecnico = new Tecnico("TecnicoTeste",1);
            Empresa empresa = new Empresa(1,"TesteEmpresa");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,321312,"",312312321);
            Chamado chamado = new Chamado(1,"TesteTitulo","TesteDesc",-9,tecnico,cliente_empresa,"SOTeste","VersaoSOTest","TipoConexaoTest","EndRedeTest");
            assertNotNull(chamado);
        
    }
    @Test
    public void testaConstrutorComCodigoNegativo(){
        Tecnico tecnico = new Tecnico("TecnicoTeste",1);
            Empresa empresa = new Empresa(1,"TesteEmpresa");
            ClienteEmpresa cliente_empresa= new ClienteEmpresa(1,empresa,321312,"",312312321);
            Chamado chamado = new Chamado(-1,"TesteTitulo","TesteDesc",9,tecnico,cliente_empresa,"SOTeste","VersaoSOTest","TipoConexaoTest","EndRedeTest");
            assertNotNull(chamado);
    }
}
