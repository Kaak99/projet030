package com.example.kaak.projet030.model;

public class Humeur {
    private int laDate;
    private int humeurDuJour;
    private String commentaireDuJour;

    public Humeur(laDate,humeurDuJour,commentaireDuJour) {
        this.laDate=laDate;
        this.humeurDuJour=humeurDuJour;
        this.commentaireDuJour=commentaireDuJour;

    }

    @Override
    public String toString() {
        return "Humeur [ " +
                "date='" + laDate + '\'' +
                ", humeur du jour='" + humeurDuJour + '\'' +
                ", commentaire du jour='" + commentaireDuJour + '\'' +
                ']';
    }
}
