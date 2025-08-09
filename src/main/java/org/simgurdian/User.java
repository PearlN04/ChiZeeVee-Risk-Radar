package org.simgurdian;


public class User {


        private String phoneNumber;
        private String lastIccid;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastIccid(){
        return lastIccid;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setLastIccid(String lastIccid) {
        this.lastIccid = lastIccid;
    }
}

