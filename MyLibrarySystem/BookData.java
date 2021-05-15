package MyLibrarySystem;
/**
 * 책의 정보를 담고있는 클래스
 * @author 충만
 *
 */
public class BookData {
	private String genre, name, author;
	private int stock;
	private boolean rental;
	
	public boolean isRental() {
		return rental;
	}
	public void setRental(Boolean rental) {
		this.rental = rental;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
