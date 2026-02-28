import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of an intern with stipend-based pay and learning goals.
 */
public class Intern implements EmployeeInterface {
    private String id;
    private String name;
    private double monthlyStipend;
    private List<String> learningObjectives;

    public Intern(String id, String name, double monthlyStipend) {
        this.id = id;
        this.name = name;
        this.monthlyStipend = monthlyStipend;
        this.learningObjectives = new ArrayList<>();
    }

    public void addObjective(String objective) {
        learningObjectives.add(objective);
    }

    @Override
    public double calculatePay() {
        return monthlyStipend;
    }

    @Override
    public String getDetails() {
        return "Intern [ID=" + id + ", Name=" + name + ", Stipend=$" + monthlyStipend + ", Objectives="
                + learningObjectives.size() + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is learning and assisting in various tasks.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        Intern emp = new Intern("INT-001", "Bob Junior", 1500.0);
        emp.addObjective("Understand Java Basics");
        emp.addObjective("Assist in Testing");
        System.out.println(emp.getDetails());
        System.out.println("Monthly Stipend: $" + emp.calculatePay());
        emp.performDuty();
    }
}
