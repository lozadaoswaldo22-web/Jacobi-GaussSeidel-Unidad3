package Ecuaciones_lineales.JACOBI;

// Definicion independiente del sistema solicitado.
public class Defmatrix {
    public static double[][] obtenerMatrizA() {
        return new double[][] {{5, 1, 1}, {1, 4, 1}, {1, 2, 5}};
    }
    public static double[] obtenerVectorB() { return new double[] {7, 6, 8}; }
    public static double[] obtenerVectorX0() { return new double[] {0, 0, 0}; }
}
