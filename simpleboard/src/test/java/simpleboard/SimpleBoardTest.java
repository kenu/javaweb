package simpleboard;

import java.util.List;

import junit.framework.TestCase;

public class SimpleBoardTest extends TestCase {
	public void testAdd() {
		Article article = new Article(1L, "kenu", "title", "content");
		SimpleBoard simpleBoard = new SimpleBoard();
		boolean result = simpleBoard.add(article);
		assertTrue(result);
	}

	public void testGet() {
		Article article = new Article(2L, "kenu", "title", "content");
		SimpleBoard simpleBoard = new SimpleBoard();
		simpleBoard.add(article);
		Article article2 = simpleBoard.get(2L);
		assertEquals(article.getWriter(), article2.getWriter());

	}

	public void testDelete() {
		Article article = new Article(1L, "kenu", "title", "content");
		SimpleBoard simpleBoard = new SimpleBoard();
		simpleBoard.add(article);

		long sizeBefore = simpleBoard.size();
		boolean result = simpleBoard.delete(1L);
		assertTrue(result);
		long sizeAfter = simpleBoard.size();
		assertEquals(1, sizeBefore - sizeAfter);
	}

	public void testUpdate() {
		Article article = new Article(1L, "kenu", "title", "content");
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
		Article article = new Article(1L, "kenu", "title", "content");

		Article article2 = new Article(2L, "kenu", "title", "content");

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
