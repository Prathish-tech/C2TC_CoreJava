package Day7.Overriding.Covariant;

//base class
class Color {
	// method getcolor returns an object of type color
	protected Color getColor() {
		Color s = new Color();
		return s;
	}
}

