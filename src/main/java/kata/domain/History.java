package kata.domain;

import services.printer.PrinterService;

import java.util.ArrayList;
import java.util.List;

public class History {
	
	private final List<Operation> operations;
	
	public History() {
		this.operations = new ArrayList<>();
	}
	
	public void addOperation(Operation operation) {
		this.operations.add(operation);
	}
	
	public void getPrintStatement() {
		StringBuilder sb = new StringBuilder("Operation | Date | Amount | Balance").append("\n");
		for (Operation operation: this.operations) {
			sb.append(operation.toString()).append("\n");
		}
		PrinterService.printSimpleString(sb.toString());
	}

	
}
