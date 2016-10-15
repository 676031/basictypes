package books;

public class Books {

    public Books(int id, String name, String author, String publish, int year, int pages, int price, String cover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Книга" + " " + id + ", Название=" + name + ", Автор=" + author 
                + ", Издательство=" + publish + ", Год=" + year + ", Страниц=" + pages 
                + ", Цена=" + price + ", Переплет=" + cover + '}';
    }

    private int id;
    private String name;
    private String author;
    private String publish;
    private int year;
    private int pages;
    private int price;
    private String cover;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
