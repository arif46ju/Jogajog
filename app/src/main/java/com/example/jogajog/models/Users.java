package com.example.jogajog.models;

public class Users {
    String profilepic,userId,mail,password,userName,lastMessage;

    public Users(String profilepic, String userId, String mail, String password, String lastMessage) {
        this.profilepic = profilepic;
        this.userId = userId;
        this.mail = mail;
        this.password = password;
        this.lastMessage = lastMessage;

    }
    public Users(){}

    //Signup

    public Users( String userName,String mail, String password) {
        this.userName=userName;
        this.mail = mail;
        this.password = password;

    }

    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

}
