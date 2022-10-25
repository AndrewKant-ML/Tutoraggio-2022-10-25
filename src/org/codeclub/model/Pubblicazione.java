package org.codeclub.model;

import java.time.Year;
import java.util.List;

public abstract class Pubblicazione {

    private String titolo;
    private Year annoPubblicazione;
    private List<Autore> autori;
    private Integer paginaInizio;
    private Integer paginaFine;

    public Pubblicazione(String titolo, Year annoPubblicazione, List<Autore> autori, Integer paginaInizio, Integer paginaFine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.autori = autori;
        this.paginaInizio = paginaInizio;
        this.paginaFine = paginaFine;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Year getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(Year annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public List<Autore> getAutori() {
        return autori;
    }

    public void setAutori(List<Autore> autori) {
        this.autori = autori;
    }

    public Integer getPaginaInizio() {
        return paginaInizio;
    }

    public void setPaginaInizio(Integer paginaInizio) {
        this.paginaInizio = paginaInizio;
    }

    public Integer getPaginaFine() {
        return paginaFine;
    }

    public void setPaginaFine(Integer paginaFine) {
        this.paginaFine = paginaFine;
    }
}
