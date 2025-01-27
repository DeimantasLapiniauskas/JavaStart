import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;

import java.util.List;

public class NewsServiceImpImp implements NewsService {
    private List<Article> articles;

    public NewsServiceImpImp(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getArticles() {
        return articles.stream()
                .anyMatch(a->a.getBrief().contains(" "))
    }
}
