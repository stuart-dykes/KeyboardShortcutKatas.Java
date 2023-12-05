package keyboardshortcutkatas;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InlineTest {

	@Test
	public void testPracticeMethod() {
		var r = new Inline().practice();
		Assertions.assertThat( r ).isEqualTo( 42 );
	}
}

