package com.diego.everis.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "COB_GESTOR", schema = "GCCOBRANZAS")
public class Gestor {
    @Id
    @Column(name = "USUARIO_ID")
    private String usuarioId;

    @Column(name = "PRIMER_NOMBRE")
    private String primerNombre;

    @Column(name = "SEGUNDO_NOMBRE")
    private String segundoNombre;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "SEGUNDO_APELLIDO")
    private String segundoApellido;

    @Column(name = "TARJETA_PROFESIONAL")
    private String tarjetaProfesional;

    @Column(name = "DIRECCION")
    private String direccion;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "CORREO_ELECTRONICO")
    private String correoElectronico;

    @Column(name = "APROBADOR_ID")
    private String aprobadorId;

    @Column(name = "DIRECTOR_ID")
    private String directorId;

    @Column(name = "ACTIVO")
    private String activo;

    @Column(name = "USUARIO_CREACION")
    private String usuarioCreacion;

    @Column(name = "FECHA_CREACION")
    private Date fechaCreacion;

    @Column(name = "USUARIO_ULTIMA_MODIFICACION")
    private String usuarioUltimaModificacion;

    @Column(name = "FECHA_ULTIMA_MODIFICACION")
    private Date fechaUltimaModificacion;

    @Column(name = "ROL_CAT")
    private String rolCat;

    @Column(name = "NIVEL_JERARQUIA_CAT")
    private String nivelJerarquiaCat;

    @Column(name = "LUGAR_EXPEDICION_ID")
    private Integer lugarExpedicionId;

    @Column(name = "TIPO_IDENTIFICACION")
    private String tipoIdentificacion;

    @Column(name = "NUMERO_IDENTIFICACION")
    private String numeroIdentificacion;

    @Column(name = "CIUDAD_ID")
    private Integer ciudadId;

    @Column(name = "DEPARTAMENTO_ID")
    private Integer departamentoId;

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(String tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getAprobadorId() {
        return aprobadorId;
    }

    public void setAprobadorId(String aprobadorId) {
        this.aprobadorId = aprobadorId;
    }

    public String getDirectorId() {
        return directorId;
    }

    public void setDirectorId(String directorId) {
        this.directorId = directorId;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getUsuarioCreacion() {
        return usuarioCreacion;
    }

    public void setUsuarioCreacion(String usuarioCreacion) {
        this.usuarioCreacion = usuarioCreacion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getUsuarioUltimaModificacion() {
        return usuarioUltimaModificacion;
    }

    public void setUsuarioUltimaModificacion(String usuarioUltimaModificacion) {
        this.usuarioUltimaModificacion = usuarioUltimaModificacion;
    }

    public Date getFechaUltimaModificacion() {
        return fechaUltimaModificacion;
    }

    public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
        this.fechaUltimaModificacion = fechaUltimaModificacion;
    }

    public String getRolCat() {
        return rolCat;
    }

    public void setRolCat(String rolCat) {
        this.rolCat = rolCat;
    }

    public String getNivelJerarquiaCat() {
        return nivelJerarquiaCat;
    }

    public void setNivelJerarquiaCat(String nivelJerarquiaCat) {
        this.nivelJerarquiaCat = nivelJerarquiaCat;
    }

    public Integer getLugarExpedicionId() {
        return lugarExpedicionId;
    }

    public void setLugarExpedicionId(Integer lugarExpedicionId) {
        this.lugarExpedicionId = lugarExpedicionId;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public Integer getCiudadId() {
        return ciudadId;
    }

    public void setCiudadId(Integer ciudadId) {
        this.ciudadId = ciudadId;
    }

    public Integer getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Integer departamentoId) {
        this.departamentoId = departamentoId;
    }
}
