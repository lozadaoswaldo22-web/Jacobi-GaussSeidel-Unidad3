// Declara el paquete correspondiente a esta clase
package Ecuaciones_lineales.Gauss_Seidel;
// Importa la funcion calcularError reutilizando el metodo de Jacobi
import static Ecuaciones_lineales.JACOBI.MetodoJacobi.calcularError;
import Ecuaciones_lineales.JACOBI.MetodoJacobi;

public class GaussSeidelMetodo {
    public static double[] gaussSeidel(double[][] A, double[] b,
                                        double[] xInicial, double tol, int maxIter) {
        MetodoJacobi.validar(A, b, xInicial, tol, maxIter);
        int n = xInicial.length;
        double[] x = xInicial.clone(); // Un solo vector que evoluciona al instante
        System.out.println("Iteracion | x | y | z | Error maximo");
        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone(); // Respaldamos el estado anterior para el error
            for (int i = 0; i < n; i++) {
                double suma = b[i]; // Arranca con el termino independiente b_i
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j];
                    }
                }
                x[i] = suma / A[i][i];
            }
            double error = calcularError(xAnt, x);
            MetodoJacobi.mostrar(iter + 1, x, error);
            if (error < tol) {
                System.out.println("Convergencia en " + (iter + 1) + " iteraciones.");
                return x;
            }
        }
        throw new IllegalStateException("Gauss-Seidel no convergio en el limite indicado.");
    }
}
