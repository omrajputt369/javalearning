import java.util.ArrayList;
import java.util.List;

/**
 * Manages the beneficiaries (payees) for a bank account.
 */
public class BeneficiaryManagement {

    private String userAccount;
    private List<String> beneficiaries = new ArrayList<>();

    public BeneficiaryManagement(String userAccount) {
        this.userAccount = userAccount;
    }

    public void addBeneficiary(String name, String accountNumber) {
        String record = name + " (" + accountNumber + ")";
        if (!beneficiaries.contains(record)) {
            beneficiaries.add(record);
            System.out.println("Beneficiary added: " + record);
        } else {
            System.out.println("Duplicate Record: " + record + " is already in the list.");
        }
    }

    public void removeBeneficiary(String accountNumber) {
        beneficiaries.removeIf(b -> b.contains(accountNumber));
        System.out.println("Beneficiary with account " + accountNumber + " removed.");
    }

    public void displayBeneficiaries() {
        System.out.println("\n--- Beneficiary List for " + userAccount + " ---");
        if (beneficiaries.isEmpty()) {
            System.out.println("No beneficiaries found.");
        } else {
            for (int i = 0; i < beneficiaries.size(); i++) {
                System.out.println((i + 1) + ". " + beneficiaries.get(i));
            }
        }
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        BeneficiaryManagement bm = new BeneficiaryManagement("ACC-OM-101");

        System.out.println("--- Bank Payee Management Simulation ---");
        bm.addBeneficiary("John Doe", "6677889900");
        bm.addBeneficiary("Jane Smith", "1122334455");
        bm.addBeneficiary("John Doe", "6677889900"); // Duplicate test

        bm.displayBeneficiaries();
        bm.removeBeneficiary("1122334455");
        bm.displayBeneficiaries();
    }
}
