package Utils;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatUtils {

    private static NumberFormat priceFormatter = NumberFormat.getCurrencyInstance(new Locale("pt", "br"));
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");

    public static String priceFormat(double value){
        return priceFormatter.format(value);
    }

    public static String dateTimeFormat(LocalDateTime dateTime){
        return dateTime.format(dateTimeFormatter);
    }


    public static String cpfFormat(String cpf){
        return cpf.substring(0,3) + "."
                + cpf.substring(3,6) + "."
                + cpf.substring(6,9) + "-"
                + cpf.substring(9,11);
    }
}
