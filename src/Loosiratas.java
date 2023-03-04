import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Loosiratas {
    private List<Külastaja>külastajad=new ArrayList<>();

    public void lisaKülastaja(Külastaja külastaja){
        külastajad.add(külastaja);
    }
    public void lisaKülastaja(String nimi, int külastusteArv){
        Külastaja külastaja=new Külastaja(nimi,külastusteArv);
        külastajad.add(külastaja);

    }
    public List<Külastaja> kõigeAktiivsemad(int n){
        List<Külastaja>kõigeAktiivsemateList;
        Collections.sort(külastajad);
        Collections.reverse(külastajad);
        if (külastajad.size()<=n){
            return külastajad;
        }
        else{
            return kõigeAktiivsemateList=külastajad.subList(0,n);
            }
        }
    public Külastaja loosivõitja(){
        List<Külastaja> kõigeAktiivsemateList=kõigeAktiivsemad(3);
        int juhuslikArv=(int)(Math.random() * kõigeAktiivsemateList.size());
        return kõigeAktiivsemateList.get(juhuslikArv);
    }
}
