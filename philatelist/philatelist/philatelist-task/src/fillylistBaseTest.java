import lt.techin.philatelist.Philatelist;
import lt.techin.philatelist.PhilatelistBaseTest;

public class fillylistBaseTest extends PhilatelistBaseTest {


    @Override
    protected Philatelist getPhilatelist() {
        return new fillylist();
    }
}
