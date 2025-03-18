# Notas Clase 2: Algoritmos aritméticos

## Objetivos

1. Profundizar en el concepto de algoritmo y sus sus características fundamentales.
2. Estudiar algoritmos aritméticos básicos como casos de estudio.

## Algoritmo

Un algoritmo es una secuencia finita de pasos bien especificados,
que denota de forma clara y precisa las instrucciones para procesar
y transformar cada instancia de entrada válida de un problema en su correspondiente
instancia de salida correcta.

Así mismo un problema computacional se caracteriza por:
- Entrada
- Salida
- Intrucciones bien definidas
- Finito

### Búsqueda

#### Ejemplo: Búsqueda en un arreglo
Empecemos con un problema que conocen bien: buscar un arreglo en un arreglo de enteros.

La entrada es un arreglo de N números enteros y un número entero X que es elemento que buscaremos.
La salida es la posición en la que se encuentre el elemento X. En caso que no esté presente retornamos -1.

De esta descripción ya tenemos suficiente para resolver el problema.

Por lo que si nos dan la siguiente instancia de entrada:

```
A = {2,3,5,7,11,13}
X = 4
```

La salida deberia ser -1.

Podriamos diseñar un algoritmo para encontrar el elemento:


1. Iterar de izquierda a derecha.
2. Verificar si en el elemento $$a_i$$ es igual a X.
  a. En caso que sea igual retornamos la posición.
  b. En caso contrario continuamos.

La implementación en java la pueden ver aquí.

Un par de preguntas:
1. ¿Cuántos pasos realiza el algoritmo de búsqueda?
2. ¿Qué pasa si el arreglo está ordenado?
3. ¿Podemos hacer la búsqueda más eficiente?

Pero, ¿qué pasa si ahora el problema es buscar un arreglo de Strings?
1. ¿Qué cambia en la entrada y salida del problema?
2. ¿Qué modificaciones necesita el algoritmo que implementamos previamente?
3. ¿Cómo se comparan dos Strings?
A modo de ejercicio realice la implementación de este segundo problema.

## Caso de estudio 1: Suma con acarreo
Sean dos arreglos de enteros A y B. Cada uno de estos arreglos representa un número entero N y M, tal que cada
casilla en los arreglos almacenan uno y solo uno de los digitos de cada número respectivamente. Cada arreglo mantiene
el orden original de los digitos.

```
Por ejemplo si N = 256, entonces A sería {2,5,6}.
```

Diseñe un algoritmo que reciba como entrada dos arreglos A y B y retorne como resultado la suma de los números
en otro arreglo.

Ejemplo:

A = {9,5,8}
B = {3,6,2}
C = {1,3,2,0}

### Diseño de la solución
Empecemos diseñando una solución, es directa en el sentido de que ya sabemos sumar, solo nos faltaría
expresar esa idea en forma de algoritmo:

```
Entrada: Arreglo de enteros A, arreglo de enteros B
Salida: Arreglo de enteros, dicho arreglo representa un número entero en sistema decimal
1. Instanciar un arreglo de enteros C. Partiremos asumiendo que A y B tienen el mismo tamaño,
  por lo que dejaremos a C con tamaño A.length + 1.
2. Instanciar una variable carry, que almacenará el acarreo.
3. Iterar en A y B de derecha a izquierda:
  a. Asignar a C[i+1] el resultado de (A[i] + B[i] + carry) % 10
  b. Volver a calcular el acarreo, asignando a carry el resultado de (A[i] + B[i] + carry) / 10
4. Asignar a C[0] el último valor del carry
5. Retornar C
```

2. Implementación
La implementación es directa, la idea de diseñar un algoritmo con pseudocódigo es esbozar una solución
para que la implementación sea simple y directa.
Aquí pueden ver la implementación [ArraySum.java](src/ArraySum.java)

## Preguntas
A modo de reflexión piense en ejemplos a mayor escala:
1. Cómo funciona la búsqueda de productos en un sistema de e-commerce como el de amazon.
2. Cómo funciona el calculo de balance en una cuenta bancaria.
3. Cómo funciona la búsqueda de mensajes en algún chat de discord.
4. Qué ventaja y desventaja ven en el algoritmo diseñado para la suma con acarreo.

## Problemas
1. Diseñe un algoritmo que calcule la resta de dos números A y B representados como arreglos.
2. Diseñe un algoritmo que calcule la multiplicación de dos números A y B representados como arreglos.
3. Diseñe un algoritmo que calcule la división de dos números A y B representados como arreglos.
4. Diseñe un algoritmo que calcule la suma de N números enteros representados como arreglos
  y retorne el resultado en forma de arreglo.
