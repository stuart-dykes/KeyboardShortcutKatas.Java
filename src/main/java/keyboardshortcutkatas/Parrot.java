package keyboardshortcutkatas;

public class Parrot {

	private final boolean _isNailed;
	private final int _numberOfCoconuts;
	private final Type _type;
	private final double _voltage;

	public Parrot( Type type, int numberOfCoconuts, double voltage, boolean isNailed ) {
		_type = type;
		_numberOfCoconuts = numberOfCoconuts;
		_voltage = voltage;
		_isNailed = isNailed;
	}

	public static Parrot createParrot( Type type, int numberOfCoconuts, double voltage,
			boolean isNailed ) {
		return new Parrot( type, numberOfCoconuts, voltage, isNailed );
	}

	public double GetSpeed() {
		switch ( _type ) {
		case EUROPEAN:
			return GetBaseSpeed();
		case AFRICAN:
			return Math.max( 0, GetBaseSpeed() - GetLoadFactor() * _numberOfCoconuts );
		case NORWEGIAN_BLUE:
			return _isNailed ? 0 : GetBaseSpeed( _voltage );
		}

		throw new RuntimeException( "Should be unreachable" );
	}

	private double GetBaseSpeed( double voltage ) {
		return Math.min( 24.0, voltage * GetBaseSpeed() );
	}

	private double GetLoadFactor() {
		return 9.0;
	}

	private double GetBaseSpeed() {
		return 12.0;
	}

	public enum Type {
		EUROPEAN,
		AFRICAN,
		NORWEGIAN_BLUE
	}
}

