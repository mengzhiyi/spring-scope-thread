package ch11.methodreplace;

public class Manager {
	private AsyncCommand command;

	// inject
	public void setCommand(AsyncCommand command) {
		this.command = command;
	}
	
	public void process() {
		command.execute();
		System.out.println(command); 
	}
}
