package ar.edu.unahur.obj2;

public class Cafe extends Infusion implements TiempoYTemperatura {

    @Override
    public void agregarIngrediente() {
        System.out.println("Agregar grano de cafe molido");
    }

    @Override
    public void agregarExta() {
        System.out.println("Agregar azucar y/o leche");
    }


    @Override
    public double getTemperatura() {
        return 95;
    }

    @Override
    public double getTiempoDeInfusion() {
        return 4;
    }
}
