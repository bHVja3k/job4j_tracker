package ru.job4j.profession;

public class Doctor extends Profession {

    String diagnose;
    String analysis;
    String inspection;

    public String getAnalysis() {
        return analysis;
    }

    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    public String getInspection() {
        return inspection;
    }

    public void setInspection(String inspection) {
        this.inspection = inspection;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public Doctor setDiagnose(String diagnose) {
        return this;
    }

    public Doctor(String diagnose, String analysis, String inspection) {
        this.diagnose = diagnose;
        this.analysis = analysis;
        this.inspection = inspection;
    }
}