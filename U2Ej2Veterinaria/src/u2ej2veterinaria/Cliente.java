package u2ej2veterinaria;

public class Cliente {
    int numClte;
    String nomClte;
    int antiguedad;
    String nomMascota;

    public Cliente(int numClte, String nomClte, int antiguedad, String nomMascota) {
        this.numClte = numClte;
        this.nomClte = nomClte;
        this.antiguedad = antiguedad;
        this.nomMascota = nomMascota;
    }

    public int getNumClte() {
        return numClte;
    }

    public void setNumClte(int numClte) {
        this.numClte = numClte;
    }

    public String getNomClte() {
        return nomClte;
    }

    public void setNomClte(String nomClte) {
        this.nomClte = nomClte;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numClte=" + numClte + ", nomClte=" + nomClte + ", antiguedad=" + antiguedad + ", nomMascota=" + nomMascota + '}';
    }
    
    
}
