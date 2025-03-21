package ru.juliaM.SpringSecurityApp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoderTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String juliaPassword = encoder.encode("123");
        String adminPassword = encoder.encode("jhjyg");

        System.out.println("Хеш для пользователя john: " + juliaPassword);
        System.out.println("Хеш для администратора admin: " + adminPassword);
    }
}