/**
 * 
 * @author Yanilda Peralta 
 * 
 */


import java.io.StringWriter;
import java.io.PrintWriter;


public class Program3 {
	public static void main(String[] args) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		
		pw.println("Farhana likes to eat ice cream!");
		pw.println("Raynaldo likes to eat tacos");
		pw.println("Crystal likes to travel");
		pw.printf("Liesel won $ %3d ! %n ", 4000000);
		
		
		
		String message = sw.toString();
		System.out.println(message);
		
		

	}
}
