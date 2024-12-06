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
public class ProductosConFallasIterator implements ProductIterator {
    private List<Object> inventario;
    private int position;

    public ProductosConFallasIterator(List<Object> inventario) {
        this.inventario = inventario;
        this.position = 0;
    }

    @Override
    public boolean hasMore() {
        while (position < inventario.size()) {
            if (tieneFalla(inventario.get(position))) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Object getNext() {
        if (hasMore()) {
            return inventario.get(position++);
        }
        return null;
    }

    private boolean tieneFalla(Object producto) {
        // Lógica para verificar si el producto tiene fallas
        return false; // Placeholder
    }
}
