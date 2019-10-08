package TiposDeTe;

import ar.edu.unahur.obj2.Te;
import ar.edu.unahur.obj2.TiempoYTemperatura;

public class TeBlanco extends Te implements TiempoYTemperatura {

    @Override
    public double getTemperatura() {
        return 85;
    }

    @Override
    public double getTiempoDeInfusion() {
        return 4;
    }
}
