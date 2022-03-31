package day_27_constructor;

public class Volvo {
    String marka = "Volvo";
    String mensei = "Isvec";
    String model;
    boolean elektriklimi;
    int yil;
    String yakit;
    boolean otomatikPilot = otomatikPilotSorgusu();
    int maxHiz = maxHizata();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model = mdl;
        elektriklimi = elk;
        yil = yl;
        yakit = ykt;
        maxHiz=maxHizata();
        otomatikPilot=otomatikPilotSorgusu();
    }

    public Volvo() {

    }

    public int maxHizata() {
        int maxHiz = 0;
        if (elektriklimi) {
            maxHiz = 160;
        } else {
            maxHiz = 240;
        }
        return maxHiz;
    }

    public boolean otomatikPilotSorgusu() {

        boolean sonuc = false;

        if (elektriklimi) {
            sonuc = true;
        }
        return sonuc;
    }

    public String toString() {
        String arabaOzellikleri = "Model : " + model + " Yakit : " + yakit + " maxHiz : " + maxHiz;


        return arabaOzellikleri;
    }

}
