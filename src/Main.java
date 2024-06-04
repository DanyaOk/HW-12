import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        int currentYear = LocalDate.now().getYear();

        Author Jack = new Author("Jack", "Epping");
        Book Reflextion = new Book("Рефлексия",Jack, currentYear);
        System.out.println("Автора книги - " + Reflextion.getName() + " зовут " + Jack.getName() + " " + Jack.getsurname() + ", год издания книги " + Reflextion.getpublicationYear());
        Reflextion.setpublicationYear(2015);
        System.out.println("Автора книги - " + Reflextion.getName() + " зовут " + Jack.getName() + " " + Jack.getsurname() + ", год издания книги " + Reflextion.getpublicationYear());


        Author Dwayne = new Author("Dwayne", "Johnson");
        Book MuscleMan = new Book("Качок", Dwayne, currentYear);

        Author Danya = new Author("Danya", "Slyusarev");
        Book MillitaryEducation = new Book("Военное обучение", Danya, currentYear);


    }
}