public class Test {
    public static void main(String[] args) {
        /*Atraktsioon mäed = new Atraktsioon("Ameerika mäed",12);
        Atraktsioon tondiloss = new Atraktsioon("Tondiloss",14);
        Dokument[] dokumendid = {
                new IdKaart("50708071234"),
                new Õpilaspilet(2010)
        };
        System.out.println("sobib: " + mäed.vanusedSobivad(mäed.ebasobivadDokumendid(dokumendid)));
        System.out.println("sobib: " + tondiloss.vanusedSobivad(tondiloss.ebasobivadDokumendid(dokumendid)));*/
        Külastaja külastaja1=new Külastaja("Mati",2);
        Külastaja külastaja2=new Külastaja("Kati",3);
        Külastaja külastaja3=new Külastaja("Nati",4);
        Külastaja külastaja4=new Külastaja("Tati",5);
        Külastaja külastaja5=new Külastaja("Sati",6);
        Loosiratas mingiratas=new Loosiratas();
        mingiratas.lisaKülastaja(külastaja1);
        mingiratas.lisaKülastaja(külastaja2);
        mingiratas.lisaKülastaja(külastaja3);
        mingiratas.lisaKülastaja(külastaja4);
        mingiratas.lisaKülastaja(külastaja5);
        /*System.out.println(mingiratas.kõigeAktiivsemad(3));
        System.out.println(mingiratas.loosivõitja());*/
        Külastaja võitja=mingiratas.loosivõitja();
        System.out.println(võitja);

    }
}