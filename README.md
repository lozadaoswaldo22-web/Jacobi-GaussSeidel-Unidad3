# Practica: Jacobi y Gauss-Seidel
Metodos Numericos, Unidad 3. Instituto Tecnologico Superior de Xalapa.

## Sistema y parametros
5x + y + z = 7; x + 4y + z = 6; x + 2y + 5z = 8.
Vector inicial [0,0,0], tolerancia 0.0001 y limite de 100 iteraciones.
Solucion exacta: [1,1,1]. Error: maximo absoluto de las diferencias
entre iteraciones consecutivas. No es error relativo ni residuo.

## Arquitectura
- src/Ecuaciones_lineales/JACOBI/Defmatrix.java: matriz y vectores.
- src/Ecuaciones_lineales/JACOBI/MetodoJacobi.java: Jacobi y error compartido.
- src/Ecuaciones_lineales/Gauss_Seidel/GaussSeidelMetodo.java: Gauss-Seidel.
- src/Ecuaciones_lineales/JACOBI/MainJacobi.java: ejecucion de ambos metodos.

Se conservaron las clases base, corrigiendo kMainJacobi a MainJacobi.
Se unifico el paquete Ecuaciones_lineales para coincidir con la estructura
solicitada en el PDF. Esta version imprime cada iteracion.
Los metodos validan el sistema 3x3 y avisan si no convergen.

## Ejecutar en IntelliJ IDEA
1. Instala/configura un JDK 17 o superior.
2. Descomprime el proyecto y abre su carpeta en IntelliJ (Open).
3. En File > Project Structure > Project selecciona el JDK.
4. Si src no se reconoce, clic derecho sobre src > Mark Directory as > Sources Root.
5. Abre MainJacobi.java y ejecuta el triangulo junto a main.
6. Comprueba ambas tablas y guarda capturas propias de la consola.

## Ejecutar desde terminal
Desde la carpeta que contiene src, con un JDK instalado:

```sh
javac -d out src/Ecuaciones_lineales/JACOBI/*.java src/Ecuaciones_lineales/Gauss_Seidel/*.java
java -cp out Ecuaciones_lineales.JACOBI.MainJacobi
```

## Resultados esperados y verificacion
Jacobi: 16 iteraciones. Gauss-Seidel: 6 iteraciones.
Los valores de referencia se calcularon independientemente en Python;
no se ejecuto ni compilo Java en el entorno de preparacion porque no dispone de javac.
Contrastar los resultados con la consola Java antes de la entrega.
El detalle esta en resultados_referencia.txt.

## GitHub publico y entrega
1. En GitHub crea un repositorio llamado Jacobi-GaussSeidel-Unidad3.
2. Selecciona Public y crea el repositorio.
3. Usa Add file > Upload files y arrastra src, README.md y .gitignore
   (si el archivo oculto no aparece, puedes crearlo despues con Add file).
   No subas solamente el ZIP: el codigo debe poder consultarse.
4. Confirma con Commit changes.
5. Abre la pagina principal y copia el enlace del repositorio.
6. Entrega ese enlace junto con el reporte PDF. Conserva las rutas y mayusculas.
7. El reporte incluye tablas de referencia; agrega capturas de tu ejecucion real
   si deseas evidencias visuales. No se ha publicado un repositorio desde este entorno.
