/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import controle.ControleChamados;
import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
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
public class ControleChamadosTest {

    @Test
    public void testaAlterarChamado() {
        Tecnico tecnico = new Tecnico("TecnicoTeste", 1);
        Empresa empresa = new Empresa(1, "TesteEmpresa");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(1, empresa, 321312, "", 312312321);
        Chamado chamado = new Chamado(1, "TesteTitulo", "TesteDesc", 9, tecnico, cliente_empresa, "SOTeste", 
                "VersaoSOTest", "TipoConexaoTest", "EndRedeTest");
        ControleChamados controleChamados = new ControleChamados();
        controleChamados.alterarChamado(chamado,"StatusTeste","CausaTeste","SoluçãoTeste");
        assertEquals("StatusTeste",chamado.getStatus());
        assertEquals("CausaTeste",chamado.getCausaProblema());
        assertEquals("SoluçãoTeste",chamado.getSolucaoProblema());
    }
    
    @Test
    public void testaGetChamadoAlterado(){
        
        Tecnico tecnico = new Tecnico("TecnicoTeste", 1);
        Empresa empresa = new Empresa(1, "TesteEmpresa");
        ClienteEmpresa cliente_empresa = new ClienteEmpresa(1, empresa, 321312, "", 312312321);
        Chamado chamado = new Chamado(1, "TesteTitulo", "TesteDesc", 9, tecnico, cliente_empresa, "SOTeste", 
                "VersaoSOTest", "TipoConexaoTest", "EndRedeTest");
        
        ControleChamados controleChamados = new ControleChamados();
        controleChamados.setChamadoAlterado(chamado);
        //se agora o chamado foi realmente alterado
        assertSame(chamado,controleChamados.getChamadoAlterado());
        
    }
}
