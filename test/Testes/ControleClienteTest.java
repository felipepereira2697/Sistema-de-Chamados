/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;



import controle.ControleClientes;
import entidade.ClienteEmpresa;
import entidade.Empresa;
import Persistencia.ClienteDAO;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe
 */
public class ControleClienteTest {
    
  @Test
  public void testaIncluiUmClienteNovo(){
      Empresa empresa = new Empresa(1,"Empresa");
      ClienteEmpresa clienteEmpresa = new ClienteEmpresa(22,empresa,12345678,"ClienteEmpresa",12345678);
      ControleClientes cc = new ControleClientes();
      //verificar se o retorno do método incluiNovoCliente é um ClienteEmpresa
      assertEquals(true,cc.incluiNovoCliente(empresa, 0,clienteEmpresa.getNome(), 0) instanceof ClienteEmpresa);
      
  }
  
  @Test
  public void testaGetClienteDAO(){
      ClienteDAO dao = new ClienteDAO();
      ControleClientes cc = new ControleClientes();
      
      
      assertEquals(true,cc.getClienteDAO() instanceof ClienteDAO);
  }
}
