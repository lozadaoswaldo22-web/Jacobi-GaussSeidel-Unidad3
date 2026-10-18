package Ecuaciones_lineales.JACOBI;

import Ecuaciones_lineales.Gauss_Seidel.GaussSeidelMetodo;
import java.util.Locale;

public class MainJacobi {
    public static void main(String[] args) {
        double[][] A = Defmatrix.obtenerMatrizA();
        double[] b = Defmatrix.obtenerVectorB();
        double[] x0 = Defmatrix.obtenerVectorX0();
        double tol = 0.0001;
        int maxiter = 100;
        System.out.println("METODO DE JACOBI");
        double[] jacobi = MetodoJacobi.resolver(A, b, x0, tol, maxiter);
        imprimir(jacobi);
        System.out.println("\nMETODO DE GAUSS-SEIDEL");
        double[] seidel = GaussSeidelMetodo.gaussSeidel(A, b, x0, tol, maxiter);
        imprimir(seidel);
    }
    private static void imprimir(double[] x) {
        System.out.printf(Locale.US, "Solucion aproximada: [%.8f, %.8f, %.8f]%n",
                          x[0], x[1], x[2]);
    }
}
