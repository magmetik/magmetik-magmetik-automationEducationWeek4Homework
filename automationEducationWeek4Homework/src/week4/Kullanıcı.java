package week4;

import java.util.Scanner;

public class Kullanıcı {

    Scanner scanner = new Scanner(System.in);
    String kullanıcıAdı = "";
    String sifre = "";
    String isim = "";
    String telefonNumarası = "";
    String adres = "1";

    public void loginUser() {

        System.out.println("Lütfen kullanıcı adı giriniz");
        kullanıcıAdı = scanner.next();
        System.out.println("Lütfen şifre giriniz");
        sifre = scanner.next();

        if ((kullanıcıAdı.equals("ahmet"))) {
            if (sifre.equals("1234")) {
                isim = "Ahmet";
                telefonNumarası = "05552909999";
                adres = "İstanbul / Avcılar";
                System.out.println("Başarılı giriş yaptınız");
                System.out.println("İsim: " + isim);
                System.out.println("Telefon numarası: " + telefonNumarası);
                System.out.println("Adres: " + adres);
            } else {
                System.out.println("Yanlış şifre girdiniz, lütfen tekrar deneyin");
                loginUser();
            }
        }

        if ((kullanıcıAdı.equals("mehmet"))) {
            if (sifre.equals("1234+")) {
                isim = "Mehmet";
                telefonNumarası = "05552909998";
                adres = "Kocaeli / Gebze";
                System.out.println("Başarılı giriş yaptınız");
                System.out.println("İsim: " + isim);
                System.out.println("Telefon numarası: " + telefonNumarası);
                System.out.println("Adres: " + adres);
            } else {
                System.out.println("Yanlış şifre girdiniz, lütfen tekrar deneyin");
                loginUser();
            }
        }

        if ((kullanıcıAdı.equals("ayse"))) {
            if (sifre.equals("12345")) {
                isim = "Ayşe";
                telefonNumarası = "02121682898";
                adres = "Konya / Selçuklu";
                System.out.println("Başarılı giriş yaptınız");
                System.out.println("İsim: " + isim);
                System.out.println("Telefon numarası: " + telefonNumarası);
                System.out.println("Adres: " + adres);
            } else {
                System.out.println("Yanlış şifre girdiniz, lütfen tekrar deneyin");
                loginUser();
            }
        }

        if ((kullanıcıAdı.equals("fatma"))) {
            if (sifre.equals("A12345+")) {
                isim = "Fatma";
                telefonNumarası = "01111111111";
                adres = "Ordu / Ünye";
                System.out.println("Başarılı giriş yaptınız");
                System.out.println("İsim: " + isim);
                System.out.println("Telefon numarası: " + telefonNumarası);
                System.out.println("Adres: " + adres);
            } else {
                System.out.println("Yanlış şifre girdiniz, lütfen tekrar deneyin");
                loginUser();
            }
        }

        if ((kullanıcıAdı.equals("hayriye"))) {
            if (sifre.equals("1234")) {
                isim = "Hayriye";
                telefonNumarası = "09999999999";
                adres = "Samsun / Çarşamba";
                System.out.println("Başarılı giriş yaptınız");
                System.out.println("İsim: " + isim);
                System.out.println("Telefon numarası: " + telefonNumarası);
                System.out.println("Adres: " + adres);
            } else {
                System.out.println("Yanlış şifre girdiniz, lütfen tekrar deneyin");
                loginUser();
            }
        }

    }

    void getİsim() {
        isim = isim;
        telefonNumarası = telefonNumarası;
        adres = adres;
        System.out.println("İsim: " + isim);
        System.out.println("Telefon numarası: " + telefonNumarası);
        System.out.println("Adres: " + adres);
    }

}





















