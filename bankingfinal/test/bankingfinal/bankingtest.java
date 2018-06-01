package bankingfinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *tt
 * @author sjadh
 */
public class bankingtest {
    banking b;
    
    public bankingtest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        b=new banking();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAddaccount(){
        assertEquals(1200,b.testAddaccount(1200));
    }
    
    @Test
    public void testDeposit(){
      assertEquals(5200,b.testDeposit(200,1200,1200,5000));  
    }
    
     @Test
    public void testWithdraw(){
      assertEquals(4910,b.testWithdraw(290,1200,1200,5200));  
    }
    
     @Test
    public void testBalance(){
       assertEquals(4910,b.testBalance(4910)); 
        
    }
    
   
}
