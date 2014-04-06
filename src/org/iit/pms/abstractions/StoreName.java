package org.iit.pms.abstractions;

public enum StoreName {
	HOICOI, BANGLA_KHABAR;
	public String toString() {
		switch (this) {
		case HOICOI:
			return "hoicoi";
		case BANGLA_KHABAR:
			return "bangla khabar";

		default:
			return "no store available";
		}
	};
}
