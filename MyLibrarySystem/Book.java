package MyLibrarySystem;
/**
 * 책의 기능을담고있는 인터페이스
 * @author 충만
 *
 */
public interface Book extends Library{
	
	public void borrow();
	public void returnBook();
	public void bookSearch();
	public void printBookList();
	public void bookInfoChange();
	public void bookAdd();
	public void bookDelete();
}
