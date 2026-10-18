# Métodos de Jacobi y Gauss-Seidel

**Alumno:** Oswaldo Lozada Hernández  
**Carrera:** Ingeniería en Sistemas Computacionales  
**Materia:** Métodos Numéricos  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa  
**Unidad:** 3

## Objetivo

Resolver un sistema de ecuaciones lineales mediante los métodos de Jacobi y Gauss-Seidel en Java, separando los datos, los métodos y la ejecución en diferentes clases.

## Sistema de ecuaciones

```text
5x +  y +  z = 7
 x + 4y +  z = 6
 x + 2y + 5z = 8
```

Los dos métodos utilizan los mismos valores iniciales:

- Vector inicial: [0, 0, 0].
- Tolerancia: 0.0001.
- Máximo de iteraciones: 100.

## Organización del proyecto

El programa está dividido en cuatro clases:

| Clase | Función |
|---|---|
| Defmatrix.java | Contiene la matriz del sistema, el vector de términos independientes y el vector inicial. |
| MetodoJacobi.java | Realiza las iteraciones de Jacobi y calcula el error máximo entre dos aproximaciones consecutivas. |
| GaussSeidelMetodo.java | Realiza las iteraciones de Gauss-Seidel y reutiliza la función de error de Jacobi. |
| MainJacobi.java | Ejecuta ambos métodos y muestra los resultados en consola. |

Los archivos se encuentran dentro de la carpeta `src`, organizados en los paquetes `Ecuaciones_lineales.JACOBI` y `Ecuaciones_lineales.Gauss_Seidel`.

## Funcionamiento

En Jacobi, cada nueva aproximación se calcula utilizando los valores de la iteración anterior.

En Gauss-Seidel, los valores se actualizan en el mismo vector. Esto permite utilizar inmediatamente los resultados calculados durante la iteración.

El programa muestra una tabla con el número de iteración, los valores de x, y, z y el error máximo. El proceso termina cuando el error es menor que la tolerancia indicada.

## Cómo ejecutar el programa

1. Descargar el repositorio y descomprimirlo.
2. Abrir la carpeta del proyecto en IntelliJ IDEA.
3. Configurar el JDK del proyecto.
4. Marcar `src` como carpeta de código fuente si IntelliJ no la reconoce.
5. Abrir `MainJacobi.java`.
6. Ejecutar el método `main`.
7. Consultar las tablas y las soluciones en la consola.

## Resultados esperados

| Método | Iteraciones |
|---|---:|
| Jacobi | 16 |
| Gauss-Seidel | 6 |

Ambos métodos se aproximan a la solución:

```text
x = 1
y = 1
z = 1
```

Estos resultados corresponden a una tolerancia de 0.0001, utilizando como error el máximo cambio absoluto entre iteraciones consecutivas.

## Conclusión

Para este sistema, Gauss-Seidel necesita menos iteraciones que Jacobi porque utiliza los valores nuevos conforme los calcula. Los dos métodos permiten obtener una aproximación a la misma solución.

La organización por clases facilita entender el programa, ya que cada archivo tiene una función específica y los datos del sistema se pueden modificar sin cambiar la lógica de los métodos.
