/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testes;



import entidade.Empresa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Alberto Pereira
 */
public class EmpresaTest {
    
   @Test
   public void testaConstrutorComNumeroDeContratoNegativo(){
       Empresa empresa = new Empresa(-212121999,"EmpresaA");
       assertEquals(-212121999,empresa.getNumeroContrato());
   }
   
   @Test
   public void testaSetNumeroDeContratoNegativo(){
       Empresa empresa = new Empresa(12345,"EmpresaA");
       empresa.setNumeroContrato(-999);
       assertEquals(-999,empresa.getNumeroContrato());
   }
   
   @Test
   public void testaGetNomeDaEmpresaMesmoComNumeroDeContratoNegativo(){
       Empresa empresa = new Empresa(-99999,"EmpresaA");
       String nome_empresa = empresa.getNomeEmpresa();
       assertEquals("EmpresaA",nome_empresa);
   }
   @Test
   public void testaCriarEmpresasComNomesIguais(){
       Empresa empresa = new Empresa(123,"EmpresaTeste");
       Empresa empresa2 = new Empresa(123,"EmpresaTeste");
       assertEquals("EmpresaTeste",empresa.getNomeEmpresa(),empresa2.getNomeEmpresa());
   }
   @Test
   public void testaCriarEmpresasComNumeroDeContratosIguaisENomesDiferentes(){
       Empresa empresa = new Empresa(123,"EmpresaA");
       Empresa empresa2 = new Empresa(123,"EmpresaB");
       assertEquals(123,empresa.getNumeroContrato(),empresa2.getNumeroContrato());
   }
   @Test
   public void testaCriarEmpresasComNumeroDeContratosNegativosEIguais(){
       Empresa empresa = new Empresa(-9999,"EmpresaA");
       Empresa empresa2 = new Empresa(-9999,"EmpresaB");
       assertEquals(-9999,empresa.getNumeroContrato(),empresa2.getNumeroContrato());
   }
}
