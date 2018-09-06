package com.example.kaak.projet030.model;

public class Humeur {
    private long laDate;
    private int humeurDuJour;
    private String commentaireDuJour;

    public Humeur(long laDate, int humeurDuJour, String commentaireDuJour) {
        this.laDate = laDate;
        this.humeurDuJour = humeurDuJour;
        this.commentaireDuJour = commentaireDuJour;

    }


    public long getLaDate() {
        return laDate;
    }

    public void setLaDate(long laDate) {
        this.laDate = laDate;
    }

    public int getHumeurDuJour() {
        return humeurDuJour;
    }

    public void setHumeurDuJour(int humeurDuJour) {
        this.humeurDuJour = humeurDuJour;
    }

    public String getCommentaireDuJour() {
        return commentaireDuJour;
    }

    public void setCommentaireDuJour(String commentaireDuJour) {
        this.commentaireDuJour = commentaireDuJour;
    }

    @Override
    public String toString() {
        return "Humeur [ " +
                "date='" + laDate + '\'' +
                ", humeur du jour='" + humeurDuJour + '\'' +
                ", commentaire du jour='" + commentaireDuJour + '\'' +
                ']';
    }

    /*{
        nom: 'Martin',
        date: '12/12/12',
        adresse: {
            rue: 'Rue de la lyre',
            ville: 'Paris'
        }
        profession: ''
    }*/
}
