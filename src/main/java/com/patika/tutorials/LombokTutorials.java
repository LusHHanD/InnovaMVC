package com.patika.tutorials;

import lombok.*;

// @Data // gettersetter+hashcode+toString
@NoArgsConstructor // parametresiz constructor
@AllArgsConstructor // Parametreli constructor
@Builder
public class LombokTutorials {

   // @Getter @Setter
    private String adi;
    private String soyadi;
    private String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LombokTutorials tutorials=LombokTutorials.builder()
                .adi("Berkan")
                .soyadi("Gürel")
                .numarasi("123")
                .build();
    }
}
