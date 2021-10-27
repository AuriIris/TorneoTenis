/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDate;

/**
 *
 * @author martinbordon
 */
public class Patrocinio {
    private int idPatrocinio;
    private Sponsor Patrocinador;
    private Jugador Jugador;
    private LocalDate fechaInicioContrato;
    private LocalDate fechaFinContrato;
    private boolean activo;

    public int getIdPatrocinio() {
        return idPatrocinio;
    }

    public void setIdPatrocinio(int idPatrocinio) {
        this.idPatrocinio = idPatrocinio;
    }

    public Sponsor getPatrocinador() {
        return Patrocinador;
    }

    public void setPatrocinador(Sponsor Patrocinador) {
        this.Patrocinador = Patrocinador;
    }

    public Jugador getJugador() {
        return Jugador;
    }

    public void setJugador(Jugador Jugador) {
        this.Jugador = Jugador;
    }

    public LocalDate getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public LocalDate getFechaFinContrato() {
        return fechaFinContrato;
    }

    public void setFechaFinContrato(LocalDate fechaFinContrato) {
        this.fechaFinContrato = fechaFinContrato;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Patrocinio() {
    }

    public Patrocinio(Sponsor Patrocinador, Jugador Jugador, LocalDate fechaInicioContrato, LocalDate fechaFinContrato, boolean activo) {
        this.Patrocinador = Patrocinador;
        this.Jugador = Jugador;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.activo = activo;
    }

    public Patrocinio(int idPatrocinio, Sponsor Patrocinador, Jugador Jugador, LocalDate fechaInicioContrato, LocalDate fechaFinContrato, boolean activo) {
        this.idPatrocinio = idPatrocinio;
        this.Patrocinador = Patrocinador;
        this.Jugador = Jugador;
        this.fechaInicioContrato = fechaInicioContrato;
        this.fechaFinContrato = fechaFinContrato;
        this.activo = activo;
    }


    
    
}

