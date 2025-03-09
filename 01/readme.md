# Notas Clase 1: Introducción a Estructuras de Datos y Algoritmos

## Objetivos
1. Revisar el programa
2. Revisar conceptos básicos relevantes

### Algoritmos y Estruturas de datos
- ¿Qué es un algoritmo?

Un algoritmo es una secuencia de pasos finita, bien especificada,
que denota de forma clara y precisa las instrucciones para procesar
y transformar cada instancia de entrada de un problema en una instancia de salida correcta.

Al final es bien similar a la idea que se puede tener de función cuando programamos, recibimos
N paramétros de entrada y los transformamos en M parámetros de salida,
el punto es preguntarse si la función que transforma el input en el output,
es correcta y eficiente en el contexto que la función vaya a ser usada.

No obstante, un algoritmo no es algo propio de la programación, un algoritmo es algo intangible. Efectivamente
se puede especificar mediante la implementación en algún lenguaje de programación,
pero así mismo se podría especificar
un algoritmo en cualquier otro lenguaje o idioma como el español, francés, inglés o chino.

Un ejemplo de esto podría ser el algoritmo que todos aprendimos hace bastante tiempo: sumar dos números enteros,
partimos alineando los sumando de izquierda a derecha y empezamos desde la izquierda, sumamos cada dígito,
si la suma es mayor o igual a 10, bajamos al resultado para la siguiente operación
temporal ((a + b) % 10) y pasamos como acarreo lo que nos "sobra" ((a + b) / 10),
en caso que el resultado sea menor
a 10, simplemente bajamos el resultado temporal y continuamos con la siguiente operación.
Repetimos esto hasta que hayamos sumado todos los dígitos de los sumando.

- Problema Computacional

Un problema computacional, es un problema que podemos resolver mediante la implementación de un algoritmo.
Encontrar la paz mundial podría ser un problema, pero no existe forma de plantear dicho problema a un computador
para resolverlo con algún algoritmo.

Describir la mejor receta de porotos con mazamorra también es un problema que no es posible plantear
como computacional, porque cuando las recetas dicen, una pizca de pimienta o aceite a gusto,
ya dejan de ser algoritmicas y se transforman en algo subjetivo. Un algoritmo no puede ser subjetivo.

Un problema computacional se caracteriza por definir un conjunto de datos de entrada y uno de salida, donde
cada entrada x puede tener uno o más valores de salida y correctos.
Los siguientes ejemplos son problemas computacionales: ordenar un arreglo de enteros de forma
ascendente, validar si un rut es válido, encontrar el camino más corto entre dos puntos en un mapa,
entre muchos otros ejemplos más.


- Correctitud y Eficiencia

Por correctitud entendemos que un algoritmo transformará en un tiempo finito, cada instancia de entrada x, en
una salida y válida.

No haremos estudio algoritmos aproximados (probabilisticos) durante el curso.

Por eficiencia entendemos que el algoritmo hará el mejor uso posible de los recursos disponibles (ram, disco duro, cpu, red, gpu).

- ¿Por qué estudiar algoritmos?

La idea de estudiar algoritmos para un ingeniero es desarrollar
la capacidad de pensar y reflexionar sobre la correctitud y eficiencia de programas y sistemas computacionales.
Saber cuando escoger una determinada estructura de datos y cuando no.
Saber cuando es necesario mejorar la performance de un programa y cuando no.
La idea al final es cuestionarse, por qué y cómo funciona este sistema, entender qué tan eficiente es
para la carga de trabajo o tráfico que tiene,
para con eso decidir si vale la pena mejorar una implementación o no,
porque en la vida real mejorar una implementación cuesta tiempo y plata.
Al final es como dijo D. Knuth hace un buen tiempo: "Premature Optimization is the root of all evils."

- Estructura de datos

Una estructura de datos es una forma de organizar y almacenar datos. Define la relación entre elementos,
las operaciones que pueden ser realizadas y las reglas o restricciones para acceder o modificar los datos.

- Relación algoritmos y estructura de datos

Existe una correlación directa entre estructura de datos y algoritmos, puesto que una estructura de datos define
cómo los datos se almacenan, organizan y consultan, así que los métodos de una estructura de datos son algoritmos.
Por otro lado los algoritmos suelen hacer uso de ciertas estructuras de datos para mejorar la eficiencia.

- Programación y abstracción

Abstracción en el contexto del curso se refiere a encapsular una idea más grande o compleja, mediante un conjunto
de ideas más pequeñas. Esto a nivel práctico significa que un determinado modelo de datos o sistema
lo podemos abstraer mediante una interfaz de programación(API), para que de esta forma otros programadores o usuarios
no tengan que pensar en cómo está implementado el sistema, y más bien puedan hacer uso de este mediante la interfaz
que ya definimos.

- Modelo RAM

Para analizar algoritmos haremos uso del modelo ram. Asumiremos que cada algoritmo se ejecuta en una
maquina con un procesador de un solo nucleo, donde dicha maquina tiene suficiente RAM para mantener en memoria
todo lo que el algoritmo necesite. En la práctica veremos que esto no siempre es así, de hecho en la vida real
hay muchos otros recursos disponibles (red, gpu, caché y registros del procesador, disco duro, entre otros),
no obstante para los algoritmos que estudiaremos en el curso no es necesario hilar tan fino.


### Unidades temáticas

Resumido así nomás, durante el semestre vamos a estudiar:

1. Arreglos
2. Análisis Asintótico
3. Recursividad
4. Listas
5. Colas
6. Pilas
7. Búsqueda y Ordenamiento
8. Arboles de búsqueda binarios
9. Tablas de hash
10. Introducción a Grafos

### Programación en Java

Durante el transcurso del curso CIT-2006, se hará uso del lenguaje de
programación Java, el cual es ampliamente utilizado en la industria y academia.
Java es un lenguaje imperativo, orientado a objetos con una sintaxis
que recuerda en gran medida a su predecesor C.

La concepción del lenguaje fue en la ya extinta Sun Microsystems,
donde el computín James Gosling dirigió y lideró el proyecto para que
el lenguaje viera la luz del día.

La primera tarea es instalar Java en su computadora, para esto tienen un par de opciones:

1. Instalar directamente algún JDK y luego programar con algún editor de texto como VSCode.
2. Instalar algún IDE como IntelliJ. Para el caso de la Universidad recuerde que existe un beneficio con
  Jetbrains para estudiantes, por lo que podrían instalar cualquier IDE de JetBrains sin costo alguno.

En resumen instale la opción que le agrade más, no hay ninguna mejor que otra en el contexto del curso,
como así mismo no hay restricciones con el sistema operativo.

Para más información pueden leer el programa del curso CIT-2006 y/o consultar
la bibliografía (Sedgewick 4th edition, Sedgewick & Wayne).
