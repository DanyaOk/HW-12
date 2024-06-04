public class Author {
    private String name;
    private String middleName;

    public Author (String name, String middleName) {
        this.name = name;
        this.middleName = middleName;
    }

    public String getName() {
        return this.name;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public static void main(String[] args) {

        Author Jack = new Author("Jack", "Epping");

        System.out.println("Jack.name = " + Jack.name);
        System.out.println("Jack.middleName = " + Jack.middleName);

    }
}