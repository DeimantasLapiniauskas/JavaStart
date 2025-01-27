
public class Article implements lt.vtvpmc.Article {

    private String heading;
    private String brief;

    public Article(String heading, String brief){
        this.heading = heading;
        this.brief = brief;
    }

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getBrief() {
        return brief;
    }
}
