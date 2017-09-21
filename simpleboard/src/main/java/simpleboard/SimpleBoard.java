package simpleboard;

import java.util.ArrayList;
import java.util.List;

public class SimpleBoard {
    List<Article> store = new ArrayList<Article>();

    public boolean add(Article article) {
        store.add(article);
        return true;
    }

    public Article get(long l) {
        Article article = new Article();

        for(int i = 0; i < store.size(); i++) {
            if(store.get(i).getId() == l)
                article = store.get(i);
        }

        return article;   //return null;
    }

    public long size() {
        return store.size();
    }

    public boolean delete(long l) {
        for(int i = 0; i < store.size(); i++) {
            if (store.get(i).getId() == l)
                store.remove(i);
        }
        return true;
    }

    public void update(Article article2) {
    }

    public List<Article> getList() {
        return store;
    }
}
