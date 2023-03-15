import java.util.Random;
// en hızlı algoritma "Divide and Conquer" algoritmasıdır.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt();
        }

        long startTime = System.nanoTime();
        int max = getMax(array, 0, array.length - 1);
        long endTime = System.nanoTime();
        System.out.println("Divide and Conquer");
        System.out.println("En Büyük Değer: " + max);
        System.out.println("Çalışma Süresi: " + (endTime - startTime)+"milisaniye sürdü.");

        BruteForce bruteForce= new BruteForce();
        System.out.println("BruteForce");
        bruteForce.bruteforce();

        System.out.println("\n\nBrute Force algoritması ile en büyük sayıyı bulmak için tüm elemanların tek tek karşılaştırılması gerektiğinden,\nbu algoritmanın çalışma süresi veri setinin boyutuyla doğrudan ilişkilidir.\nBu süre, daha büyük boyutlu diziler için daha da artacaktır.\nBu nedenle, büyük boyutlu dizilerde Brute Force algoritması kullanmak yerine daha etkili algoritmalar kullanılması tavsiye edilir.");
    }

    public static int getMax(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) {
            return array[leftIndex];
        } else {
            int midIndex = (leftIndex + rightIndex) / 2;
            int leftMax = getMax(array, leftIndex, midIndex);
            int rightMax = getMax(array, midIndex + 1, rightIndex);
            return Math.max(leftMax, rightMax);
        }
    }
}