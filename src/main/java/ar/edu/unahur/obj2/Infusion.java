package ar.edu.unahur.obj2;

public abstract class Infusion {

    public void calentarAgua(){ System.out.println("Calentando el agua");}

    protected abstract void agregarIngrediente();

    public void servir(){
        System.out.println("Esta servido en la taza");
    }

    protected abstract void agregarExta();

}
