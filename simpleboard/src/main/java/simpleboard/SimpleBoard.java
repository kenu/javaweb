package simpleboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleBoard {
    List<Article> store = new ArrayList<Article>();

    public boolean add(Article article) {
        store.add(article);
        return true;
    }

    public Article get(long l) {
        Iterator<Article> it = store.iterator();
        while (it.hasNext()) {
            Article art = it.next();
            if (art.getId() == l) {
                return art;
            }
        }
        return null;
    }

    public long size() {
        return store.size();
    }

    public boolean delete(long l) {
        Iterator<Article> it = store.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == l) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public void update(Article article2) {
        Iterator<Article> it = store.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == article2.getId()) {
                it.remove();
                break;
            }
        }
        store.add(article2);
    }

    public List<Article> getList() {
        return store;
    }
}
