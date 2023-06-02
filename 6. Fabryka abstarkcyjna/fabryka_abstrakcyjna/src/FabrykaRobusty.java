import KawaM.KawaMielRobusta;
import KawaM.KawaMielona;
import KawaR.KawaRozpRobusta;
import KawaR.KawaRozpuszczalna;
import KawaZ.KawaZiarArabika;
import KawaZ.KawaZiarRobusta;
import KawaZ.KawaZiarnista;

public class FabrykaRobusty implements IFabrykaKawy{
    public FabrykaRobusty() {
    }

    @Override
    public KawaRozpuszczalna createRozpuszczalna() {
        return new KawaRozpRobusta();
    }

    @Override
    public KawaMielona createMielona() {
        return new KawaMielRobusta();
    }

    @Override
    public KawaZiarnista createZiarnista() {
        return new KawaZiarRobusta();
    }
}
