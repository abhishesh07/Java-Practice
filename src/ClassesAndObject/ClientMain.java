package ClassesAndObject;

public class ClientMain {
    public static void main(String[] args) {
        Client[] clients = new Client[2];
        clients[0] = new Client(100,"Abhishesh","8765430190");
        clients[0].addAccount((new Account(1,5000,2.5)));
        clients[0].addAccount((new Account(2,6000,3.5)));

        clients[1] = new Client(101,"Alok","7054220757");
        clients[1].addAccount((new Account(3,3000,1.5)));
        clients[1].addAccount((new Account(4,2000,3.5)));
        clients[1].addAccount((new Account(5,3600,2.5)));

        System.out.println(clients[0].toString()); //you can remove .toString method and you get same result.
        System.out.println(clients[1].toString());
    }
}
