package nTierFourth.core;

public class DatabaseLogger implements ILogger{

	@Override
	public void log(String data) {
		System.out.println("logger : DatabaseLogger'da " + data);
		
	}

}
