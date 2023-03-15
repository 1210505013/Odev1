import java.util.Random;

public class BruteForce {

    public void bruteforce() {
        int[] arr = new int[10000];
        Random random = new Random();

        // rastgele elemanlarla dizi oluşturma
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt( 10000 );
        }

        long startTime = System.nanoTime();

        // BruteForce algoritması kullanarak en büyük değeri bulma
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long endTime = System.nanoTime();

        long duration = (endTime - startTime); // milisaniye cinsinden süre hesaplama

        System.out.println( "En büyük eleman: " + max );
        System.out.println( "Bulma işlemi " + duration + " milisaniye sürdü." );
    }
}