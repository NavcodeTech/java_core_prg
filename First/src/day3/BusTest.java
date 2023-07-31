package day3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusTest {

	Bus bus1;
	Bus bus2;
	@BeforeEach
	void setUp() throws Exception {
		bus1=new Bus(10001,"delhi-gurgaon",100);
		bus2=new Bus(10001,"delhi-gurgaon",100);
	}

	@Test
	void testEqualsObject() {
		assertEquals(bus1,bus2);
	}
	@Test
	void testGetBusId() {
		//fail("Not yet implemented");
		assertEquals(bus1.getBusId(),10001);
	}

	@Test
	void testGetBusRoute() {
		//fail("Not yet implemented");
		assertEquals(bus1.getBusRoute(),"delhi-gurgaon");
	}

	@Test
	void testGetBusFare() {
		//fail("Not yet implemented");
		assertEquals(100,bus1.getBusFare());
	}


}
