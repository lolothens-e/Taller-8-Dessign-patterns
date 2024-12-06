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
public class Inventario implements InventarioColeccionable {
    private List<Object> productos;

    public Inventario(List<Object> productos) {
        this.productos = productos;
    }

    @Override
    public ProductIterator createIteratorProductosDisponibles() {
        return new ProductosDisponiblesIterator(productos);
    }

    @Override
    public ProductIterator createIteratorProductosConFallas() {
        return new ProductosConFallasIterator(productos);
    }

    @Override
    public ProductIterator createIteratorProductosEnReparacion() {
        return new ProductosReparacionIterator(productos);
    }
}
