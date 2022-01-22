package com.patika.tutorials;

import lombok.*;

// @Data // gettersetter+hashcode+toString
@NoArgsConstructor // parametresiz constructor
@AllArgsConstructor // Parametreli constructor

public class LombokTutorials {

    @Getter @Setter
    private String adi;

    @Getter @Setter
    private String soyadi;

    @Getter @Setter
    private String numarasi;

    @Override
    public String toString() {
        return "LombokTutorials{" +
                "adi='" + adi + '\'' +
                ", soyadi='" + soyadi + '\'' +
                ", numarasi='" + numarasi + '\'' +
                '}';
    }
}
