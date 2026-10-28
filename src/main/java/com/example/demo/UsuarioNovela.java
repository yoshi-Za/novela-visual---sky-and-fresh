package com.example.demo;

import java.util.UUID;

public class UsuarioNovela {

    private String id;
    private String nombreUsuario;
    private String email;
    private String personajeFavorito;
    private String rutaActual;
    private int capitulosCompletados;
    private boolean partidaGuardada;

    public Usuario() {
        this.id = UUID.randomUUID().toString();
        this.capitulosCompletados = 0;
        this.partidaGuardada = false;
        this.rutaActual = "Sin comenzar";
    }

    public Usuario(String nombreUsuario, String email) {
        this.id = UUID.randomUUID().toString();
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.personajeFavorito = "Sin elegir";
        this.rutaActual = "Sin comenzar";
        this.capitulosCompletados = 0;
        this.partidaGuardada = false;
    }

    public String getId() {
        return id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPersonajeFavorito() {
        return personajeFavorito;
    }

    public void setPersonajeFavorito(String personajeFavorito) {
        this.personajeFavorito = personajeFavorito;
    }

    public String getRutaActual() {
        return rutaActual;
    }

    public void setRutaActual(String rutaActual) {
        this.rutaActual = rutaActual;
    }

    public int getCapitulosCompletados() {
        return capitulosCompletados;
    }

    public void setCapitulosCompletados(int capitulosCompletados) {
        this.capitulosCompletados = capitulosCompletados;
    }

    public boolean isPartidaGuardada() {
        return partidaGuardada;
    }

    public void setPartidaGuardada(boolean partidaGuardada) {
        this.partidaGuardada = partidaGuardada;
    }
}
