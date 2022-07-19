package sample;

import org.testng.annotations.Test;

public class MavenPractImportingFromCmd {
	
	@Test
	public void praticetest1() {
		System.out.println("hello");
		System.out.println("TYSS1");
		String admin = System.getProperty("ADMIN");
		System.out.println(admin);
		String password = System.getProperty("MISSIONIMPOSSIBLE");
		System.out.println(password);
		
		
		
	}
	

}
