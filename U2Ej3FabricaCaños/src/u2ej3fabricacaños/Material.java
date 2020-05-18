package u2ej3fabricacaños;

public class Material {
    private String descripcion;
    private int cod;
    private float valorUnit;

    public Material(String descripcion, int cod, float valorUnit) {
        this.descripcion = descripcion;
        this.cod = cod;
        this.valorUnit = valorUnit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }

    @Override
    public String toString() {
        return "Material{" + "descripcion=" + descripcion + ", cod=" + cod + ", valorUnit=" + valorUnit + '}';
    }
    
    
    
}
