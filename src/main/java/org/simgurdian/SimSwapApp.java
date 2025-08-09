package org.simgurdian;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
    @SpringBootApplication
    public class SimSwapApp implements CommandLineRunner {
        @Autowired
        private UserRepository userRepo;

        public static void main(String[] args) {
            SpringApplication.run(SimSwapApp.class, args);
        }

        @Override
        public void run(String... args) {
            // Check for swaps on startup
            String phoneNo = "+27731234567";
            User user = userRepo.findById(phoneNo).orElseThrow();
            String currentIccid = MockCarrierAPI.getCurrentIccid(user.getPhoneNumber());

            if (!currentIccid.equals(user.getLastIccid())) {
                //SmsSender.sendSms(user.getPhoneNumber(), "SIM SWAP DETECTED!");
            }
        }
    }