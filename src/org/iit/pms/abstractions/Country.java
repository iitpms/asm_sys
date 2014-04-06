package org.iit.pms.abstractions;

public enum Country {
	BANGLADESH, INDIA, PAKISTAN, SRILANKA, AMERICA;
	public String toString() {
		switch (this) {
		case BANGLADESH:
			return "bangladesh";
		case INDIA:
			return "india";
		case PAKISTAN:
			return "pakistan";
		case SRILANKA:
			return "srilanka";
		case AMERICA:
			return "america";
		default:
			return "no countryn added";
		}
	};
}
