import KawaM.KawaMielArabika;
import KawaM.KawaMielona;
import KawaR.KawaRozpArabika;
import KawaR.KawaRozpuszczalna;
import KawaZ.KawaZiarArabika;
import KawaZ.KawaZiarnista;

public class FabrykaArabiki implements IFabrykaKawy{

    public FabrykaArabiki() {
    }

    @Override
    public KawaRozpuszczalna createRozpuszczalna() {
        return new KawaRozpArabika();
    }

    @Override
    public KawaMielona createMielona() {
        return new KawaMielArabika();
    }

    @Override
    public KawaZiarnista createZiarnista() {
        return new KawaZiarArabika();
    }
}
