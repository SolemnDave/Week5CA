package Week5CA;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String str) {
		System.out.println("***" + str + "***");
	}

	@Override
	public void error(String error) {
		System.out.println("**********************");
		System.out.println("***Error: " + error + "***");
		System.out.println("**********************");

	}

}