package restuarant1.main;

import java.io.IOException;

import hu.elte.txtuml.api.model.Action;
import hu.elte.txtuml.api.model.execution.ModelExecutor;
import restuarant1.model.Customer;
import restuarant1.model.signal.GetMenu;


public class Main {
	
	static Customer come;

	static void init() {
		come = Action.create(Customer.class);
		Action.start(come);
	}

	public static void main(String[] args) throws IOException {
		ModelExecutor.create().setTraceLogging(true).start(Main::init);
		System.in.read();
		Action.send(new GetMenu(), come);
		
			}
}

