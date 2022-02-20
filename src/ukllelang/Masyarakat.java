
package ukllelang;
import java.util.ArrayList;

public class Masyarakat implements User{
    private ArrayList<String> namaMasyarakat = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telp = new ArrayList<String>();
    
    public Masyarakat(){
        this.namaMasyarakat.add("Jeno");
        this.alamat.add("Bojong gede");
        this.telp.add("082467827");
        
        this.namaMasyarakat.add("Jahe");
        this.alamat.add("Panggung Sari");
        this.telp.add("087265371");
    }

    @Override
    public void setNama(String nama) {
        this.namaMasyarakat.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelp(String telp) {
        this.telp.add(telp);
    }

    @Override
    public String getNama(int id) {
        return this.namaMasyarakat.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelp(int id) {
        return this.telp.get(id);
    }
    
}
