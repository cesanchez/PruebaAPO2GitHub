package application;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import modelo.Fibonacci;
//import modelo.HiloFibonacci;

public class SampleController {
	
	private Main main;
	@FXML
	private TextField num;
	
	public SampleController() {
		
	}
	
	@FXML
	public void calcularSerie() {
		Fibonacci fib = main.darFibonacci();		
		fib.setNombre("fibonacci 2");
		fib.setTamaño(Integer.parseInt(num.getText()));
		
//		HiloFibonacci hilo = new HiloFibonacci(fib);
//		hilo.start();
	}
}
