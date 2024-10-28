package testbank1;
public class TestBank1 {

    public static void main(String[] args) {
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Anna", 22);

        System.out.println("Ο πελατης ειναι ο " + p1);
        System.out.println("Ο πελατης ειναι η " + p2);
        
        Account a1 = new Account(101);
        Account a2 = new Account(201);

        System.out.println("Ο κωδικος του πελατη " + p1.getName() + " ειναι " + a1);
        System.out.println("Ο κωδικος του πελατη " + p2.getName() + " ειναι " + a2);
    }

}
