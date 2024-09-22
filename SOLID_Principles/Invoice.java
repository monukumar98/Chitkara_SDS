package SOLID_Principles;

public class Invoice {
	Pen p;
	int count_of_pen;

	public int Create_Invoice() {
		return p.price * count_of_pen;
	}

//	public void printInvoice(Invoice v) {
//
//	}
//
//	public void SaveinDB(Invoice v) {
//
//	}

}
