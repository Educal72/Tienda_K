
package com.tienda;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Encriptar {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        var claveJuan = encoder.encode("123");
        var claveRebeca = encoder.encode("456");
        var clavePedro = encoder.encode("789");
        System.out.println(claveJuan);
        System.out.println(claveRebeca);
        System.out.println(clavePedro);
                
    }
    
}
