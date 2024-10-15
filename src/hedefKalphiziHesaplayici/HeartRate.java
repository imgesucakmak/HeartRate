package hedefKalphiziHesaplayici;
import java.util.Scanner;
public class HeartRate {
	
    private String ad;
    private String soyad;
    private int dogumyili;

    public HeartRate(String ad, String soyad, int dogumyili) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumyili = dogumyili;
    }

  
    public void setAd(String firstName) {
        this.ad= firstName;
    }

    public void setSoyad(String lastName) {
        this.soyad = soyad;
    }

    public void setDogumYil(int birthYear) {
        this.soyad = soyad;
    }

   
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getDogumYili() {
        return dogumyili;
    }

    
    public int yasHesap() {
        int yil = 2024;
        return yil - dogumyili;
    }

        public int maxHeartRate() {
        return 220 - yasHesap();
    }

    
    public int targetHeartRate() {
        int mhr = maxHeartRate();
        return (int) (mhr * 0.85); }

    
    public void show() {
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Yaş: " + yasHesap());
        System.out.println("Maksimum Kalp Atım Hızı (MHR): " + maxHeartRate());
        System.out.println("Hedef Kalp Atım Hızı (THR): " + targetHeartRate());
    
}



	

	    


}
