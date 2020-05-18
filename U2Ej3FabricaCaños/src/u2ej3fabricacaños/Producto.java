package u2ej3fabricacaños;

public class Producto {
    private String descripcion;
    Material[] materiales;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto(String descripcion, int cantMaterials) {
        this.descripcion = descripcion;
        materiales = new Material[cantMaterials];
    }
    
    public void addMaterial(Material material){
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = material;
                break;
            }
            else{
                if (materiales.length == i+1){
                    System.out.println("Sin espacio.");
                }
            }
        }       
    }
    
    public double montoTotal(){
        double costo = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                costo += materiales[i].getValorUnit();
            }
            else{
                System.out.println("Sin materiales");
            }
        }
        return costo;      
    }
    
    public boolean materialEnProd(int cod){
        boolean b = false;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getCod() == cod) {
                b = true;
                break;
            }
        }  
        return b;
    }
    
    public Material[] menorMaterial(double valUnit){
        
        int tam = 0;
        
        Material[] menMat;
        menMat = new Material[tam];
        
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i].getValorUnit() < valUnit) {
                
            }
        }
        return menMat;
        
        //No supe cómo seguir con esto.
    }
    
    
    
}
    


