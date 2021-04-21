
package org.interfaces;

import java.util.List;
import org.modelos.Clientes;


public interface CrudClientes {
    public List listar();
    public Clientes list(int id);
    public boolean insertar(Clientes cliente);
    public boolean modificar(Clientes cliente);
    public boolean eliminar(Clientes cliente);
    public List busqueda(String parametro, String opcion);
}
