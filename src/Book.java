public class Book {
    private String name;
    private Author author;
    private int publicationYear;

    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }



    public int getpublicationYear() {
        return this.publicationYear;
    }

    public void setpublicationYear (int publicationYear){
        this.publicationYear = publicationYear;
    }
}

