package com.thekingtiger.backend.model;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Clientes")
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idClientes")
    private Integer id;

    @Column(length = 45, nullable = false)
    private String nombreCliente;

    @Column(length = 45, nullable = false)
    private String apellidoCliente;

    @Column(length = 45, nullable = false, unique = true)
    private String correoCliente;

    @Column(length = 45, nullable = false)
    private String direccionCliente;

    @Column(length = 45, nullable = false)
    private String telefonoCliente;

    @Column(length = 45, nullable = false)
    private String contraseniaCliente;


    public Clientes(){

    }

    public Clientes(Integer id, String nombreCliente, String apellidoCliente, String correoCliente, String direccionCliente, String telefonoCliente, String contraseniaCliente) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.correoCliente = correoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.contraseniaCliente = contraseniaCliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getContraseniaCliente() {
        return contraseniaCliente;
    }

    public void setContraseniaCliente(String contraseniaCliente) {
        this.contraseniaCliente = contraseniaCliente;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", apellidoCliente='" + apellidoCliente + '\'' +
                ", correoCliente='" + correoCliente + '\'' +
                ", direccionCliente='" + direccionCliente + '\'' +
                ", telefonoCliente='" + telefonoCliente + '\'' +
                ", contraseniaCliente='" + contraseniaCliente + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Clientes clientes)) return false;
        return Objects.equals(id, clientes.id) && Objects.equals(nombreCliente, clientes.nombreCliente) && Objects.equals(apellidoCliente, clientes.apellidoCliente) && Objects.equals(correoCliente, clientes.correoCliente) && Objects.equals(direccionCliente, clientes.direccionCliente) && Objects.equals(telefonoCliente, clientes.telefonoCliente) && Objects.equals(contraseniaCliente, clientes.contraseniaCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreCliente, apellidoCliente, correoCliente, direccionCliente, telefonoCliente, contraseniaCliente);
    }
}
