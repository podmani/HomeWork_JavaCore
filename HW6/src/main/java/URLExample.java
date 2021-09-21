import java.io.IOException;
import com.squareup.okhttp.*;

    public class URLExample {
        public static void main(String[] args) throws IOException {

            OkHttpClient client = new OkHttpClient();



            Request request = new Request.Builder()
                    .url("https://api.openweathermap.org/data/2.5/forecast?q=Saint Petersburg,RU&units=metric&appid=9d01a5fdc1574ba44b6699706e3aed8e")
                    .addHeader("accept", "application/json")
                    .get()
                    .build();

            Response response = client.newCall(request).execute();
            //System.out.println(response.headers());
            System.out.println(response.body().string());

        }

    }

