package Exercice2;

public class Server {
    public int serverId;
    public String serverName;
    public Status serverStatus;
    public enum Status {
        Stopped, Running, Unknown
    }


    public void parseValues(String text){
        String[] fields = text.split("&");
        for (int i = 0; i < fields.length; i++) {
            String[] information = fields[i].split("=");
            switch (information[0]) {
                case "serverId" -> serverId = Integer.parseInt(information[1]);
                case "serverName" -> serverName = information[1];
                case "serverStatus" -> {
                    serverStatus = Status.Unknown;
                    try {
                        serverStatus = Server.Status.valueOf(information[1]);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Server{" +
                "id = " + serverId +
                ", name = '" + serverName + '\'' +
                ", status = " + serverStatus +
                '}';
    }
}
