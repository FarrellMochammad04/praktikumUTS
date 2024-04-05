
package no4;


public class Main {
    public static void main(String[] args) {
        // Membuat objek limas pertama
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas : " + limas1.getLuasAlas() + ", luas selubung limas : " + limas1.getLuasSelubungLimas() + " dan tinggi : " + limas1.getTinggi() + ". Luasnya : " + limas1.getLuas() + ", sedangkan volumenya : " + limas1.getVolume());

        // Membuat objek limas kedua
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        System.out.println("Limas segi empat dengan luas alas : " + limas2.getLuasAlas() + ", luas selubung limas : " + limas2.getLuasSelubungLimas() + " dan tinggi : " + limas2.getTinggi() + ". Luasnya : " + limas2.getLuas() + ", sedangkan volumenya : " + limas2.getVolume());

        // Membuat objek limas ketiga
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);
        System.out.println("Limas segi empat dengan luas alas : " + limas3.getLuasAlas() + ", luas selubung limas : " + limas3.getLuasSelubungLimas() + " dan tinggi : " + limas3.getTinggi() + ". Luasnya : " + limas3.getLuas() + ", sedangkan volumenya : " + limas3.getVolume());
    }
}
