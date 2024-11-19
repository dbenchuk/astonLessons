public class Main {
    public static void main(String[] args) {
        SimpleCollection simpleCollection = new SimpleCollection();
        TelephoneBook book = new TelephoneBook();

        simpleCollection.getUniqueWords();

        simpleCollection.getRepeatedWords();

        book.add("Petrov", "375445181703");
        book.add("Ivanov", "375448580803");
        book.add("Kuznecov", "375290965203");
        book.add("Petrov", "375258630403");

        book.get("Petrov");
        book.get("Ivanov");
        book.get("Kuznecov");
    }
}