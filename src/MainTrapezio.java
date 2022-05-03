/*
 * <u>Classe principale MainTrapezio</u>
 * 
 * @author Reho Lorenzo 4CI
 * @version 1.0
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
