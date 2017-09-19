package simpleboard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleBoard {

    private HashMap<Long,Article> articles;

    public SimpleBoard() {
        this.articles = new HashMap();
    }

    public boolean add(Article article) {
        if(this.articles.containsKey(article.getId())){return false;}
        this.articles.put(article.getId(), article);
        return true;
    }

    public Article get(long key) {
        return this.articles.get(key);
    }

    public long size() {
        return this.articles.size();
    }

    public boolean delete(long key) {
        if(!this.articles.containsKey(key)){return false;}
        this.articles.remove(key);
        return true;
    }

    public void update(Article article) {
        if(this.articles.containsKey(article.getId())){
            this.articles.put(article.getId(),article);
        }
    }

    public List<Article> getList() {
        return new ArrayList<Article>(articles.values());
    }
}
