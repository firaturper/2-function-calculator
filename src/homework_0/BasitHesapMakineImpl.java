package homework_0;

public class BasitHesapMakineImpl implements BasitHesapMakine {
	
	@Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
    public double toplama(double a,double b) {
		System.out.println(a+b);
 	return a+b;
     }
	@Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
    public double cikarma(double a,double b) {
		System.out.println(a-b);
		return a-b;
     }
	@Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
    public double carpma(double a,double b) {
		System.out.println(a*b);
		return a*b;
     }
	@Override //interfaceden al�nan metotta bir i�lem yap�laca��ndan �ncesinde 'override' edilir.
    public double bolme(double a,double b) {
		System.out.println(a/b);
     	return a/b;
     }
}