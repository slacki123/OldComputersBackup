package intermediate;

public class TooHot {
	public boolean isSummer(int temperature) {
		boolean isSummer;
		if(temperature>60 && temperature<90) {
			isSummer = true;
		}
		else {
			isSummer=false;
		}
	return isSummer;
	}
}
