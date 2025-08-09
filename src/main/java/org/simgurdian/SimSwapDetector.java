package org.simgurdian;

public class SimSwapDetector {
    public static void main(String[] args) {
        String yourPhone = "+27731234567";
        String storedIccid = "89450421180216254895"; // real SIM ICCID

        String currentIccid = MockCarrierAPI.getCurrentIccid(yourPhone);

        if (currentIccid == null) {
            System.out.println("Phone number not found in carrier database!");
        } else if (!currentIccid.equals(storedIccid)) {
            System.out.println("ALERT: SIM SWAP DETECTED! New ICCID: " + currentIccid);
        } else {
            System.out.println("No SIM swap detected.");
        }
    }
}
