/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vetcomm.principal;

import modelo.Cliente;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import persistencia.ClienteManager;
import static org.junit.Assert.*;

/**
 *
 * @author Kal-El
 */
public class ClienteTest {
    
    public ClienteTest() {
    }

     @Test
     public void hello() {
         ClienteManager cM = new ClienteManager();
         Cliente cPrueba = new Cliente("175826394", "Boris", "Garibaldi 0935", 737637, "anum.bmr.01@gmail.com");
         cM.insert(cPrueba);
//         cM.deleteById("1758294");
     
     }
}
