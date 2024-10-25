###  Evaluación de Métodos de Ordenamiento y Búsqueda

#### Descripción General

Esta evaluación tiene como objetivo que los estudiantes implementen diferentes algoritmos de **ordenamiento** y **búsqueda** en Java utilizando la clase `Person`. Se ha proporcionado un código **template** que genera una lista de 50 personas con atributos aleatorios, y cada grupo deberá completar sus respectivas tareas de acuerdo a los métodos de ordenamiento y búsqueda que se les asignaron.

### Objetivos de los Grupos:

Cada grupo tiene asignados los siguientes métodos de ordenamiento y búsqueda:

- **Grupo A**:
  - **Ordenamiento**: `sortByAgeWithSelection` (ordenar por edad usando Selection Sort).
  - **Búsqueda**: `searchBinaryByAge` (búsqueda binaria por edad).

- **Grupo B**:
  - **Ordenamiento**: `sortByAgeWithInsertion` (ordenar por edad usando Insertion Sort).
  - **Búsqueda**: `searchBinaryByAge` (búsqueda binaria por edad).

- **Grupo C**:
  - **Ordenamiento**: `sortByHeightWithSelection` (ordenar por altura usando Selection Sort).
  - **Búsqueda**: `searchBinaryByHeight` (búsqueda binaria por altura).

- **Grupo D**:
  - **Ordenamiento**: `sortByHeightWithInsertion` (ordenar por altura usando Insertion Sort).
  - **Búsqueda**: `searchBinaryByHeight` (búsqueda binaria por altura).

### Estructura del Código

El código está dividido en tres clases principales:

1. **Clase `Person`**: 
   - Modelo que representa a una persona con los atributos `name`, `age` y `height`. 
   - Incluye getters, setters, y un método `toString()` para mostrar la información de cada persona.

2. **Clase `PersonasGenerator`**:
   - Se encarga de generar un arreglo de 50 personas con datos aleatorios de nombre, edad y altura. En este caso, los datos se han precargado para simplificar la evaluación.

3. **Clase `MetodosOrdenamientoBusqueda`**:
   - Contiene los métodos vacíos que deben ser implementados por cada grupo. Aquí se encuentran los métodos de **ordenamiento** (`sortByAgeWithSelection`, `sortByAgeWithInsertion`, `sortByHeightWithSelection`, `sortByHeightWithInsertion`) y de **búsqueda** (`searchBinaryByAge`, `searchBinaryByHeight`).
   - Cada grupo debe completar la implementación del método de ordenamiento y búsqueda asignado.

4. **Clase `App`**:
   - Es la clase principal que genera las personas utilizando la clase `PersonasGenerator` y llama a los métodos de ordenamiento y búsqueda implementados por los estudiantes.
   - Actualmente, solo imprime el listado de personas generadas.

### Tareas por Grupo

#### Grupo A:
- Implementar el método `sortByAgeWithSelection` que utiliza el algoritmo de **Selection Sort** para ordenar las personas por edad.
- Implementar el método `searchBinaryByAge` que utiliza el algoritmo de **Búsqueda Binaria** para buscar una persona en el arreglo ordenado por su edad.

#### Grupo B:
- Implementar el método `sortByAgeWithInsertion` que utiliza el algoritmo de **Insertion Sort** para ordenar las personas por edad.
- Implementar el método `searchBinaryByAge` que utiliza el algoritmo de **Búsqueda Binaria** para buscar una persona en el arreglo ordenado por su edad.

#### Grupo C:
- Implementar el método `sortByHeightWithSelection` que utiliza el algoritmo de **Selection Sort** para ordenar las personas por altura.
- Implementar el método `searchBinaryByHeight` que utiliza el algoritmo de **Búsqueda Binaria** para buscar una persona en el arreglo ordenado por su altura.

#### Grupo D:
- Implementar el método `sortByHeightWithInsertion` que utiliza el algoritmo de **Insertion Sort** para ordenar las personas por altura.
- Implementar el método `searchBinaryByHeight` que utiliza el algoritmo de **Búsqueda Binaria** para buscar una persona en el arreglo ordenado por su altura.

### Guía para Implementar los Métodos

#### 1. **Ordenamiento con Selection Sort**
   - **Concepto**: Selection Sort encuentra el elemento más pequeño en una lista y lo coloca en la primera posición, luego repite este proceso con el resto de la lista.
   - **Sugerencia**: Usa dos bucles `for`. El primero para recorrer todo el arreglo y el segundo para encontrar el mínimo y hacer el intercambio.

#### 2. **Ordenamiento con Insertion Sort**
   - **Concepto**: Insertion Sort construye el arreglo ordenado insertando cada elemento en su lugar adecuado dentro del arreglo ya ordenado.
   - **Sugerencia**: Usa un bucle `for` para recorrer el arreglo y un bucle interno para mover el elemento a su posición correcta en la parte ordenada del arreglo.

#### 3. **Búsqueda Binaria**
   - **Concepto**: La búsqueda binaria funciona dividiendo el arreglo ordenado en dos partes. Compara el elemento central con el valor buscado, si no coincide, descarta la mitad del arreglo que no contiene el valor.
   - **Sugerencia**: Implementa el algoritmo de búsqueda binaria usando un bucle `while` o recursión.

### Ejecución del Programa

1. **Generación de Personas**: El método `generarPersonas()` creará un arreglo de 50 personas con diferentes edades y alturas.
2. **Ordenamiento**: Dependiendo del grupo, implementar el método correspondiente para ordenar las personas por edad o altura.
3. **Búsqueda**: Una vez que el arreglo esté ordenado, implementar el método de búsqueda binaria para encontrar una persona según el criterio asignado (edad o altura), segun indicaciones.

### Evaluación

- Se evaluará la correcta implementación de los métodos de ordenamiento y búsqueda.
- El código debe estar bien estructurado y comentado.
- Los resultados deben ser correctos para las pruebas que se realicen con diferentes datos de entrada.

### Recomendaciones

- Verifica el funcionamiento de tu código con diferentes valores.
- Asegúrate de ordenar el arreglo antes de realizar la búsqueda binaria.


### Salida Esperada del Programa de la Evaluación

1. **Listado de Personas Generadas**: Se imprime el arreglo de personas generado aleatoriamente.
2. **Arreglo Ordenado**: Dependiendo del grupo, se imprime el arreglo ordenado por edad o altura.
3. **Resultado de Búsqueda Binaria**:
   - Si el valor buscado **existe**, se imprime la posición y los detalles de la persona.
   - Si el valor buscado **no existe**, se informa que el valor no se encuentra en el arreglo.

### Compilar el poryecto con las pruebas 
```bash
javac -cp "lib/*:src" -d bin src/*.java src/models/*.java test/java/*.java
```