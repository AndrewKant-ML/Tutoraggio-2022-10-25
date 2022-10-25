package org.codeclub.model;

import java.util.List;

public class Autore {

    private String nome;
    private String cognome;
    private List<Pubblicazione> pubblicazioni;

    public Autore(String nome, String cognome, List<Pubblicazione> pubblicazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.pubblicazioni = pubblicazioni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public List<Pubblicazione> getPubblicazioni() {
        return pubblicazioni;
    }

    public void setPubblicazioni(List<Pubblicazione> pubblicazioni) {
        this.pubblicazioni = pubblicazioni;
    }
}
