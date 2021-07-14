package homework_0;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BasitHesapMakineImpl basit = new BasitHesapMakineImpl();
		MuhendislikHesapMakineImpl muh = new MuhendislikHesapMakineImpl();
			
		//Hesap Makinesi Se�imi
		 while(true) {
			 
			 System.out.println("L�tfen Hesap Makinesi T�r� Se�iniz: "
						+"\n"+ "Basit Hesap Makinesi i�in 1'e bas�n�z."
						+"\n"+ "M�hendislik Hesap Makinesi i�in 2'e bas�n�z.");
				        String x = scan.next(); /* 1 ve 2 d���nda bir karakter girildi�inde hata vermemesi 
				        i�in klavyeden al�nan de�er String tipinde bir de�ermi� gibi al�nd�  */ 
				
				      //Basit Hesap Makinesi ��lem Ba�lang�c�
				        
				       
		 if(x.equals("1")) {
					
					System.out.println("Basit Hesap Makinesini Se�tiniz."
							+"\n"+ "�imdi L�tfen Yapmak �stedi�iniz ��lemi Se�iniz: "
							+"\n"+ "Toplama ��lemi ��in 1'e Bas�n�z."
							+"\n"+ "��karma ��lemi ��in 2'ye Bas�n�z."
							+"\n"+ "�arpma ��lemi ��in 3'e Bas�n�z."
							+"\n"+ "B�lme ��lemi ��in 4'e Bas�n�z.");
					String y = scan.next(); // Burada da x girdisi i�in d���n�len mant�k i�liyor 
					if(y.equals("1")) {
						
						    System.out.println("Toplama ��lemi ��in �lk Say�y� Giriniz: ");
						    double a = scan.nextDouble();
						    System.out.println("Toplama ��lemi ��in �kinci Say�y� Giriniz: ");
						    double b = scan.nextDouble();
						    basit.toplama(a,b);
						  
					}
					else if(y.equals("2")) {
						
					    System.out.println("��karma ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("��karma ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.cikarma(a,b);
					   
					    
				  }
					else if(y.equals("3")) {
						
					    System.out.println("�arpma ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("�arpma ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.carpma(a,b);
					    
				 }
					else if(y.equals("4")) {
						
					    System.out.println("B�lme ��lemi ��in �lk Say�y� Giriniz: "); 
					    double a = scan.nextDouble();
					    System.out.println("B�lme ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.bolme(a,b);
					   
					    
				} 
					else {
						System.out.println("Yanl�� Giri� Yapt�n�z.");
						
					}
					
		 } //Basit Hesap Makinesi ��lem Sonu
		 //M�hendislik Hesap Makinesi ��lem Ba�lang�c�
		 else if (x.equals("2")) {
					System.out.println("M�hendislik Hesap Makinesini Se�tiniz."
							+"\n"+ "�imdi L�tfen Yapmak �stedi�iniz ��lemi Se�iniz: "
							+"\n"+ "Toplama ��lemi ��in 1'e Bas�n�z."
							+"\n"+ "��karma ��lemi ��in 2'ye Bas�n�z."
							+"\n"+ "�arpma ��lemi ��in 3'e Bas�n�z."
							+"\n"+ "B�lme ��lemi ��in 4'e Bas�n�z."
							+"\n"+ "�s Alma ��lemi ��in 5'e Bas�n�z."
							+"\n"+ "Kare K�k Alma ��lemi ��in 6'ya Bas�n�z."
							);
					String z = scan.next(); // t�pk� x ve y girdisi i�in d���n�len mant�k
					
					if(z.equals("1")) {
						
						System.out.println("Toplama ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("Toplama ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.toplama(a,b);
					    
					}
					
					else if(z.equals("2")) {
						
						System.out.println("��karma ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("��karma ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.cikarma(a,b);
					 
					}
					
		            else if(z.equals("3")) {
						
						System.out.println("�arpma ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("�arpma ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.carpma(a,b);
					   
					}
					
		            else if(z.equals("4")) {
						
						System.out.println("B�lme ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("B�lme ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    basit.bolme(a,b);
					   
					}
					
		               else if(z.equals("5")) {
						
						System.out.println("�s Alma ��lemi ��in �lk Say�y� Giriniz: ");
					    double a = scan.nextDouble();
					    System.out.println("�s Alma ��lemi ��in �kinci Say�y� Giriniz: ");
					    double b = scan.nextDouble();
					    muh.usalma(a,b);
					    
					}
					
		               else if(z.equals("6")) {
		   				
		   				System.out.println("Karek�k Alma ��lemi ��in Say� Giriniz: ");
		   			    double a = scan.nextDouble();
		   			    muh.karekokalma(a);
		   			
		   			}
					
		               else {
		            	   System.out.println("Yanl�� Giri� Yapt�n�z.");
		            	   
		               }
					
		 }// M�hendislik Hesap Makinesi ��lem Sonu
		 
		 else { /* Klavyeye 1 ve 2 d���n�nda girilen her de�er buraya y�nlenir */
					
					System.out.println("Yanl�� Giri� Yapt�n�z.");
					continue;
				}
		
     }
		
		} 
	}

