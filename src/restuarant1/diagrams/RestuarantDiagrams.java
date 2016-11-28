package restuarant1.diagrams;

import hu.elte.txtuml.api.layout.ClassDiagram;
import hu.elte.txtuml.api.layout.Column;
import hu.elte.txtuml.api.layout.Row;
import hu.elte.txtuml.api.layout.Spacing;
import hu.elte.txtuml.api.layout.TopMost;
import restuarant1.model.Cashier;
import restuarant1.model.Cooker;
import restuarant1.model.Customer;
import restuarant1.model.People;
import restuarant1.model.Waiter;
import restuarant1.model.Worker;

class RestuarantClasses extends ClassDiagram {
	@Spacing(0.5)
	@TopMost(People.class)
	@Row({Customer.class, Worker.class})
	@Column({People.class, Worker.class,Waiter.class})
	@Row({Cooker.class, Waiter.class, Cashier.class})
	class RestuarantLayout extends Layout {}
}






