public class Prog {
    private String Nama;
    private int Sem;
    private DataDiri DataDiri;
    
    public Prog (String Nama, int Sem){
        this.Nama = Nama;
        this.Sem = Sem;
    }
    
    public void setDataDiri (DataDiri DataDiri) {
        this.DataDiri = DataDiri;
    }
    
    public String getNama () {
        return Nama;
    }
    
    public int getSem () {
        return Sem;
    }  
}