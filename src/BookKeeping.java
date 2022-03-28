import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BookKeeping {
    private String inFN;
    private int waresCount;

    public BookKeeping (String inFN) {
        this.inFN = inFN;
    }

    //размер списка
    public int getWaresCouunt () {
        waresCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inFN))) {
            while (reader.readLine() != null) {
                waresCount++;
            }
            return waresCount;
        }
        catch (IOException e) {
            System.out.println(" Нечего продавать! Проверьте файл");
            return 0;
        }
    }
    // тетрадочка продавца
    public int[] waresListArray () {
        int[] arr;
        arr = new int [getWaresCouunt()];
        try (BufferedReader reader = new BufferedReader(new FileReader(inFN))) {
            String tempS;
            int i =0;
            System.out.println("Так, что у нас сегодня почем ...");
            while ((tempS = reader.readLine()) != null) {
                System.out.println(tempS);
                arr[i] = Integer.parseInt(tempS.substring(0,1)) ;
                i++;
            }
        return arr;
        }
        catch (IOException e) {
            System.out.println(" Странно... Только что файл был.. Зина, посмотри на складе!");
            arr = null;
            return arr;
        }
        catch (NumberFormatException e) {
            System.out.println(" Неправильно заполнен файл!");
            arr = null;
            return arr;
        }
    }
}
