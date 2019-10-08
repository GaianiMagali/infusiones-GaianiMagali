package TiposDeTe;

import ar.edu.unahur.obj2.Te;
import ar.edu.unahur.obj2.TiempoYTemperatura;

public class TeVerde extends Te implements TiempoYTemperatura {

    @Override
    public double getTemperatura() {
        return 65;
    }

    @Override
    public double getTiempoDeInfusion() {
        return 1.30;
    }
}
