package com.RegistrationFormProject.REGISTRATION.FORM.Entities;


public class Userdata {

    public String userName;
    public String userEmail;

    public Userdata(String userName, String userEmail) {
        this.userName = userName;
        this.userEmail = userEmail;
    }




    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "Userdata{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
