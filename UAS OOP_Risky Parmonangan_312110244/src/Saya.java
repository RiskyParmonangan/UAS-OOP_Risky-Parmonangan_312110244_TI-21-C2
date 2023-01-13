public abstract class Saya {
    protected String Nama;
    protected int NIM;
    
    public Saya (String Nama, int NIM) {
        this.Nama = Nama;
        this.NIM = NIM;
    }
    
    public abstract void getInfo();
}
