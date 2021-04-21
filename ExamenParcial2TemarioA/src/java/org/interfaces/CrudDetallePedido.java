
package org.interfaces;

import java.util.List;
import org.modelos.DetallePedido;

public interface CrudDetallePedido {
    public List listar();
    public DetallePedido list(int id);
    public boolean insertar(DetallePedido detalle);
    public boolean modificar(DetallePedido detalle);
    public boolean eliminar(DetallePedido detalle);
    public List busqueda(String parametro, String opcion);
}
