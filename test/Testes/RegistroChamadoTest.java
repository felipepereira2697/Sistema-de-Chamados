/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;

import entidade.Chamado;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import entidade.RegistroChamado;
import entidade.Tecnico;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


/**
 *
 * @author Felipe
 */
public class RegistroChamadoTest {
    
   @Test
   public void testaSetCodigoComNumeroNegativo(){
       Tecnico tecnico = new Tecnico("Tecnico",34546789);
       Empresa empresa = new Empresa(10,"EmpresaTeste");
       ClienteEmpresa cliente = new ClienteEmpresa(14,empresa,213213,"ClienteEmpresa",12345678);
       Chamado c = new Chamado(1,"ChamadoTeste","Teste de chamado",2,tecnico,
       cliente,"Linux","Versão 1.0 SO","ConexãoA","Endereço de rede");
       RegistroChamado rc = new RegistroChamado("AssuntoTeste",c,tecnico);
       rc.setCodigo(-9);
       assertNotNull(rc.getCodigo());
   }
   @Test
   public void testaSetTecnicoComTelefoneNegativo(){
       Tecnico tecnico = new Tecnico("Tecnico",-36766789);
       Empresa empresa = new Empresa(10,"EmpresaTeste");
       ClienteEmpresa cliente = new ClienteEmpresa(14,empresa,213213,"ClienteEmpresa",12345678);
       Chamado c = new Chamado(1,"ChamadoTeste","Teste de chamado",2,tecnico,
       cliente,"Linux","Versão 1.0 SO","ConexãoA","Endereço de rede");
       RegistroChamado rc = new RegistroChamado("AssuntoTeste",c,tecnico);
       
       assertEquals(-36766789,rc.getTecnico().getTelefone());
       assertNotNull(rc.getTecnico());
   }
}
