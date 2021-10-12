package week4;

import java.util.Scanner;

public class LandingPage {

    public static void main(String[] args) {

        Kullanıcı object1 = new Kullanıcı();

        object1.loginUser();

        Ürün object2 = new Ürün();

        System.out.println("Ana menüye gitmek için 1, Arama sayfasına gitmek için 2, Profil sayfasına gitmek için 3 giriniz");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String tercih;


        switch (number) {

            case 1:
                tercih = "Ana menü";
                System.out.println("Tercih = " + tercih);
                break;
            case 2:
                tercih = "Arama";
                System.out.println("Tercih = " + tercih);
                break;
            case 3:
                tercih = "Profil";
                System.out.println("Tercih = " + tercih);
                System.out.println("Landing Page'e gitmek için 0, kullanıcı değişikliği yapmak için -1, farklı bir işlem yapmak istemiyorsanız -2 giriniz");
                number = scanner.nextInt();
                object1.getİsim();
                if (number == 0) {
                    tercih = "LandingPage";
                    System.out.println("Tercih = " + tercih);
                }
                else if (number == -1) {
                    object1.loginUser();
                }
                else if(number == -2) {
                    System.out.println("İşleminiz sonlandırılmıştır");
                    break;
                }
                break;
            default:
                System.out.println("Lütfen geçerli bir sayfa seçiniz");
        }

        AnaKategori object6 = new AnaKategori();
        object6.createAnaKategori();
        
        AltKategori object7 = new AltKategori();
        object7.createAltKategori1();
        object7.createAltKategori2();
        object7.createAltKategori3();

        System.out.println("Ana Kategoriler: " + object6.AnaKategori.get(0) + " , " + object6.AnaKategori.get(1) + " , " + object6.AnaKategori.get(2));
        System.out.println("Meyve & Sebze için 1, Atıştırmalık için 2, Kahvaltılık için 3 giriniz");
        int secilenAnaKategori = scanner.nextInt();

        int secilenAltKategori;
        int ürün;

        System.out.println("Lütfen alt kategori giriniz");

            switch (secilenAnaKategori) {
                case 1:
                    System.out.println("Alt Kategoriler: " + object7.AltKategori1.get(0) + " , " + object7.AltKategori1.get(1));
                    System.out.println("Meyve için 1, Sebze için 2 giriniz");
                    secilenAltKategori = scanner.nextInt();
                    if (secilenAltKategori == 1) {
                        System.out.println("Elma için 1, Armut için 2, Üzüm için 3 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Elma");
                            object2.setElmaAçıklama("Amasya Elması");
                            object2.setElmaFiyat(5.00);
                            object2.setElmaİndirimliFiyat(4.80);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Armut");
                            object2.setElmaAçıklama("Deveci Armut");
                            object2.setElmaFiyat(8.00);
                            object2.setElmaİndirimliFiyat(7.70);
                        } else {
                            object2.setElmaİsim("Üzüm");
                            object2.setElmaAçıklama("Çekirdeksiz Üzüm");
                            object2.setElmaFiyat(7.50);
                            object2.setElmaİndirimliFiyat(7.20);
                        }
                    } else {
                        System.out.println("Domates için 1, Biber için 2, Patlıcan için 3 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Domates");
                            object2.setElmaAçıklama("Çeri Domates");
                            object2.setElmaFiyat(7.50);
                            object2.setElmaİndirimliFiyat(7.00);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Biber");
                            object2.setElmaAçıklama("Sivri Biber");
                            object2.setElmaFiyat(6.00);
                            object2.setElmaİndirimliFiyat(5.90);
                        } else {
                            object2.setElmaİsim("Patlıcan");
                            object2.setElmaAçıklama("Bostan Patlıcan");
                            object2.setElmaFiyat(8.00);
                            object2.setElmaİndirimliFiyat(7.85);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Alt Kategoriler: " + object7.AltKategori2.get(0) + " , " + object7.AltKategori2.get(1));
                    System.out.println("Cips için 1, Çikolata için 2 giriniz");
                    secilenAltKategori = scanner.nextInt();
                    if (secilenAltKategori == 1) {
                        System.out.println("Lays için 1, Doritos için 2, Ruffles için 3 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Lays");
                            object2.setElmaAçıklama("Lays Fırından");
                            object2.setElmaFiyat(6.50);
                            object2.setElmaİndirimliFiyat(6.45);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Doritos");
                            object2.setElmaAçıklama("Doritos Taco");
                            object2.setElmaFiyat(6.00);
                            object2.setElmaİndirimliFiyat(5.75);
                        } else {
                            object2.setElmaİsim("Ruffles");
                            object2.setElmaAçıklama("Ruffles Klasik");
                            object2.setElmaFiyat(5.75);
                            object2.setElmaİndirimliFiyat(5.60);
                        }
                    } else {
                        System.out.println("Tadelle için 1, Albeni için 2, Metro için 3, Hobby için 4 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Tadelle");
                            object2.setElmaAçıklama("Tadelle Klasik");
                            object2.setElmaFiyat(4.50);
                            object2.setElmaİndirimliFiyat(3.99);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Albeni");
                            object2.setElmaAçıklama("Albeni Tane Tane");
                            object2.setElmaFiyat(2.50);
                            object2.setElmaİndirimliFiyat(2.30);
                        } else if (ürün == 3) {
                            object2.setElmaİsim("Metro");
                            object2.setElmaAçıklama("Metro Klasik");
                            object2.setElmaFiyat(3.15);
                            object2.setElmaİndirimliFiyat(2.95);
                        } else {
                            object2.setElmaİsim("Hobby");
                            object2.setElmaAçıklama("Hobby Fındıklı");
                            object2.setElmaFiyat(2.00);
                            object2.setElmaİndirimliFiyat(1.80);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Alt Kategoriler: " + object7.AltKategori3.get(0) + " , " + object7.AltKategori3.get(1));
                    System.out.println("Süt için 1, Şarküteri için 2 giriniz");
                    secilenAltKategori = scanner.nextInt();
                    if (secilenAltKategori == 1) {
                        System.out.println("Tam Yağlı için 1, Az Yağlı için 2, Laktossuz için 3 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Tam Yağlı");
                            object2.setElmaAçıklama("Tam Yağlı Süt");
                            object2.setElmaFiyat(7.50);
                            object2.setElmaİndirimliFiyat(7.00);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Az Yağlı");
                            object2.setElmaAçıklama("Az Yağlı Süt");
                            object2.setElmaFiyat(6.00);
                            object2.setElmaİndirimliFiyat(5.90);
                        } else {
                            object2.setElmaİsim("Laktossuz");
                            object2.setElmaAçıklama("Laktossuz Süt");
                            object2.setElmaFiyat(9.00);
                            object2.setElmaİndirimliFiyat(8.70);
                        }
                    } else {
                        System.out.println("Kaşar için 1, Peynir için 2, Salam için 3, Sucuk için 4, Zeytin için 5 giriniz");
                        ürün = scanner.nextInt();
                        if (ürün == 1) {
                            object2.setElmaİsim("Kaşar");
                            object2.setElmaAçıklama("Kaşar Peyniri");
                            object2.setElmaFiyat(55.00);
                            object2.setElmaİndirimliFiyat(52.90);
                        } else if (ürün == 2) {
                            object2.setElmaİsim("Peynir");
                            object2.setElmaAçıklama("Tam Yağlı Beyaz Peynir");
                            object2.setElmaFiyat(50.00);
                            object2.setElmaİndirimliFiyat(48.50);
                        } else if (ürün == 3) {
                            object2.setElmaİsim("Salam");
                            object2.setElmaAçıklama("Macar Salam");
                            object2.setElmaFiyat(30.00);
                            object2.setElmaİndirimliFiyat(28.50);
                        } else if (ürün == 3) {
                            object2.setElmaİsim("Sucuk");
                            object2.setElmaAçıklama("Kangal Sucuk");
                            object2.setElmaFiyat(110.00);
                            object2.setElmaİndirimliFiyat(100.00);
                        } else {
                            object2.setElmaİsim("Zeytin");
                            object2.setElmaAçıklama("Sele Zeytin");
                            object2.setElmaFiyat(41.00);
                            object2.setElmaİndirimliFiyat(40.10);
                        }
                    }
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçim yapınız");
            }



            System.out.println("Sepete gitmek için 0, ürün aramak için 1, farklı bir işlem yapmak istemiyorsanız 2 giriniz");
            int seçim = scanner.nextInt();

            switch (seçim) {
                case 0:
                    System.out.println("Sepet");
                    break;
                case 1:
                    System.out.println("Ürün Arama");
                    break;
                case 2:
                    System.out.println("İşleminiz sonlandırılmıştır.");
                    break;
                default:
                    System.out.println("Yanlış seçim yaptınız");
            }
    }

}


