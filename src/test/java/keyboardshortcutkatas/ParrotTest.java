package keyboardshortcutkatas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ParrotTest {

	@Test
	public void getSpeedNorwegianBlueParrot_nailed() {
		var parrot = new Parrot( Parrot.Type.NORWEGIAN_BLUE, 0, 0, true );
		assertEquals( 0.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed() {
		var parrot = new Parrot( Parrot.Type.NORWEGIAN_BLUE, 0, 1.5, false );
		assertEquals( 18.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedNorwegianBlueParrot_not_nailed_high_voltage() {
		var parrot = new Parrot( Parrot.Type.NORWEGIAN_BLUE, 0, 4, false );
		assertEquals( 24.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedOfAfricanParrot_With_No_Coconuts() {
		var parrot = new Parrot( Parrot.Type.AFRICAN, 0, 0, false );
		assertEquals( 12.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedOfAfricanParrot_With_One_Coconut() {
		var parrot = new Parrot( Parrot.Type.AFRICAN, 1, 0, false );
		assertEquals( 3.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedOfAfricanParrot_With_Two_Coconuts() {
		var parrot = new Parrot( Parrot.Type.AFRICAN, 2, 0, false );
		assertEquals( 0.0, parrot.GetSpeed() );
	}

	@Test
	public void getSpeedOfEuropeanParrot() {
		var parrot = new Parrot( Parrot.Type.EUROPEAN, 0, 0, false );
		assertEquals( 12.0, parrot.GetSpeed() );
	}
}

    
