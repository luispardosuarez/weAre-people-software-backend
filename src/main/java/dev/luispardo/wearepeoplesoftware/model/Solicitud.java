package dev.luispardo.wearepeoplesoftware.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Solicitudes")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String caracteristicas;
    @Column(nullable = false)
    private String responsabilidades;
    @Column(nullable = false)
    private String requisitos;

    @Lob
    private Byte[] pruebaTecnica;  // Considera almacenar solo la referencia del archivo

    @Column(nullable = false)
    private boolean estadoAprobacion;
    @Column(nullable = false)
    private boolean estadoPublicacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public Byte[] getPruebaTecnica() {
        return pruebaTecnica;
    }

    public void setPruebaTecnica(Byte[] pruebaTecnica) {
        this.pruebaTecnica = pruebaTecnica;
    }

    public boolean isEstadoAprobacion() {
        return estadoAprobacion;
    }

    public void setEstadoAprobacion(boolean estadoAprobacion) {
        this.estadoAprobacion = estadoAprobacion;
    }

    public boolean isEstadoPublicacion() {
        return estadoPublicacion;
    }

    public void setEstadoPublicacion(boolean estadoPublicacion) {
        this.estadoPublicacion = estadoPublicacion;
    }
}
