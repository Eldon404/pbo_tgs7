
package Program;

class Mahasiswa {
    protected String nim;
  protected String nama;
  protected float ipk;

    public Mahasiswa(String nim,String nama,float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    public float getIpk() {
        return ipk;
    }

    public void setIpk(float ipk) {
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}

