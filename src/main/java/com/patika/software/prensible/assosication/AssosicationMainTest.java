package com.patika.software.prensible.assosication;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AssosicationMainTest {
    public static void main(String[] args) {
        Musteri musteri=Musteri.builder().musteriAdi("Berkan").musteriSehir("Ankara").build();

        Supermarket supermarket=Supermarket.builder().supermarketAdi("ABC Market").supermarketSehir("Ankara").build();

        // loose coupling (zayıf bağlantı) == > Assosication
        log.info("Müşteri adı "+musteri.getMusteriAdi()+" Süpermarket adı: "+supermarket.getSupermarketAdi());

    }
}
