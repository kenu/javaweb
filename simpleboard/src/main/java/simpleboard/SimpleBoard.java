package simpleboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jisun on 2017. 9. 19..
 */
public class SimpleBoard {

    private List<Article> list = new ArrayList<Article>();

    public boolean add(Article article) {
        list.add(article);
        return true;
    }

    public Article get(long l) {
        Article article = new Article();

        for(int i=0; i<list.size(); i++) {
            Article testArticle= list.get(i);

            if(testArticle.getId() == l) {
                article = testArticle;
            }
        }
        return article;
    }

    public long size() {
        return list.size();
    }

    public boolean delete(long l) {
        for(int i=0; i<list.size(); i++) {
            Article article = list.get(i);
            if(article.getId() == l) {
                list.remove(article);
            }
        }
        return true;
    }

    public void update(Article article2) {

        for(int i=0; i<list.size(); i++) {
            Article article = list.get(i);
            if(article.getId() == article2.getId()) {
                list.set(i,article2);
            }
        }
    }

    public List<Article> getList() {
        return this.list;
    }

}
