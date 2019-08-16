package com.example.aliakbar.biodata.presenter;

//minggu,11 Agustus 2019,10116175,Ali Akbar,AKB4/if4

public interface IRegisterActivity {

    void checkInputan();
    boolean cekPassword(String Password, String confirmPassword);
    boolean cekUser(String Username);

}
