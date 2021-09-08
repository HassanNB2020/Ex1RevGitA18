/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Zaki
 */
public class Examen {
    private String examTheorique;
    private String examPratique;

    public Examen() {
    }

    public Examen(String examTheorique, String examPratique) {
        this.examTheorique = examTheorique;
        this.examPratique = examPratique;
    }

    public String getExamTheorique() {
        return examTheorique;
    }

    public void setExamTheorique(String examTheorique) {
        this.examTheorique = examTheorique;
    }

    public String getExamPratique() {
        return examPratique;
    }

    public void setExamPratique(String examPratique) {
        this.examPratique = examPratique;
    }

    @Override
    public String toString() {
        return "Examen{" + "examTheorique=" + examTheorique + ", examPratique=" + examPratique + '}';
    }
    
    
    
}
