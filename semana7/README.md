# Semana 7
## Árboles binarios
### BinaryTree.java
- `add`: se necesita un nodo de origen para situar el nuevo nodo. En caso que todos los espacios esten ocupados no se agrega el nodo.
- `dsfPreorder`: Muestra el recorrido de un árbol a traves del algoritmo por profundidad preorden (Depth First Traversal).
- `bsfTraversal`: Recorrido de los nodos de un árbol por anchura (Breadth First Traversal)
### BinarySearchTree.java
- `add`: este método permite ordenar los nodos a partir de la raíz. 
  - A la izquierda si el nodo es inferior al que se compara.
  - A la derecha si el nodo es superiod al que se compara. 
  - En caso de ser iguales los datos no se inserta (evitar duplicaciones).
- `remove`: Esta compleja función trata de eliminar el nodo correspondiente a un valor buscado. En caso de ser necesario reordena el árbol a fin de mantener la relación entre nodos... a la izquierda nodos inferiores a la raíz y a la derecha los superiores.
- `contains`: Se utiliza un esquema parecido al algoritmo binary search que se utiliza en estructuras lineales. 
## Árboles n-arios
### Tree.java
En este caso se implementan las mismas funciones que el archivo `BinaryTree.java` pero en lugar de dos referencias se tiene un List para gestionar múltiples hijos para identificar si un dato esta dentro del nodo.