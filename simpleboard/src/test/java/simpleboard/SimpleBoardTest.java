package simpleboard;

import java.util.List;

import junit.framework.TestCase;

public class SimpleBoardTest extends TestCase {

	public void testAdd() {
		Article article = setArticle(1L, "kenu", "title", "contenet");

		SimpleBoard simpleBoard = new SimpleBoard();
		boolean result = simpleBoard.add(article);
		assertTrue(result);
	}

	private Article setArticle(Long id, String writer, String title, String content){
		Article article = new Article();
		article.setId(id);
		article.setWriter(writer);
		article.setTitle(title);
		article.setContent(content);
		return article;
	}

	public void testGet() {
		Article article = setArticle(2L, "kenu", "title", "contenet");

		SimpleBoard simpleBoard = new SimpleBoard();
		simpleBoard.add(article);

		Article article2 = simpleBoard.get(2L);
		assertEquals(article.getWriter(), article2.getWriter());
	}

	public void testDelete() {
		Article article = setArticle(1L, "kenu", "title", "contenet");

		SimpleBoard simpleBoard = new SimpleBoard();
		simpleBoard.add(article);

		long sizeBefore = simpleBoard.size();
		boolean result = simpleBoard.delete(1L);
		assertTrue(result);

		long sizeAfter = simpleBoard.size();
		assertEquals(1, sizeBefore - sizeAfter);
	}

	public void testUpdate() {
		Article article = setArticle(1L, "kenu", "title", "contenet");

		SimpleBoard simpleBoard = new SimpleBoard();
		boolean result = simpleBoard.add(article);
		assertTrue(result);

		Article article2 = simpleBoard.get(1L);
		article2.setContent("content changed");
		simpleBoard.update(article2);
		
		Article article3 = simpleBoard.get(1L);
		assertEquals(article2.getContent(), article3.getContent());
	}

	public void testGetList() {
		Article article = setArticle(1L, "kenu", "title", "contenet");
		Article article2 = setArticle(2L, "kenu2", "title2", "contenet2");

		SimpleBoard simpleBoard = new SimpleBoard();
		boolean result = simpleBoard.add(article);
		assertTrue(result);
		boolean result2 = simpleBoard.add(article2);
		assertTrue(result2);

		List<Article> list = simpleBoard.getList();
		int size = list.size();
		assertEquals(2, size);
	}

}
