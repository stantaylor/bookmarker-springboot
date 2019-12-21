package bookmark;

public class Bookmark {

  private long id;
  private String title;
  private String url;

  public Bookmark(String title, String url) {
    this.title = title;
    this.url = url;
  }

  public long getId() {
    return id;
  }
  public void setId(){
    id = 123;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String t) {
    title = t;
  }

  public void setUrl(String u) {
    url = u;
  }
  public String getUrl() {
    return url;
  }
  
  // public static void main(String args[]) {
  //   Bookmark bookmark = new Bookmark("This is the title", "https://www.asdf.com");
  //   System.out.println(bookmark.id);
  //   System.out.println(bookmark.title);
  //   System.out.println(bookmark.url);
  // }
  
}
