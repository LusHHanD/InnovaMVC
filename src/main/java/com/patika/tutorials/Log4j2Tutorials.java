package com.patika.tutorials;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@Builder
@Log4j2
public class Log4j2Tutorials {

        private String adi;
        private String soyadi;
        private String numarasi;

        public Log4j2Tutorials(){
            this.adi="Adınızı girmediniz";
            this.soyadi="Soyadınızı girmediniz";
            this.numarasi="Numaranızı girmediniz";
        }

        // Shift + F6 = Refactor
        // Alt + Insert = getter setter...
        // Ctrl + Shift + O = Maven Install
    public static void main(String[] args) {
        Log4j2Tutorials tutorials=new Log4j2Tutorials();
        System.out.println(tutorials);

        if (tutorials.getAdi().equals("Adınızı girmediniz")){
            log.error("Hata adınızı girmediniz!");
        }else{
            log.info("Bilgiler girildi.");
        }

    }
}
