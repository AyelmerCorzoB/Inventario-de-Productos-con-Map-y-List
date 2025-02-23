# Sistema de Inventario en con Map  y List🏬📦

Este programa en Java permite gestionar un inventario de productos organizados por categorías. Utiliza un `Map<String, List<String>>` para almacenar las categorías y sus productos asociados. El usuario puede agregar categorías, productos, y realizar consultas a través de un menú interactivo.

## Características principales ✨

- **Agregar categorías y productos**: Permite al usuario crear nuevas categorías y agregar productos a ellas.
- **Mostrar productos por categoría**: Muestra todos los productos de una categoría específica.
- **Agregar productos a categorías existentes**: Permite añadir productos a categorías ya creadas.
- **Mostrar todo el inventario**: Muestra todas las categorías y sus productos.
- **Validación de entradas**: Asegura que las entradas del usuario sean válidas y maneja errores.

## ¿Cómo funciona? ⚙️

1. El programa muestra un menú con las siguientes opciones:
   - **Agregar categoría y productos**: Crea una nueva categoría y añade productos a ella.
   - **Mostrar productos de una categoría**: Muestra los productos de una categoría específica.
   - **Agregar producto a una categoría existente**: Añade productos a una categoría ya existente.
   - **Mostrar todas las categorías y productos**: Muestra todo el inventario.
   - **Salir**: Termina la ejecución del programa.
2. Los datos se almacenan en un `Map<String, List<String>>`, donde la clave es el nombre de la categoría y el valor es una lista de productos.
3. El programa maneja excepciones para evitar errores en tiempo de ejecución.

## Ejemplo de uso 🖥️

### Menú:
````bash
--- Menú de Inventario ---

Agregar categoría y productos

Mostrar productos de una categoría

Agregar producto a una categoría existente

Mostrar todas las categorías y productos

Salir
````
### Agregar categoría y productos:
````bash
Selecciona una opción: 1
Ingrese el nombre de la categoría: Frutas
Ingrese los productos (separados por comas): Manzana, Plátano, Naranja
Categoría y productos agregados correctamente.
````
### Mostrar productos de una categoría:
````bash
Selecciona una opción: 2
Ingrese el nombre de la categoría: Frutas
Productos en la categoría Frutas:

Manzana

Plátano

Naranja
````
### Agregar producto a una categoría existente:
````bash
Selecciona una opción: 3
Ingrese el nombre de la categoría: Frutas
Ingrese el producto a agregar: Uva
Producto agregado correctamente.
````
### Mostrar todo el inventario:
````bash
Selecciona una opción: 4
Categorías y productos:

Frutas: [Manzana, Plátano, Naranja, Uva]
````
### Salir:
````bash
Selecciona una opción: 5
Saliendo del programa...
````
## Requisitos 📋

- **Java JDK**: Asegúrate de tener Java JDK instalado (versión 8 o superior).
- **IDE o editor de texto**: Puedes usar IntelliJ, Eclipse, VS Code o cualquier editor de tu preferencia.

## ¿Cómo ejecutar el programa? 🚀

1. Clona este repositorio o copia el código en tu entorno de desarrollo.
2. Compila y ejecuta el archivo `Main.java`.
3. Sigue las instrucciones en la consola para gestionar el inventario.

## Estructura del proyecto 🗂️

- **Main.java**: Contiene el menú principal y la lógica de interacción con el usuario.
- **Funciones.java**: Contiene las funciones para gestionar el inventario.
- **ValidacionException.java**: Maneja excepciones personalizadas para validaciones.

## Contribuciones 🤝

Si encuentras algún error o tienes alguna mejora, ¡no dudes en abrir un issue o enviar un pull request! Todas las contribuciones son bienvenidas.

---

## �‍💻 **Autor**
* [AyelmerCorzoB](https://github.com/AyelmerCorzoB)

---