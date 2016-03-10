package org.maventest.maventest;

import org.junit.Assert;
import org.junit.Test;
import org.maventest.maventest.Repondre;

public class RepondreTest {

	@Test
	public void disBonjour() {
		Assert.assertEquals("Bonjour toto", 
				Repondre.bonjour("toto") );
	}
	
	public void disAuRevoir() {
		Assert.assertEquals("Au revoir tata", 
				Repondre.bonjour("tata") );
	}
	
	
}
