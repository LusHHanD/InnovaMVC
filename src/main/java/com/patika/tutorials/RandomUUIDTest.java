package com.patika.tutorials;

import java.util.UUID;

public class RandomUUIDTest {

    public static void main(String[] args) {
        // 32 Karakter şifreleme
        // Hexadecimal
        UUID uuid= UUID.randomUUID();
        System.out.println(uuid);
    }
}
