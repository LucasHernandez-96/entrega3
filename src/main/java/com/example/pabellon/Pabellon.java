package com.example.pabellon;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pabellones")
public class Pabellon {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
    private int sala;
    private String descripcion;
    private String estado;
 
    public Pabellon() {
  
    }
 
    public Pabellon(int sala, String descripcion,String estado) {
         this.sala = sala;
         this.descripcion = descripcion;
         this.estado = estado;
    }
 
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "sala", nullable = false)
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
 
    @Column(name = "descripcion", nullable = false)
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    @Column(name = "estado", nullable = false)
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pabellon [id=" + id + ", sala=" + sala + ", descripcion=" + descripcion + ", estado=" + estado
       + "]";
    }
 
}