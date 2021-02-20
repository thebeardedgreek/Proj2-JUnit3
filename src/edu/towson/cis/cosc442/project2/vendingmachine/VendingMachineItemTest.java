package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineItemTest {
	
	//declare VendingMachine object
	private VendingMachineItem vendingMachineItem1;

	
	@Test
	//creates a vending machine item named Chips, then checks if that item name can be verified through accessEquals with .getName()
	public void testGetName() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals("Chips", vendingMachineItem1.getName());
	}
	
	@Test
	//creates a vending machine item named Chips, then checks if that item price can be verified through accessEquals with .getPrice()
	public void testGetPrice() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals(2.99, vendingMachineItem1.getPrice(), 0);
	}
}
