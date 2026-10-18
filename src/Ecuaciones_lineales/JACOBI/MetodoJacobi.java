package Ecuaciones_lineales.JACOBI;

public class MetodoJacobi {
    public static double[] resolver(double[][] A, double[] b, double[] x0,
                                     double tol, int maxiter) {
        validar(A, b, x0, tol, maxiter);
        double[] x = x0.clone();
        System.out.println("Iteracion | x | y | z | Error maximo");
        for (int k = 1; k <= maxiter; k++) {
            double[] xNuevo = new double[b.length];
            for (int i = 0; i < b.length; i++) {
                double suma = 0;
                for (int j = 0; j < b.length; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                // Todos los componentes usan la iteracion anterior.
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }
            double error = calcularError(x, xNuevo);
            mostrar(k, xNuevo, error);
            if (error < tol) {
                System.out.println("Convergencia en " + k + " iteraciones.");
                return xNuevo;
            }
            x = xNuevo.clone();
        }
        throw new IllegalStateException("Jacobi no convergio en el limite indicado.");
    }
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double max = 0;
        for (int i = 0; i < xAnt.length; i++)
            max = Math.max(max, Math.abs(xNuevo[i] - xAnt[i]));
        return max;
    }
    public static void mostrar(int k, double[] x, double error) {
        System.out.printf(java.util.Locale.US, "%3d | %.8f | %.8f | %.8f | %.8f%n",
                          k, x[0], x[1], x[2], error);
    }
    public static void validar(double[][] A, double[] b, double[] x,
                                double tol, int maxIter) {
        if (A == null || b == null || x == null || b.length != 3 ||
            A.length != b.length || x.length != b.length ||
            !Double.isFinite(tol) || tol <= 0 || maxIter <= 0)
            throw new IllegalArgumentException("Se requiere un sistema 3x3 y parametros validos.");
        for (int i = 0; i < b.length; i++) {
            if (A[i] == null || A[i].length != b.length || A[i][i] == 0)
                throw new IllegalArgumentException("Matriz cuadrada con diagonal distinta de cero requerida.");
            if (!Double.isFinite(b[i]) || !Double.isFinite(x[i]))
                throw new IllegalArgumentException("Los valores deben ser finitos.");
            for (double v : A[i]) if (!Double.isFinite(v))
                throw new IllegalArgumentException("Los valores deben ser finitos.");
        }
    }
}
