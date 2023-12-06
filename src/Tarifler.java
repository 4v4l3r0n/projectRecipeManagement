import java.util.ArrayList;

public class Tarifler {
    private String isim;
    private ArrayList<String> malzemeler;
    private ArrayList<String> yapilis;

    public Tarifler(String ad){
        this.isim = ad;
        this.malzemeler = new ArrayList<>();
        this.yapilis = new ArrayList<>();
    }

    public void addMalzeme(String malzeme){
        malzemeler.add(malzeme);
    }

    public void addYapilis(String yapilisAdimi){
        yapilis.add(yapilisAdimi);
    }

    public void yazTarif(){
        System.out.println(this.isim + " Tarifi");
        System.out.println("Malzemeler:");
        for (String i : malzemeler){
            System.out.println("- " + i);
        }
        System.out.println("Yapılış:");
        for (int i = 0; i<yapilis.size(); i++){
            System.out.println((i+1) + "- " + yapilis.get(i));
        }
    }
}
