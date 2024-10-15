package hedefKalphiziHesaplayici;

import java.util.Scanner;

public class HeartRateTest {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Adınızı girin: ");
	        String ad = scanner.nextLine();

	        System.out.print("Soyadınızı girin: ");
	        String soyad = scanner.nextLine();

	        System.out.print("Doğum yılınızı girin: ");
	        int dogumyili = scanner.nextInt();

	       
	        HeartRate person = new HeartRate(ad, soyad, dogumyili);

	        
	        person.show();
	    }
	}


