/**
 * Simulates the KYC (Know Your Customer) verification process for banking.
 */
public class KycVerificationSystem {

    public enum DocumentType {
        AADHAR, PAN, PASSPORT, DRIVING_LICENSE
    }

    /**
     * Verifies a document based on simple regex patterns.
     * 
     * @param type      The type of document.
     * @param docNumber The document number to verify.
     * @return true if valid, false otherwise.
     */
    public boolean verifyDocument(DocumentType type, String docNumber) {
        System.out.println("Verifying " + type + " document: " + docNumber + "...");

        switch (type) {
            case AADHAR:
                return docNumber.matches("\\d{12}"); // 12 digits
            case PAN:
                return docNumber.matches("[A-Z]{5}\\d{4}[A-Z]{1}"); // ABCDE1234F
            case PASSPORT:
                return docNumber.matches("[A-Z]{1}\\d{7}"); // A1234567
            default:
                return false;
        }
    }

    public void processKycStatus(boolean isDocValid) {
        if (isDocValid) {
            System.out.println("KYC Status: VERIFIED. Account is now active.");
        } else {
            System.out.println("KYC Status: REJECTED. Please provide valid documents.");
        }
    }

    public static void main(String[] args) {
        KycVerificationSystem kyc = new KycVerificationSystem();

        System.out.println("--- Bank KYC Verification System ---");

        boolean res1 = kyc.verifyDocument(DocumentType.AADHAR, "123456789012");
        kyc.processKycStatus(res1);

        boolean res2 = kyc.verifyDocument(DocumentType.PAN, "ABCDE1234F");
        kyc.processKycStatus(res2);

        boolean res3 = kyc.verifyDocument(DocumentType.PASSPORT, "12345"); // Invalid
        kyc.processKycStatus(res3);
    }
}
