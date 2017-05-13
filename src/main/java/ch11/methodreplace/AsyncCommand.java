package ch11.methodreplace;

public class AsyncCommand implements Command {

	@Override
	public Object execute() {
		System.out.println("Async command execute.");
		return "Execute result.";
	}
}