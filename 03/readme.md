# Notas Clase 3: Sistema Posicional

## Objetivo
1. Revisar como caso de estudio el sistema posicional, en particular diseñar un algoritmo que transforme un entero N a sistema binario.

## Sistema Posicional
Un sistema posicional es un sistema de numeración en el cual el valor
del número representado depende de la posición en la que esté cada dígito.

En el mundo moderno conocemos a la perfección el sistema decimal:
1, 2, 3, 5, 7, 11, 13, 17, 100, 999, 1048.

El sistema decimal es un sistema posicional en el cual cada dígito está entre
0 y 9 (10 dígitos). Es posicional porque el valor del número cambia dependiendo de
la posición de cada número.

Por ejemplo 31 = 3 x 10 + 1 x 1, por otro lado 13 que tiene los mismos dígitos
pero en otra posición tiene un valor completamente distinto porque 13 = 1 x 10 + 3 x 1.

Al final pensar en número en sistema posicional no es tan distinto a pensar en un arreglo,
cada dígito tiene su posición.

Ahora pensemos en el sistema binario, la base es dos y se conforma de dos dígitos {0, 1}.

En ese aspecto, en la siguiente tabla se ejemplifica la transformación de algunos números en sistema binario
a sistema decimal.

| N en binario | Desarrollo                     | Resultado |
|--------------|--------------------------------|-----------|
| 0           | 0 × 1                          | 0         |
| 1           | 1 × 1                          | 1         |
| 10          | 1 × 2 + 0 × 1                  | 2         |
| 11          | 1 × 2 + 1 × 1                  | 3         |
| 111         | 1 × 4 + 1 × 2 + 1 × 1         | 7         |
| 1000        | 1 × 8 + 0 × 4 + 0 × 2 + 0 × 1 | 8         |

## Algoritmo que transforma un entero N a binario
Ahora pensemos en el siguiente problema, diseñar un algoritmo
que transforma cualquier número entero N a sistema binario.

La primera parte es entender y definir el modelo de datos del problema.

```
Input:
  Número entero N.
Output:
  El problema no nos dice qué formato debe tener el output.
  Asumiremos que el output será un String B, que representa a N
  en sistema binario.
```

El input es cualquier entero N. En java sabemos que podemos representar un entero
con el tipo de dato int, el cual tiene diversos operadores
de comparación como igual a (==), menor o igual (<=) y mayor o igual(>=),
además de operadores aritméticos:
suma, resta, multiplicación, división y módulo.

Por otro lado un String es una secuencia de caracteres, en particular recordar
que es posible concatenar strings con el operador +.

Consejo: siempre para cualquier problema computacional que vaya a enfrentar ahora y en el futuro,
lo importante es entender el modelo de datos con el que va a trabajar.
Qué tipos de datos y qué atributos tienen. Qué operadores y métodos tienen.
Qué propiedades y condiciones tienen para ser válidos para el problema.
Una vez entendido esto, ya tendrá un mapa con el cual empezar a navegar el problema.

Continuando con el problema propuesto lo siguiente es resolver el problema:

```
Input:
  Número entero N.
Output:
  String B que representa a N en sistema binario.
Algoritmo:
1. Instanciar un String B, inicializado con el valor N%2. B=(N%2).
2. Mientras N/2 sea mayor a 0, repetir lo siguiente:
  a. Concatenar a la izquierda de B el valor N % 2. B=(N%2)+B.
  b. Decrementar N a la mitad. N = N/2.
3. Retornar B.
```

La implementación la pueden ver en [DecimalToBinary.java](src/DecimalToBinary.java)


## Problemas
1. Diseñe un algoritmo que transforme un String binario B a un número entero en sistema decimal.
2. Diseñe un algoritmo que transforme un entero N a sistema octal.
3. Diseñe un algoritmo que transforme un entero N a sistema hexadecimal.
4. Diseñe un algoritmo que transforme un entero N a sistema base 64.
5. Diseñe un algoritmo que transforme un entero N a sistema base K.
6. Diseñe un algoritmo que reciba como entrada un número entero N y lo invierta. Por ejemplo
  si N=742, el output deberia ser 247.
