import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EsercitazioneJUnit {

	private MainTrapezio mainTrapezio;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		mainTrapezio = new MainTrapezio();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalcolaArea1() {
		
		double risultatoAtteso = 4.5;
		double risultatoOttenuto = mainTrapezio.calcolaArea(1, 2, 3);
		
		assertEquals(risultatoAtteso, risultatoOttenuto, 0.1);
	}
	@Test
	void testCalcolaArea2() {
		
		double risultatoAtteso = 25;
		double risultatoOttenuto = mainTrapezio.calcolaArea(5, 5, 5);
		
		assertEquals(risultatoAtteso, risultatoOttenuto, 0.1);
		
	}
	@Test
	void testCalcolaArea3() {
		
		double risultatoAtteso = 82;
		double risultatoOttenuto = mainTrapezio.calcolaArea(32, 1, 5);
		
		assertEquals(risultatoAtteso, risultatoOttenuto, 0.1);
			
	}

}
