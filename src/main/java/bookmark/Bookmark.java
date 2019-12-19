package bookmark;

public class bookmark {

  private long id;
  private final String title;
  private final String url;

  public bookmark(String title, url) {
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
  
  public static void main(String args[]){
    bookmark b = new Bookmark("this is hte title", "http://www.google.com");
    System.out.println(bookmark.id);
    System.out.println(bookmark.title);
    System.out.println(bookmark.url);
  }
  
}