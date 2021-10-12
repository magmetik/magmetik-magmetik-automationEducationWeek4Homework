package week4;

import java.util.ArrayList;

public class AltKategori extends AnaKategori {

    @Override
    void createAnaKategori() {
        super.createAnaKategori();
    }

    ArrayList<String> AltKategori1 = new ArrayList<String>();
    ArrayList<String> AltKategori2 = new ArrayList<String>();
    ArrayList<String> AltKategori3 = new ArrayList<String>();

    void createAltKategori1(){
        AltKategori1.add("Meyve");
        AltKategori1.add("Sebze");
    }

    void createAltKategori2(){
        AltKategori2.add("Cips");
        AltKategori2.add("Çikolata");
    }

    void createAltKategori3(){
        AltKategori3.add("Süt");
        AltKategori3.add("Şarküteri");
    }


    void createMeyve() {
        ArrayList<String> Meyve = new ArrayList<String>();
        Meyve.add("Elma");
        Meyve.add("Armut");
        Meyve.add("Üzüm");
    }

    void createSebze(){
        ArrayList<String> Sebze = new ArrayList<String>();
        Sebze.add("Domates");
        Sebze.add("Biber");
        Sebze.add("Patlıcan");
    }

    void createCips(){
        ArrayList<String> Cips = new ArrayList<String>();
        Cips.add("Lays");
        Cips.add("Doritos");
        Cips.add("Ruffles");
    }

    void createÇikolata(){
        ArrayList<String> Çikolata = new ArrayList<String>();
        Çikolata.add("Tadelle");
        Çikolata.add("Albeni");
        Çikolata.add("Metro");
        Çikolata.add("Hobby");
    }

    void createSüt(){
        ArrayList<String> Süt = new ArrayList<String>();
        Süt.add("Tam yağlı");
        Süt.add("Az yağlı");
        Süt.add("Laktossuz");
    }


    void createŞarküteri(){
        ArrayList<String> Şarküteri = new ArrayList<String>();
        Şarküteri.add("Kaşar");
        Şarküteri.add("Peynir");
        Şarküteri.add("Salam");
        Şarküteri.add("Sucuk");
        Şarküteri.add("Zeytin");
    }











}
