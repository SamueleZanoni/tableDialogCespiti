package itisCuneo.backend;

import java.time.LocalDate;


public class Cespiti {

    private static final String SEPARATOR = ",";

    private int codice;
    private int quantita;
    private LocalDate dataAcquisto;

    public Cespiti(int codice, int quantita, LocalDate dataAcquisto) {
        this.codice = codice;
        this.quantita = quantita;
        this.dataAcquisto = dataAcquisto;
    }

    @Override
    public String toString() {
        return "CespitiFile{" +
                "codice=" + codice +
                ", quantita=" + quantita +
                ", dataAcquisto=" + dataAcquisto +
                '}';
    }

    public String toCsv() {
        return codice +SEPARATOR+ quantita+ SEPARATOR+ dataAcquisto;
    }
}