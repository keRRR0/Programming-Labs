public class Lab1 {

    public static void main(String[] args) {
        /* Массив из нечетных чисел от 5 до 17 включительно в порядке убывания */
        byte n = 0;
        int[] d = new int[(17 - 5) / 2 + 1];
        for (byte i = 17; i >= 5; i--) {
            if (i % 2 != 0)
                d[n] = i;
            else
                n++;
        }
        /* Массив из 15 случайных чисел от -2.0 до 15.0 */
        float[] x = new float[15];
        for (byte i = 0; i < 15; i++) {
            x[i] = (float) (Math.random() * (15 - -2) - 2);
        }
        /* Вычисления */
        double[][] calc = new double[7][15];
        for (byte i = 0; i < 7; i++) {
            for (byte j = 0; j < 15; j++) {
                switch (d[i]) {
                    case 7:
                        calc[i][j] = Math.pow(2 * Math.tan(x[j] / (x[j] + 1)), 2);
                        break;
                    case 11:
                    case 15:
                    case 17:
                        calc[i][j] = Math.pow(Math.pow(Math.tan(x[j]), 1.0 / 3.0) / (Math.tan(Math.exp(x[j])) - 2.0 / 3.0),
                                Math.pow(Math.pow(x[j] * (x[j] + 1), x[j]), 0.5 * (1.0 / 3.0 +
                                        Math.pow((x[j] + 3.0 / 4.0) / x[j], x[j]))));
                        break;
                    default:
                        calc[i][j] = Math.exp(Math.sin(Math.tan(Math.pow(1.0 / 3.0 + x[j], x[j]))));
                }
                System.out.printf("%.3f", calc[i][j]);
                System.out.print("  ");
            }
        }
        System.out.println();

    }
}