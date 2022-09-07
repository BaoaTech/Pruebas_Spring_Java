package com.Udea.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table(name="MovimientoDinero")
public class MovimiendoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private long monto;
    private String concepto;


    @ManyToOne
    @JoinColumn(name = "empleado_id")
    private Empleado usuario;

    public MovimiendoDinero() {
    }

    public MovimiendoDinero(long monto, String concepto, Empleado empleado) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuario = empleado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getMonto() {
        return monto;
    }

    public void setMonto(long monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Empleado getUsuario() {
        return usuario;
    }

    public void setUsuario(Empleado usuario) {
        this.usuario = usuario;
    }


}
