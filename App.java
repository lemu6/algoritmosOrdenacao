package AlgoritmosDeOrdenacao;

import java.io.IOException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws IOException {
        int[] sizes = {100, 500, 1000, 5000, 30000, 80000, 100000, 150000, 200000};
        int repetitions = 5;

        for (int size : sizes) {
            long[] executionTimes = new long[repetitions];
            long totalTime = 0;

            for (int i = 0; i < repetitions; i++) {
                int[] array = RandomNumberGenerator.generateRandomNumbers(size);
                int[] arrayCopy = Arrays.copyOf(array, array.length);

                long startTime = System.currentTimeMillis();
                // Definicao de qual algoritmo vai ser utilizado
                Merge.sort(arrayCopy);
                long endTime = System.currentTimeMillis();

                long duration = endTime - startTime;
                executionTimes[i] = duration;
                totalTime += duration;

                System.out.println("Tamanho do vetor: " + size + ", Execução " + (i + 1) + ": " + duration + " ms");
            }

            double averageTime = totalTime / (double) repetitions;
            System.out.println("Tamanho do vetor: " + size + ", Tempo médio de execução: " + averageTime + " ms");
            System.out.println("----------------------------------------");
        }
    }
}
