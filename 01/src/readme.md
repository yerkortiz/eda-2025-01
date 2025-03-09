# Hola Mundo en Java

Para la primera clase, solo se pedirá que implementen el clásico programa "Hola Mundo",
para verificar que su entorno de desarrollo en Java está listo y funcionando. Ustedes deciden
cómo instalar y usar Java.

## Implementación

Ver implementación en [Hello.java](Hello.java)

## Conceptos Clave

Aunque un hola mundo es bien trivial, les recomiendo leer la documentación oficial de todo lo que
está en el programa:

- `public`: Permite que una clase o miembro(podría ser un método o atributo) sea accesible desde cualquier otra parte del programa.
- `class`: Declaración de una clase, define un tipo de dato que encapsula atributos y comportamientos.
  En Java todo programa debe estar en una clase.
- `static`: Es una keyword que indica que un miembro (método o variable) pertenece a la clase en sí
  y no a instancias específicas de la clase. Es decir que un método puede ser usado sin tener que referenciarlo desde un objeto.
- `void`: Es un tipo de retorno que indica que un método no devuelve ningún valor
- `main`: Método principal que es donde inicia la ejecución del programa.
- `String[] args`: Es un arreglo de argumentos que el programa puede recibir al momento de ejecutar el programa vía CLI.
- `System.out`: System.out es un objeto de la clase System, que permite controlar el flujo de salida de datos (stdout) de un programa.
- `package`: Permite organizar clases relacionadas en un namespace específico, en este caso el programa está en el package `src`.

## Compilación y ejecución

Para compilar y ejecutar el programa:

1. Compilar: `javac Hello.java`
2. Ejecutar: `java Hello`

## Preguntas de repaso

1. ¿Qué es un objeto y que diferencia tiene con una clase?
2. ¿Qué es una expresión en programación?
3. ¿Qué tipos de datos tiene C++? Investigue y contraste esos tipos de datos con los existentes en Java.
4. ¿Qué es un puntero en C++? Investigue y contraste lo que sabe de punteros, con lo que Java ofrece para referenciar miembros de un objeto.
5. ¿Qué statements de control flow tiene C++? Investigue y contraste esos statements con los existentes en Java.
6. ¿Por qué en la implementación de la clase `Hello.java` el método `main` debe ser static?
7. ¿Qué sucede si removemos el keyword public de la clase `Hello.java`?

## Referencias

- [Documentación oficial de Java](https://docs.oracle.com/en/java/)
