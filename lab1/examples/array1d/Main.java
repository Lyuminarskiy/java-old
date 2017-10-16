package array1d;

public class Main {
    /**
     * Определяет среднее арифметическое чисел в массиве
     * и удаляет все числа меньше среднего арифметического.
     * @param args
     */
    public static void main(String[] args) {
        // Создаём массив.
        int[] input = new int[10];

        // Заполняем массив случайными числами.
        System.out.print("In [0]: { ");
        for (int i = 0; i < input.length; i++) {
            // Получим случайное число в диапазоне [0; 100].
            input[i] = (int)(Math.random() * 100);
            System.out.print(input[i] + " ");
        }
        System.out.println("}");

        // Вычисляем среднее арифметическое чисел в массиве.
        int sum = 0;
        for (int i: input) {
            sum += i;
        }
        double average = sum / input.length;
        System.out.println("Out[0]: " + average);

        // Подсчитываем число элементов массива,
        // больше или равных среднему арифметическому.
        int count = 0;
        for (int i: input) {
            if (i >= average) {
                count++;
            }
        }
        System.out.println("Out[1]: " + count);

        // Создаём новый массив и заполняем его числами исходного массива,
        // больше или равными среднему арифметическому.
        int[] output = new int[count];
        int j = 0;
        for (int i: input) {
            if (i >= average) {
                output[j++] = i;
            }
        }

        // Выводим результат.
        System.out.print("Out[2]: { ");
        for (int i: output) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }
}
