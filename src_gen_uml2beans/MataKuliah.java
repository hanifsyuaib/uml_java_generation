  public class MataKuliah {
     private String kode;

     private String nama;

     private Integer sks;

     private Mahasiswa mahasiswa;
 
     public String getKode() {
       return this.kode;
     }

     public String getNama() {
       return this.nama;
     }

     public Integer getSks() {
       return this.sks;
     }

     public Mahasiswa getMahasiswa() {
       return this.mahasiswa;
     }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
 
     public String getInfo() {
       // TODO should be implemented
       
     }
  }
