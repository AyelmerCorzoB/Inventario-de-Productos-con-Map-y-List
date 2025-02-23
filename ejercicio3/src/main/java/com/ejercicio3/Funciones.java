package com.ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Funciones {

    public static void mostrarProductos(Map<String, Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            System.out.println("\n--- Productos Registrados ---");
            for (Map.Entry<String, Producto> entry : productos.entrySet()) {
                System.out.println(entry.getValue());
            }
        }
    }

    public static void agregarCategoriaYProductos(Map<String, List<String>> inventario, Scanner sc) throws ValidacionException {
        System.out.print("Ingresa el nombre de la categoría: ");
        String categoria = sc.nextLine();

        if (inventario.containsKey(categoria)) {
            throw new ValidacionException("La categoría ya existe.");
        }

        int cantidadProductos = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print("Ingresa la cantidad de productos para la categoría '" + categoria + "': ");
            if (sc.hasNextInt()) {
                cantidadProductos = sc.nextInt();
                sc.nextLine();
                valido = true;
            } else {
                System.out.println("Error: debe ingresar un número entero.");
                sc.next();
            }
        }

        List<String> productos = new ArrayList<>();
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingresa el nombre del producto " + (i + 1) + ": ");
            String producto = sc.nextLine();
            productos.add(producto);
        }

        inventario.put(categoria, productos);
        System.out.println("Categoría y productos agregados correctamente.");
    }

    public static void mostrarProductosDeCategoria(Map<String, List<String>> inventario, Scanner sc) throws ValidacionException {
        System.out.print("Ingresa el nombre de la categoría: ");
        String categoria = sc.nextLine();

        if (!inventario.containsKey(categoria)) {
            throw new ValidacionException("La categoría no existe.");
        }

        List<String> productos = inventario.get(categoria);
        System.out.println("\n--- Productos de la categoría '" + categoria + "' ---");
        for (String producto : productos) {
            System.out.println(producto);
        }
    }

    public static void agregarProductoACategoriaExistente(Map<String, List<String>> inventario, Scanner sc) throws ValidacionException {
        System.out.print("Ingresa el nombre de la categoría: ");
        String categoria = sc.nextLine();

        if (!inventario.containsKey(categoria)) {
            throw new ValidacionException("La categoría no existe.");
        }

        System.out.print("Ingresa el nombre del producto: ");
        String producto = sc.nextLine();
        inventario.get(categoria).add(producto);
        System.out.println("Producto agregado correctamente a la categoría '" + categoria + "'.");
    }

    public static void mostrarTodasLasCategoriasYProductos(Map<String, List<String>> inventario) {
        if (inventario.isEmpty()) {
            System.out.println("No hay categorías registradas.");
        } else {
            System.out.println("\n--- Todas las Categorías y Productos ---");
            for (Map.Entry<String, List<String>> entry : inventario.entrySet()) {
                System.out.println("Categoría: " + entry.getKey());
                System.out.println("Productos: " + entry.getValue());
            }
        }
    }
}