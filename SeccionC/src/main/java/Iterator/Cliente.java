/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.List;

/**
 *
 * @author Dario Anchundia Cobo
 */
public class Cliente {
    public static void main(String[] args) {
        List<Object> productos = List.of(/* Lista de productos */);
        Inventario inventario = new Inventario(productos);

        ProductIterator disponibles = inventario.createIteratorProductosDisponibles();
        while (disponibles.hasMore()) {
            System.out.println("Producto disponible: " + disponibles.getNext());
        }

        ProductIterator conFallas = inventario.createIteratorProductosConFallas();
        while (conFallas.hasMore()) {
            System.out.println("Producto con fallas: " + conFallas.getNext());
        }

        ProductIterator enReparacion = inventario.createIteratorProductosEnReparacion();
        while (enReparacion.hasMore()) {
            System.out.println("Producto en reparación: " + enReparacion.getNext());
        }
    }
}

