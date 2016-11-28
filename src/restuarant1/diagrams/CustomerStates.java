package restuarant1.diagrams;

import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.StateMachineDiagram;
import restuarant1.model.Customer;


class CustomerStates extends StateMachineDiagram<Customer> {
	
	@Row({Customer.Waiting.class, Customer.StartSelection.class, Customer.OrderSteak.class, Customer.Paying.class, Customer.Eating.class})
	@Column({Customer.OpenDoor.class, Customer.Waiting.class})
	
	@Row({Customer.OrderNoodle.class, Customer.OrderSalad.class})
	@Column({Customer.StartSelection.class, Customer.SaladOrNoodle.class, Customer.OrderNoodle.class})
	
	//@Row({Customer.Eating.class, Customer.CloseDoor.class})
	@Column({Customer.Eating.class,Customer.CloseDoor.class})
		
		class L extends Layout {}
}
