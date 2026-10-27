import java.util.Arrays;
import Task_solving.*;

public class Main {

  public void main(String[] args) {
      task_1();
      task_2();
      task_3();
  }

  public void task_1() {
    System.out.println("Вывод пользователей в порядке рейтинга с помощью алгоритма Bucket Sort");
    System.out.println("===Первый тест===");
    double[] arr_1 = {0.72, 0.18, 0.50, 0.03};
    System.out.println("Массив: " + Arrays.toString(arr_1));
    BucketSort.sort(arr_1);

    System.out.println("\n===Второй тест===");
    double[] arr_2 = {0.66, 0.66, 0.10};
    System.out.println("Массив: " + Arrays.toString(arr_2));
    BucketSort.sort(arr_2);
  }

  public void task_2() {
    System.out.println("\n\nУпорядочивание кодов ошибок с помощью алгоритма Counting Sort");
    System.out.println("===Первый тест===");
    int[] arr_1 = {404, 0, 500, 404};
    System.out.println("Массив: " + Arrays.toString(arr_1));
    CountingSort.sort(arr_1);

    System.out.println("\n===Второй тест===");
    int[] arr_2 = {999, 1, 1, 12};
    System.out.println("Массив: " + Arrays.toString(arr_2));
    CountingSort.sort(arr_2);
  }

  public void task_3() {
    System.out.println("\n\nСортировка записей по коду с помощью алгоритма Radix Sort");
    System.out.println("===Первый тест===");
    long[] arr_1 = {123456789012L, 12L, 900000000000L};
    System.out.println("Массив: " + Arrays.toString(arr_1));
    RadixSort.sort(arr_1);

    System.out.println("\n===Второй тест===");
    long[] arr_2 = {111111111111L, 101010101010L};
    System.out.println("Массив: " + Arrays.toString(arr_2));
    RadixSort.sort(arr_2);
  }
}
