package org.kenny.design.principle.singleresponsibilty;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "kenny";
        address = "Hong Kong";
    }
    private void updateUserInfo(String userName, String... properties) {
        userName = "kenny";
    }

    private void updateUserName(String userName) {
        userName = "kenny";
    }

    private void updateUserAddress(String address) {
        address = "Hong Kong";
    }

    // should not work like below
    private void updateUserInfo(String userName, String address, boolean bool) {
        if (bool) {
            //todo something1
        } else {
            //todo something2
        }
        userName = "kenny";
        address = "Hong Kong";
    }

}
