import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {
    private String atraktsiooniNimi;
    private int minimaalneVanus;

    public Atraktsioon(String atraktsiooniNimi, int minimaalneVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.minimaalneVanus = minimaalneVanus;
    }

    @Override
    public String toString() {
        return "Atraktsioon{" +
                "atraktsiooniNimi='" + atraktsiooniNimi + '\'' +
                ", minimaalneVanus=" + minimaalneVanus +
                '}';
    }

    public boolean vanusedSobivad(Dokument[] ebasobivateList) {

        return ebasobivateList==null || ebasobivateList.length==0;
    }
    public List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid){
        List<Dokument> ebasobivateList=new ArrayList<Dokument>();
        for (Dokument dokument :dokumendid) {
            if (!dokument.vanusOnVähemalt(minimaalneVanus)){
                ebasobivateList.add(dokument);
            }
        }
        return ebasobivateList;
    }
}