package TiposDeTe;

import ar.edu.unahur.obj2.Te;
import ar.edu.unahur.obj2.TiempoYTemperatura;

public class TeNegro extends Te implements TiempoYTemperatura{


    public double getTemperatura() {return 95;}


    public double getTiempoDeInfusion() {return 6;}
}
