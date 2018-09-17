import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketDispatcher implements Runnable {
    private final Socket socket;
    InputStream inputStream = null;
    OutputStream outputStream = null;

    public SocketDispatcher(Socket socket) {
        this.socket=socket;

    }

    @Override
    public void run() {
        try {

            //1 zanyat port
            //  serverSocket = new ServerSocket(8082);

            System.out.println("connected...");//socked poluchen


            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //sama informachiya na servere
        String html = "<html>" +
                "<head>" +
                "<title>" +
                //title- nazvanie vkladki
                "Hello motherfuckers!!!" +
                "</title>" +
                "</head>" +

                "<body>" +
                //stroka na straniche
                "<h>Hello Vamp! </h1>" +
                "<br/>" +
                //v img nuzjno zasunut URL kartinki
                "<img src=\" data:image/jpeg;base64,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  \">" +
                "</body>" +

                "</html>";

        //pravila delovoy perepiski
        String header = "HTTP/1.1. 200 ok\n" +
                "Content=Language: ru\n" +
                "Content-Type:text/html; charset=utf-8\n" +
                "Content-Length: " + html.length() + "\n" +
                "Connection: close\n\n";

        String result = header + html;
        try {
            outputStream.write(result.getBytes());
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(outputStream !=null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
