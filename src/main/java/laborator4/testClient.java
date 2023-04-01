package main.java.laborator4;

public class testClient {

    public static void main(String [] args) {

        Adresa adresa = new Adresa("Maniu", 33);
        Client client = new Client(adresa);

//        System.out.println(client);

        Adresa badAddress = client.getAdresa();
        badAddress.setNumar(77);

//        System.out.println(badAddress.getNumar());

        System.out.println("Adresa initiala dupa modificare: " + badAddress);
        System.out.println("Client dupa modificare numar adresa: " + client);

        ClientRecord clientRecord = new ClientRecord(adresa);

        System.out.println(clientRecord.adresa());


    }




}
