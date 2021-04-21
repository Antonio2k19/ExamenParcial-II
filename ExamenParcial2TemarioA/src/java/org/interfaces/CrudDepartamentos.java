
package org.interfaces;

import java.util.List;
import org.modelos.Departamentos;


public interface CrudDepartamentos {
    public List listar();
    public Departamentos list(int id);
    public boolean insertar(Departamentos departamento);
    public boolean modificar(Departamentos departamento);
    public boolean eliminar(Departamentos departamento);
    public List busqueda(String parametro, String opcion);
}
