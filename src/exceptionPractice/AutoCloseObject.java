package exceptionPractice;

public class AutoCloseObject implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("Close() »£√‚");
	}

}
