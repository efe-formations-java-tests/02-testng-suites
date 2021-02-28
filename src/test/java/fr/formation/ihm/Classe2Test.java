package fr.formation.ihm;

import org.testng.annotations.Test;

public class Classe2Test {

	
	@Test(priority = 400)
	public void test1Classe2() {
		
	}
	
	@Test(groups = "regression", priority = 10)
	public void test2Classe2() {
		
	}
	
	@Test(priority = -10)
	public void test3Classe2() {
		
	}
	
	@Test(groups = {"important", "classe2"})
	public void test4Classe2() {
	}
	
	
	@Test(enabled = false)
	public void test5Classe2() {
		
	}

}
