package com.maurie.driver;

import com.maurie.beans.Cat;
import com.maurie.beans.Cryptid;

public class Driver {
	public static void main (String [] args) { 
	Cat c = new Cat();
	c.setCoatPattern("stripe");
	c.setColor("black/brown");
	c.setSpecies("tiger");
	
	System.out.println(c);
	
	Cryptid cd = new Cryptid();
	cd.setDangerLevel("high");
	cd.setLocation("Georgia");
	cd.setName("Altamaha-ha");
	
	System.out.println(cd);
	
}
}
