public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenisKelamin;
    private String fakultas; // Atribut baru

    public Mahasiswa(String nim, String nama, String jenisKelamin, String fakultas) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.fakultas = fakultas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public String getNim() {
        return this.nim;
    }

    public String getNama() {
        return this.nama;
    }

    public String getJenisKelamin() {
        return this.jenisKelamin;
    }

    public String getFakultas() {
        return this.fakultas;
    }
}