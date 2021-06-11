package homework_1;

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
				+"\n"+ "M�hendislik Hesap Makinesi i�in 2'ye bas�n�z.");
		        int x = scan.nextInt();
		
		      //Basit Hesap Makinesi ��lem Ba�lang�c�
		        
		       
 if(x==1) {
			
			System.out.println("Basit Hesap Makinesini Se�tiniz."
					+"\n"+ "�imdi L�tfen Yapmak �stedi�iniz ��lemi Se�iniz: "
					+"\n"+ "Toplama ��lemi ��in 1'e Bas�n�z."
					+"\n"+ "��karma ��lemi ��in 2'ye Bas�n�z."
					+"\n"+ "�arpma ��lemi ��in 3'e Bas�n�z."
					+"\n"+ "B�lme ��lemi ��in 4'e Bas�n�z.");
			int y = scan.nextInt();
			if(y==1) {
				
				    System.out.println("Toplama ��lemi ��in �lk Say�y� Giriniz: ");
				    double a = scan.nextDouble();
				    System.out.println("Toplama ��lemi ��in �kinci Say�y� Giriniz: ");
				    double b = scan.nextDouble();
				    basit.toplama(a,b);
			}
			else if(y==2) {
				
			    System.out.println("��karma ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("��karma ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.cikarma(a,b);
		  }
			else if(y==3) {
				
			    System.out.println("�arpma ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("�arpma ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.carpma(a,b);
		 }
			else if(y==4) {
				
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
 else if (x==2) {
			System.out.println("M�hendislik Hesap Makinesini Se�tiniz."
					+"\n"+ "�imdi L�tfen Yapmak �stedi�iniz ��lemi Se�iniz: "
					+"\n"+ "Toplama ��lemi ��in 1'e Bas�n�z."
					+"\n"+ "��karma ��lemi ��in 2'ye Bas�n�z."
					+"\n"+ "�arpma ��lemi ��in 3'e Bas�n�z."
					+"\n"+ "B�lme ��lemi ��in 4'e Bas�n�z."
					+"\n"+ "�s Alma ��lemi ��in 5'e Bas�n�z."
					+"\n"+ "Kare K�k Alma ��lemi ��in 6'ya Bas�n�z."
					);
			int z = scan.nextInt();
			
			if(z==1) {
				
				System.out.println("Toplama ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("Toplama ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.toplama(a,b);
			}
			
			else if(z==2) {
				
				System.out.println("��karma ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("��karma ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.cikarma(a,b);
			}
			
            else if(z==3) {
				
				System.out.println("�arpma ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("�arpma ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.carpma(a,b);
			}
			
            else if(z==4) {
				
				System.out.println("B�lme ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("B�lme ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    basit.bolme(a,b);
			}
			
               else if(z==5) {
				
				System.out.println("�s Alma ��lemi ��in �lk Say�y� Giriniz: ");
			    double a = scan.nextDouble();
			    System.out.println("�s Alma ��lemi ��in �kinci Say�y� Giriniz: ");
			    double b = scan.nextDouble();
			    muh.usalma(a,b);
			}
			
               else if(z==6) {
   				
   				System.out.println("Karek�k Alma ��lemi ��in Say� Giriniz: ");
   			    double a = scan.nextDouble();
   			    muh.karekokalma(a);
   			}
			
               else {
            	   System.out.println("Yanl�� Giri� Yapt�n�z.");
            	   
               }
			
 }// M�hendislik Hesap Makinesi ��lem Sonu
 
 else {
			
			System.out.println("Yanl�� Se�im Yapt�n�z.");
			continue;
		}
	  }
		
	}

}
