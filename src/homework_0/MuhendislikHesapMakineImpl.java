package homework_0;

public class MuhendislikHesapMakineImpl implements MuhendislikHesapMakine {
	
	        @Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
		    public double usalma(double a,double b) {
	        	System.out.println(Math.pow(a,b));
			return Math.pow(a,b);
			 }
	        @Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
		    public double karekokalma(double a) {
	        	System.out.println(Math.sqrt(a));
			return Math.sqrt(a);
		     }
	
		
		
}
