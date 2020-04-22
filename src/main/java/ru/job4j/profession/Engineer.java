package ru.job4j.profession;

public class Engineer extends Profession {

    String project;
    String designing;
    String construction;

    public String getDesigning() {
        return designing;
    }

    public void setDesigning(String designing) {
        this.designing = designing;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    public Engineer(String project, String designing, String construction) {
        this.project = project;
        this.designing = designing;
        this.construction = construction;
    }
}
