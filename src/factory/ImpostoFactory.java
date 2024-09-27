package factory;

import imposto.ICMS;
import imposto.Imposto;
import imposto.IPI;
import imposto.ISS;
import imposto.PIS;
public class ImpostoFactory {
    public static Imposto criarImposto(TipoImposto tipo) {
        switch (tipo) {
            case ICMS:
                return new ICMS();
            case IPI:
                return new IPI();
            case ISS:
                return new ISS();
            case PIS:
                return new PIS();
            default:
                throw new IllegalArgumentException("Tipo de imposto desconhecido: " + tipo);
        }
    }
}
