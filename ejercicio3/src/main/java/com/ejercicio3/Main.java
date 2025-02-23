package com.ejercicio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, List<String>> inventario = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        String menu = """
                                \n--- Menú de Inventario ---
                1. Agregar categoría y productos
                2. Mostrar productos de una categoría
                3. Agregar producto a una categoría existente
                4. Mostrar todas las categorías y productos
                5. Salir
                                """;
        do {
            try {
                System.out.println(menu);
                System.out.print("Selecciona una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        Funciones.agregarCategoriaYProductos(inventario, sc);
                        break;
                    case 2:
                        Funciones.mostrarProductosDeCategoria(inventario, sc);
                        break;
                    case 3:
                        Funciones.agregarProductoACategoriaExistente(inventario, sc);
                        break;
                    case 4:
                        Funciones.mostrarTodasLasCategoriasYProductos(inventario);
                        break;
                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida, vuelve a intentarlo.");
                        break;
                }
            } catch (ValidacionException e) {
                System.err.println("Error de validación: " + e.getMessage());
            } catch (InputMismatchException e) {
                System.err.println("Error: debes ingresar un número entero.");
                sc.next();
            } catch (Exception e) {
                System.err.println("Error inesperado: " + e.getMessage());
            }
        } while (opcion != 5);

        sc.close();
    }
}