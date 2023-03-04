public class Külastaja implements Comparable<Külastaja> {
    private String nimi;
    private int külastatudAtraktsioonideArv;

    public Külastaja(String nimi, int külastatudAtraktsioonideArv) {
        this.nimi = nimi;
        this.külastatudAtraktsioonideArv = külastatudAtraktsioonideArv;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastatudAtraktsioonideArv() {
        return külastatudAtraktsioonideArv;
    }
    public int compareTo(Külastaja võrreldav){
        if (getKülastatudAtraktsioonideArv() < võrreldav.getKülastatudAtraktsioonideArv())
            return -1;
        if (getKülastatudAtraktsioonideArv() > võrreldav.getKülastatudAtraktsioonideArv())
            return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Külastaja{" +
                "nimi='" + nimi + '\'' +
                ", külastatudAtraktsioonideArv=" + külastatudAtraktsioonideArv +
                '}';
    }

}

