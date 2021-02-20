package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {

	private VendingMachine vendingMachine1;
	public VendingMachineItem vendingMachineItem1;
	//private double userBalance = 0.00;
	
	
	public void setUp() throws Exception {
		vendingMachine1 = new VendingMachine();
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		vendingMachine1.insertMoney(5.00);
		
	}

	
	@Test 
	public void testaddItem() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals("Chips", vendingMachineItem1.getName());
	}
	
	public void testRemoveItem() {
		
	}
	
	@Test
	public void testInsertMoney() {
		
	}
	
	@Test
	public void getBalance() {
		assertEquals(5.00, vendingMachine1.getBalance());
	}
	
	public void testMakePurchase() {
		
	}
	
	public void returnChange() {
		
	}	
	
}
