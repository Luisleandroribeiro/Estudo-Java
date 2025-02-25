package FundamentosJava.Datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        // Cria um formatador de data com o padrão desejado
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Obtém a data e hora atuais
        Date data = new Date();

        // Formata a data para exibição
        String dataFormatada = fmt.format(data);

        // Exibe a data formatada corretamente
        System.out.println("📅 Data atual: " + dataFormatada);
    }
}
