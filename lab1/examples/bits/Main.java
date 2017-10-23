public class Main {
    /**
     * Меняет местами байты в числе.
     * @param args
     */
    public static void main(String[] args) {
        // Создаём случайное число.
        int input = (int)(Math.random() * Integer.MAX_VALUE);
        System.out.format("In [0]: 0x%08X\n", input);

        // С помощью операции сдвига вправо получаем младщий байт нового числа.
        int lsb = input >> (Integer.SIZE / 2);
        // С помощью операции сдвига влево получаем старший байт нового числа.
        int msb = input << (Integer.SIZE / 2);
        // Объединяем байты с помощью операции ИЛИ.
        int output = lsb | msb;

        // Выводим результат.
        System.out.format("Out[0]: 0x%08X\n", lsb);
        System.out.format("Out[1]: 0x%08X\n", msb);
        System.out.format("Out[2]: 0x%08X", output);
    }
}