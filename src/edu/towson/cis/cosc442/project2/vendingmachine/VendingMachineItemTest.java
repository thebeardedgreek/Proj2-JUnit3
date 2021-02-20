package edu.towson.cis.cosc442.project2.vendingmachine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineItemTest {
	
	private VendingMachineItem vendingMachineItem1;

	
	public void setUp() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals("Chips", vendingMachineItem1.getName());
		assertEquals(2.99, vendingMachineItem1.getPrice(), 0);
	}

	
	@Test 
	public void testGetName() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals("Chips", vendingMachineItem1.getName());
	}
	
	@Test 
	public void testGetPrice() {
		vendingMachineItem1 = new VendingMachineItem("Chips", 2.99);
		assertEquals(2.99, vendingMachineItem1.getPrice(), 0);
	}
}
