package formatter;

/**
 *
 * @author William
 */
public class DecimalFormat {

    /**
     * Formatando um Double em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decimalFormatR$(Double numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Integer em Moeda - "R$ 1,110.00"
     *
     * @param numero
     * @return String
     */
    public static String decimalFormatR$(Integer numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("R$ ###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Decimal em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decimalFormat(Double numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }

    /**
     * Formatando um Inteiro em Valor decimal Normal - "1,110.00"
     *
     * @param numero
     * @return
     */
    public static String decimalFormat(Integer numero) {
        java.text.DecimalFormat df = new java.text.DecimalFormat();
        df.applyPattern("###,###,##0.00");
        return df.format(numero);
    }

}
