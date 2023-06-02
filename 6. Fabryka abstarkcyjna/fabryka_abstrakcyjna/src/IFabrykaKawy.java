import KawaM.KawaMielona;
import KawaR.KawaRozpuszczalna;
import KawaZ.KawaZiarArabika;
import KawaZ.KawaZiarnista;

public interface IFabrykaKawy {
    public KawaRozpuszczalna createRozpuszczalna();
    public KawaMielona createMielona();
    public KawaZiarnista createZiarnista();
}
