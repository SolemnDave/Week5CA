package Week5CA;

public class App {

	public static void main(String[] args) {

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();

		asteriskLogger.log("Hello");
		asteriskLogger.error("Hello");

		spacedLogger.log("Spaced");
		spacedLogger.error("Spaced");

	}
}
