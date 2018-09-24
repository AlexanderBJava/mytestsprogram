import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {
    public static void main(String[] args) throws IOException {
        String site="https://yandex.ru";
        URL url=null;
        int response= 0;
        try {
            url=new URL(site); //преобразуем строку site к формату url
        } catch (MalformedURLException e) {//неправильно сформированый урл
            e.printStackTrace();
            System.out.println("Wrong url");
        }
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnection=(HttpURLConnection) url.openConnection();
            response = httpURLConnection.getResponseCode();//код ответа 302-перенаправление
                                                            //200- все норм
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(response);
        BufferedReader bufferedReader = null;

        try {
            bufferedReader=new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder result=new StringBuilder();
        String input;
        while((input= bufferedReader.readLine()) !=null) {
            result.append(input);
        }
        System.out.println(result);

    }
}
