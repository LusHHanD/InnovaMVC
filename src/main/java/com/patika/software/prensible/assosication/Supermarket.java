package com.patika.software.prensible.assosication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

// 1 Müşteri olmadan da ayakta durur.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class Supermarket {
    private String supermarketAdi;
    private String supermarketSehir;

}
