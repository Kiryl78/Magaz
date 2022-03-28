import java.util.Arrays;
import java.util.Random;

public class Magaz {
    static String inpFile = "C:/TEMP/input.txt";

    public static void main(String[] args) {
       BookKeeping book = new BookKeeping(inpFile);
       int count = book.getWaresCouunt();

       try {
           int[] wares = book.waresListArray();
           System.out.println("Запишем в тетерадочку: " + Arrays. toString (wares));
           Random random = new Random();
           int vkassu = 0;
           int total = 0;
           int bal = 0;

           for (int i = 0; i < count; i++) {
               total = total + wares[i];
               Babka babusya = new Babka(random.nextBoolean()); //пришла какая-то бабка
               System.out.println(babusya.whoIsBabka() + " бабка: " + wares[i] + " за " + babusya.babkaBuys(wares[i]));
               vkassu = vkassu + babusya.babkaBuys(wares[i]); //купила...
               babusya = null; //.. и ушла
           }
           bal = vkassu - total;
           if (bal > 0) {
               System.out.println(bal + " Повезло - на хлебушек заработали");
           } else {
               System.out.println(bal + " Были противные бабки - на хлебушек НЕ заработали");
           }
       }
       catch ( NullPointerException e) {
           System.out.println("Нифига не получилось!" + e.getLocalizedMessage());
       }
    }
}
