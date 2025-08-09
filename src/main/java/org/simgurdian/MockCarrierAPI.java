package org.simgurdian;

import java.util.Map;

public class MockCarrierAPI {

        // Simulate a database of phone numbers and their SIM ICCIDs
        private static final Map<String, String> simDatabase = Map.of(
                "+27731234567", "89450421180216254895", // Your SIM
                "+27739876543", "89450421180216254321"  // Fraudster's SIM
        );

        //A network company's API checking SIM ICCID
        public static String getCurrentIccid(String phoneNumber) {
            return simDatabase.get(phoneNumber); // Returns null if number not found
        }

}
