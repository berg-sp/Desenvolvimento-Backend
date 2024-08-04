import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class EnderecoApiCaller {

    public Endereco chamarApi(String cep) {
        try {
            URL url = new URL("https://viacep.com.br/ws/" + cep +"/son/");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection()
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK)
            {
                Endereco Endereco = new Endereco();

                BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
                );

                String inputLine;
                StringBuilder
            }
        }
    }

}
