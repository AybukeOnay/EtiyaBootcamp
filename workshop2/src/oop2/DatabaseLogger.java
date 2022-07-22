package oop2;

public class DatabaseLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("database loglandı :" + data);
		
	}

}
