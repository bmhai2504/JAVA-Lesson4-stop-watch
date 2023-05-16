import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        StopWatch calTime = new StopWatch();
        double[] arr = new double[100000];
        calTime.start();

        for(int i = 0; i < 100000; i++){
            arr[i] = Math.random()*100000;
//            System.out.printf("%f, ", arr[i]);
        }
        System.out.println(selectionSort(arr));
        calTime.end();
        System.out.println(calTime.getElapsedTime());
    }
    public static double selectionSort(double[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }
}