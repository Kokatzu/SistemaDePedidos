package Utils;

public class FormatUtils {
    public static String priceFormat(double value){
        return String.format("R$ %.2f", value);
    }

    public static String cpfFormat(String cpf){
        return cpf.substring(0,3) + "."
                + cpf.substring(3,6) + "."
                + cpf.substring(6,9) + "-"
                + cpf.substring(9,11);
    }
}
