  public class Mahasiswa {
     private String nama;

     private EDate tanggalLahir;

     private String npm;

     private String email;

     private String fakultas;

     private String jurusan;

     private EFloat ipk;

     private MataKuliah matakuliah;
 
     public String getNama() {
       return this.nama;
     }

     public EDate getTanggalLahir() {
       return this.tanggalLahir;
     }

     public String getNpm() {
       return this.npm;
     }

     public String getEmail() {
       return this.email;
     }

     public String getFakultas() {
       return this.fakultas;
     }

     public String getJurusan() {
       return this.jurusan;
     }

     public EFloat getIpk() {
       return this.ipk;
     }

     public MataKuliah getMatakuliah() {
       return this.matakuliah;
     }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(EDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setIpk(EFloat ipk) {
        this.ipk = ipk;
    }

    public void setMatakuliah(MataKuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
 
     public invalid enroll() {
       // TODO should be implemented
       
     }

     public EFloat hitungIPK() {
       // TODO should be implemented
       
     }
  }
