/*
 * <u>Classe principale MainTrapezio</u>
 * 
 * @author Reho Lorenzo 4CI
 * @version 3.0
 * 
 * */
public class MainTrapezio {
	
	/*
	 * Metodo costruttore della classe MainTrapezio
	 * 
	 * */
	public MainTrapezio() {
		
	}
	
	
	/*
	 * Funzione che calcola l'area del trapezio
	 * 
	 * è stato riscontrato un errore durante il testing sull'input 31 1 5
	 * 
	 * @param b
	 * @param B
	 * @param h
	 * 
	 * @return area del trapezio
	 * 
	 * */
	public double calcolaArea(double b, double B, double h) {
		return (b+B)*h/2;
	}
	
	/*
	 * 
	 * Metodo main 
	 * 
	 * */
	public static void main(String[] args) {
		MainTrapezio mainTrapezio = new MainTrapezio();
		System.out.println(mainTrapezio.calcolaArea(1,  2, 3));
	}
}
