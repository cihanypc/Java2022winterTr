package practice;

public class day2_practice_2 {
    public static void main(String[] args) {
          /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */
        char finalnotu = 'B';  // buraya girilen degerlerin karsiligini yazdirir

        String result = "";

        result = (finalnotu == 'A') ? "Gayet Basarili " :
                 (finalnotu == 'B') ? "Basarili" :
                         (finalnotu == 'C') ? "Ha Gayret" : " Digerleri...";

        System.out.println("result = " + result);


    }
}
