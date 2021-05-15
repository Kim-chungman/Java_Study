package MyLibrarySystem;
/**
 * user(사용자)와 manager(관리자)의 기능을 나타내는 인터페이스
 * @author 충만
 *
 */
public interface Member extends Library{

	public void join();
	public void logIn();
	public void logOut();
	public void userSearch();
	public void printUserList();
	public void userUpdate();
	public void userDelete();
	
}
