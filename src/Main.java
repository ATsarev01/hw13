public class Main {
    public static void main(String[] args) {
        Author remark = new Author("Эрих Мария", "Ремарк");
        Author brown = new Author("Дэн", "Браун");
        Book threeComrads = new Book("Три товарища", 1937, remark);
        Book angelsAndDemons = new Book("Ангелы и Демоны", 1998, brown);

        threeComrads.printInfo();
        angelsAndDemons.printInfo();

        threeComrads.setPublishingYear(1938);
        threeComrads.printInfo();

    }
}