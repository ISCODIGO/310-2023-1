# Semana 6
## Recursión
### Llamado de funciones
Comenzamos a revisar como varias llamadas de funciones establecen un orden, intuyendo el uso de una pila.
### Primera recursión
- Función `abc()`, no tiene un caso base por lo que no se detendrá hasta que ocurra un *StackOverflow error*.
- Función `xyz`, esta funcion se le agrega un caso base que permite que se ejecute mientras el contador no exceda su valor límite.
### Fibonacci
- Versión lenta O(2<sup>n</sup>)
- Versión rapida O(n) utiliza una especie de cache que evita recalcular números de Fibonacci previos.
### Suma de Enteros
Una función que permite obtener la suma de todos los enteros desde 0 hasta N. Bajo la fórmula `S(n) = n + S(n-1)`

## Pila (Stack)
Una estuctura donde el último elemento (el más reciente insertado) es el que podemos manipular. Ese elemento se denominado cima (top). 
Las dos operaciones más importantes son:
- **push**: insertar una nueva cima.
- **pop**: eliminar la cima actual.

### MyStack
Utilizamos el LinkedList como medio para crear nuestra propia implementación de una pila.
### Equilibro de Paréntesis
Usamos una pila para establecer un algoritmo que permita detectar si la formación de paréntesis está equilibrada.