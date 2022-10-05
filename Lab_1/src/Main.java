// вариант лр 34535
public class Main {
    public static void main(String[] args) {

        // одномерный массив а типа short заполнить от 2 до 20
        short [] a = new short [10];
        for (int i = 0; i < 10; i++) {
            a[i]=(short)(2 + 2*i);
        }

        // одномерный массив х типа double 12 значений рандомом от -2,0 до 9,0
        double [] x = new double [12];
        for (int i = 0; i < 12; i++) {
            x[i] = ( (double) Math.random() * (9+2) ) - 2;
        }

        //двумерный массив c размером 10x12
        double [][] c = new double[10][12];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                if (a[i] == 14) {
                    c[i][j] = Math.cos(Math.sin(Math.cos(x[j])));
                }

                else if (a[i] == 4 || a[i] == 6 || a[i] == 8 || a[i] == 10 || a[i] == 16) {
                    c[i][j] = Math.pow(Math.pow(Math.pow(x[j], 1/3), 1/3), 1/3);
                }

                else {
                    c[i][j] = Math.log(Math.pow(3/(4 * Math.pow(4 + Math.pow(2*Math.abs(x[j]), 2), 2) + 1),Math.pow(0.5 * Math.pow((Math.pow(x[j]/(0.25 + x[j]), x[j]) - 1) / 2, 2), 3)));
                }
            }
        }

        // вывод
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%6.2f\t", c[i][j]);
            }
            System.out.print("\n");
        }

    }
}

