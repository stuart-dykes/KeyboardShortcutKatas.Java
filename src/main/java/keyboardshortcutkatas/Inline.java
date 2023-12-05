
package keyboardshortcutkatas;

import java.util.function.Supplier;

public class Inline {

	int e = 2;

	public int practice() {
		var i = 2;
		var a = 5;
		var s = 2 - i;
		var j = ( B() - a + i );
		var m = F( 3 );
		if ( N() ) {
			m += 56;
		}
		var n = m;

		Supplier<Integer> k = () -> {
			var l = n + j;
			return l - C( e );
		};

		var q = 1 - O.Create().p;
		return 42 + k.get() + q + H( 7 ) + s;
	}

	private boolean N() {
		return false;
	}

	private static int F( int G ) {
		return -3 + G;
	}

	private static int C( int d ) {
		return d;
	}

	private static int B() {
		return 5;
	}

	public static int H( int that ) {
		return that - 7;
	}

	public static class O {

		public int p = 1;

		public static O Create() {
			return new O();
		}

	}

}
