package no4;

public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Konstruktor default
    public LimasSegiEmpat() {
        this.luasAlas = 1;
        this.luasSelubungLimas = 1;
        this.tinggi = 1;
    }

    // Konstruktor parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Method untuk menghitung luas permukaan limas
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Method untuk menghitung volume limas
    public double getVolume() {
        return (luasAlas * tinggi) / 3;
    }

    // Getter untuk luas alas
    public double getLuasAlas() {
        return luasAlas;
    }

    // Getter untuk luas selubung limas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Setter untuk luas alas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    // Setter untuk luas selubung limas
    public void setLuasSelubung(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}
