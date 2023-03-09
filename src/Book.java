public class Book {
    private String title;
    private int publishingYear;
    private Author author;

    public Book(String title, int publishingYear, Author author) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.author = author;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Author getAuthor() {
        return author;
    }
    public void printInfo() {
        System.out.println("Название - " + title + ". " + "Год издания - " + publishingYear + ". " + "Автор - " + author.getName() + " " + author.getSurname());

    }
}

