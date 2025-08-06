package com.thekingtiger.backend.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="Productos")
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProductos")
    private Integer idProductos;

    @Column(length = 45, nullable = false)
    private String nombreProducto;

    @Column(nullable = false)
    private Integer precioProducto;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Integer idCategoria;

    @Column(nullable = false)
    private Integer descuento;

    @Column(length = 100, nullable = false)
    private String descripcionProducto;

    //Generamos un constructor vacio para JPA, clase de Java POJO
    public Productos() {

    }
        //Constructor
    public Productos(Integer idProductos, String nombreProducto, Integer precioProducto, Integer stock, Integer idCategoria, Integer descuento, String descripcionProducto) {
        this.idProductos = idProductos;
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
        this.stock = stock;
        this.idCategoria = idCategoria;
        this.descuento = descuento;
        this.descripcionProducto = descripcionProducto;
    }

    //getters and setters
    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(Integer precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getDescuento() {
        return descuento;
    }

    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }

    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }
    //toString()
    @Override
    public String toString() {
        return "Productos{" +
                "idProductos=" + idProductos +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", stock=" + stock +
                ", idCategoria=" + idCategoria +
                ", descuento=" + descuento +
                ", descripcionProducto='" + descripcionProducto + '\'' +
                '}';
    }

    //equals and hashcode
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Productos productos)) return false;
        return Objects.equals(idProductos, productos.idProductos) && Objects.equals(nombreProducto, productos.nombreProducto) && Objects.equals(precioProducto, productos.precioProducto) && Objects.equals(stock, productos.stock) && Objects.equals(idCategoria, productos.idCategoria) && Objects.equals(descuento, productos.descuento) && Objects.equals(descripcionProducto, productos.descripcionProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProductos, nombreProducto, precioProducto, stock, idCategoria, descuento, descripcionProducto);
    }
    //...............
    //Relacion de Productos con categorias N:1
    // .................
    @ManyToOne
    @JoinColumn(name="productos_id_categorias")
    private Categorias categorias;

    public Categorias getCategorias() {
        return categorias;
    }

    public void setCategorias(Categorias categorias) {
        this.categorias = categorias;
    }
}
