package service;

import java.util.ArrayList;
import java.util.List;
import model.Producto;

public class ProductoService {
    static List<Producto> listaProductos = new ArrayList<>();

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public static void setListaProductos(List<Producto> listaProductos) {
        ProductoService.listaProductos = listaProductos;
    }

    public boolean tryChangeStringToInt(String cadena) {
        try {
            int num = Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean tryChangeStringToDouble(String cadena) {
        try {
            double num = Double.parseDouble(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public double changeStringToDouble(String cadena) {
        double num = Double.parseDouble(cadena);
        return num;
    }

    public double changeStringToInt(String cadena) {
        int num = Integer.parseInt(cadena);
        return num;
    }

    public boolean insertProductoEnAlmacen(Producto prod) {
        boolean insertado = true;

        for (Producto prod1 : listaProductos) {
            if (prod1.getNomProducto().equalsIgnoreCase(prod.getNomProducto())) {
                insertado = false;
                break;
            }
        }

        if (insertado) {
            listaProductos.add(prod);
        }
        return insertado;
    }

    public String listaProductos() {
        String cadena = "";
        if (listaProductos.isEmpty()) {
            System.out.println("El almacen esta vacio");
        } else {
            for (int pos = 0; pos < listaProductos.size(); pos++) {
                Producto prod = listaProductos.get(pos);
                cadena = cadena + prod.toString() + "\n";
            }
        }
        return cadena;
    }

    // Método para eliminar un producto por su nombre
    public boolean eliminarProducto(String nombreProducto) {
        for (Producto producto : listaProductos) {
            if (producto.getNomProducto().equalsIgnoreCase(nombreProducto)) {
                listaProductos.remove(producto);
                return true;
            }
        }
        return false; // Devuelve false si el producto no se encuentra
    }

    // Método para modificar el precio de un producto por su nombre
    public boolean modificarPrecio(String nombreProducto, double nuevoPrecio) {
        for (Producto producto : listaProductos) {
            if (producto.getNomProducto().equalsIgnoreCase(nombreProducto)) {
                producto.setPrecio(nuevoPrecio);
                return true;
            }
        }
        return false; // Devuelve false si el producto no se encuentra
    }

    // Método para buscar productos por su sección
    public List<Producto> buscarPorSeccion(String seccion) {
        List<Producto> productosEncontrados = new ArrayList<>();
        for (Producto producto : listaProductos) {
            if (producto.getSeccion().equalsIgnoreCase(seccion)) {
                productosEncontrados.add(producto);
            }
        }
        return productosEncontrados;
    }
}
