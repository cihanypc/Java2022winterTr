package day_39_overriding;

public class Araba {
    protected String hareket = "Arabalar teker ile hareket eder";
    protected String hiz = "Arabalar motorgucune gore hiz yapar";
    protected String yakit = "Arabalar farkli yakitlar kullanabilir";
    protected String marka = "Arabalar uretildikleri markaya sahiptir";


    public void motor() {
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    public void yakitTuketimi() {
        System.out.println("arabalar motor gucu ve yakit turune gore yakit tuketirler");
    }
}
