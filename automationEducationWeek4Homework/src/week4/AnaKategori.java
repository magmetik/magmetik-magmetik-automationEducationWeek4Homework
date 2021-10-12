package week4;

import java.util.ArrayList;

public class AnaKategori {

    ArrayList<String> AnaKategori = new ArrayList<String>();
    ArrayList<String> MeyveSebze = new ArrayList<String>();
    ArrayList<String> Atıştırmalık = new ArrayList<String>();
    ArrayList<String> Kahvaltılık = new ArrayList<String>();

    void createAnaKategori() {
        AnaKategori.add("Meyve&Sebze");
        AnaKategori.add("Atıştırmalık");
        AnaKategori.add("Kahvaltılık");
    }

    void createMeyveSebze(){
        MeyveSebze.add("Meyve");
        MeyveSebze.add("Sebze");
    }

    void createAtıştırmalık(){
        Atıştırmalık.add("Cips");
        Atıştırmalık.add("Çikolata");
    }

    void createKahvaltılık(){
        Kahvaltılık.add("Süt");
        Kahvaltılık.add("Şarküteri");
    }

}
