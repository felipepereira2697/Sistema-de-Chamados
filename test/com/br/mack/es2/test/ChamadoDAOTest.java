/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.mack.es2.test;


import com.br.mack.es2.entidade.Chamado;
import com.br.mack.es2.entidade.RegistroChamado;
import com.br.mack.es2.persistencia.ChamadoDAO;
import java.util.Collection;
import java.util.HashMap;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Felipe
 */


public class ChamadoDAOTest {

    @Test
    public void testaConstrutorChamadoDAO() {
        ChamadoDAO dao = new ChamadoDAO();
        HashMap<Integer, Chamado> cashChamado = new HashMap<>();
        HashMap<Integer, Chamado> cashRegistroChamado = new HashMap<>();
        assertNotNull(dao);
    }

    @Test
    public void testaGetChamados() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<Chamado> chamados = dao.getChamados();
        assertNotNull(chamados);
    }

    @Test
    public void testGetRegistrosNaoNulos() {
        ChamadoDAO dao = new ChamadoDAO();
        Collection<RegistroChamado> registros = dao.getRegistros();
        assertNotNull(registros);
    }
}
