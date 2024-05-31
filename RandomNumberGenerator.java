package AlgoritmosDeOrdenacao;

import java.util.Random;

public class RandomNumberGenerator {
    public static int[] generateRandomNumbers(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000000); // Números aleatórios até 999999
        }
        return numbers;
    }
}
