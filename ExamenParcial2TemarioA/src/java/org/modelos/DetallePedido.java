
package org.modelos;


public class DetallePedido {
    private int idDetallePedido;
    private int idPedido;
    private int idProducto;
    private String Cantidad;
    private String Precio;
    private String Total;
    private String Observ;
    private String Pedido;
    private String Producto;

    public DetallePedido() {
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCantidad() {
        return Cantidad;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getObserv() {
        return Observ;
    }

    public void setObserv(String Observ) {
        this.Observ = Observ;
    }

    public String getPedido() {
        return Pedido;
    }

    public void setPedido(String Pedido) {
        this.Pedido = Pedido;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }
    
    
}
