package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {

	//declares VendingMachine object and VendingMachineItem Object
	private VendingMachine vendingMachine1;
	private VendingMachineItem vendingMachineItem1;
	

	
	@Test 
	//creates a vending machine and a vending machine item named Chips, adds item Chips into machine,
	//then checks if that item name can be verified as in machine through accessEquals with .getName()
	public void testaddItem() {
		vendingMachine1 = new VendingMachine();
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		vendingMachine1.addItem(vendingMachineItem1, "A_CODE");
		assertEquals("Chips", vendingMachineItem1.getName());
	}
	
	@Test
	public void testRemoveItem() {
		
	}
	
	@Test
	//creates a vending machine, inserts $5 into machine,
	//then checks if that balance can be verified as in machine through accessEquals with .getBalance()
	public void testInsertMoney() {
		vendingMachine1 = new VendingMachine();
		vendingMachine1.insertMoney(5.00);
		assertEquals(5.00, vendingMachine1.getBalance(), 0);		
	}
	
	@Test
	//same as testInsertMoney check, just checking it at 0
	public void getBalance() {
		vendingMachine1 = new VendingMachine();
		assertEquals(0.00, vendingMachine1.getBalance(), 0);
	}
	
	@Test
	public void testMakePurchase() {
		
	}
	
	@Test
	//creates a vending machine, inserts $5 into machine, tells machine to return change
	//then checks if that balance can be verified as back to 0 in machine through accessEquals with .getBalance()
	public void returnChange() {
		vendingMachine1 = new VendingMachine();
		vendingMachine1.insertMoney(5.00);
		vendingMachine1.returnChange();
		assertEquals(0.00, vendingMachine1.getBalance(), 0);
		
	}	
	
}
