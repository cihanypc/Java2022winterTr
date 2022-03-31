package day_27_constructor;

public class Z {
    String isim;
    String soyisim;
    int numara;
    boolean gercekmi;


    public Z(String ism, String soyism, int no, boolean grc) {

        isim=ism;
        soyisim=soyism;
        numara=no;
        gercekmi=grc;

    }

    public Z(String isim, String soyisim, int numara) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.numara=numara;
    }

    public String toString(){
        return ("isim : " + isim+ " soyisim : " + soyisim+ " numara : "+ numara+ " Gercekmi : "+gercekmi);
    }
}
