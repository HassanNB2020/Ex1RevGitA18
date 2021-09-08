/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author User
 */
public class Cours {
    private String codeCours;
    private String nomCours;
    private String Salle;

    public Cours(String codeCours, String nomCours, String Salle) {
        this.codeCours = codeCours;
        this.nomCours = nomCours;
        this.Salle = Salle;
    }

    public String getCodeCours() {
        return codeCours;
    }

    public void setCodeCours(String codeCours) {
        this.codeCours = codeCours;
    }

    public String getNomCours() {
        return nomCours;
    }

    public void setNomCours(String nomCours) {
        this.nomCours = nomCours;
    }

    public String getSalle() {
        return Salle;
    }

    public void setSalle(String Salle) {
        this.Salle = Salle;
    }

    @Override
    public String toString() {
        return "Cours{" + "codeCours=" + codeCours + ", nomCours=" + nomCours + ", Salle=" + Salle + '}';
    }
    
}
