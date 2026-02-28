import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of a Human Resources employee with recruitment and onboarding
 * duties.
 */
public class HumanResources implements EmployeeInterface {
    private String id;
    private String name;
    private double monthlySalary;
    private List<String> pendingRecruitments;

    public HumanResources(String id, String name, double monthlySalary) {
        this.id = id;
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.pendingRecruitments = new ArrayList<>();
    }

    public void addCandidate(String candidateName) {
        pendingRecruitments.add(candidateName);
        System.out.println("Candidate " + candidateName + " added to recruitment pipeline.");
    }

    public void onboardCandidate(String candidateName) {
        if (pendingRecruitments.remove(candidateName)) {
            System.out.println("Onboarding complete for " + candidateName + ".");
        } else {
            System.out.println("Candidate not found in pending list.");
        }
    }

    @Override
    public double calculatePay() {
        return monthlySalary;
    }

    @Override
    public String getDetails() {
        return "HumanResources [ID=" + id + ", Name=" + name + ", PendingRecruitments=" + pendingRecruitments.size()
                + "]";
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is conducting interviews and managing employee relations.");
    }

    @Override
    public String getEmployeeId() {
        return id;
    }

    public static void main(String[] args) {
        HumanResources hr = new HumanResources("HR-001", "Emma Caring", 6500.0);
        hr.addCandidate("Alice Blue");
        hr.addCandidate("Charlie Brown");
        System.out.println(hr.getDetails());
        hr.onboardCandidate("Alice Blue");
        System.out.println(hr.getDetails());
        hr.performDuty();
    }
}
