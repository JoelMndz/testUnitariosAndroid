package com.example.practicaexpresso;

public class Validations {
    public boolean emailValid(String email){
        if(email.toLowerCase().indexOf("@gmail.com") != -1){
            return true;
        }
        return false;
    }

    public boolean isEmpy(String text){
        if (text.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean passwordValid(String password){
        if (password.length() >= 8){
            return true;
        }
        return false;
    }
}
