package model;

public class Department {
    public int departmentId;
    public String name;
    public String description;

    public Volunteer coordinator;

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Volunteer getCoordinator() {
        return coordinator;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCoordinator(Volunteer coordinator) {
        this.coordinator = coordinator;
    }

    public Department(int departmentId, String name, String description, Volunteer coordinator) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
        this.coordinator = coordinator;
    }
}
