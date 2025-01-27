import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;

public class BaseNewsServiceTestImp extends BaseNewsServiceTest {
    @Override
    protected NewsService getNewsService() {
        return new NewsServiceImpImp(new ArrayList<>());
    }
}
