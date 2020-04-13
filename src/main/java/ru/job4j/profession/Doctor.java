package ru.job4j.profession;

public class Doctor extends Profession {

    String diagnose;
    String pacient;

    public Doctor(String diagnose, String pacient) {
        this.diagnose = diagnose;
        this.pacient = pacient;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public Doctor setDiagnose(String diagnose) {
        return this;
    }
}