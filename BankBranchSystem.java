import java.util.HashMap;
import java.util.Map;

/**
 * Manages bank branch distribution and IFSC (Indian Financial System Code)
 * mappings.
 */
public class BankBranchSystem {
    private Map<String, String> branchDb = new HashMap<>();

    public BankBranchSystem() {
        // Mock branch data
        branchDb.put("NY-CENTRAL-001", "HSBC000101");
        branchDb.put("LON-NORTH-002", "BARC000202");
        branchDb.put("DEL-SOUTH-003", "HDFC000303");
        branchDb.put("MUM-EAST-004", "ICIC000404");
    }

    public void lookupBranch(String branchId) {
        System.out.println("Looking up details for Branch: " + branchId);
        if (branchDb.containsKey(branchId)) {
            System.out.println("Result: Branch Found.");
            System.out.println("IFSC Code: " + branchDb.get(branchId));
        } else {
            System.out.println("Result: Branch not found in master database.");
        }
    }

    public void addNewBranch(String branchId, String ifsc) {
        branchDb.put(branchId, ifsc);
        System.out.println("New branch registered: " + branchId + " [IFSC: " + ifsc + "]");
    }

    public void displayAllBranches() {
        System.out.println("\n--- GLOBAL BANK BRANCH NETWORK ---");
        System.out.printf("%-20s | %-12s\n", "Branch ID", "IFSC Code");
        System.out.println("----------------------------------------");
        for (Map.Entry<String, String> entry : branchDb.entrySet()) {
            System.out.printf("%-20s | %-12s\n", entry.getKey(), entry.getValue());
        }
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {
        BankBranchSystem bbs = new BankBranchSystem();

        System.out.println("--- Bank Network Management Simulation ---");
        bbs.lookupBranch("DEL-SOUTH-003");
        bbs.lookupBranch("SIN-WEST-999"); // Fail case

        bbs.addNewBranch("BLR-CORE-005", "SBIN005566");
        bbs.displayAllBranches();
    }
}
