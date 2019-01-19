package appLayer;

import dataLayer.DatabaseUser;

public class User {
    public boolean isValidUserCredentials(String userName, String userPassword){

        DatabaseUser dbUser = new DatabaseUser();
        return dbUser.isValidUserLogin(userName, userPassword);
    }
}
