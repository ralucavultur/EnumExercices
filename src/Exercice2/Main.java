package Exercice2;

public class Main {

    public static void main(String[] args) {
        String text = "serverId=25&serverName=my name&serverStatus=Running";
        Server server = new Server();
        server.parseValues(text);
        System.out.println(server.toString());
    }
}
