/**
 * Created by Derians
 * Date: 25.10.2018
 * Time: 10:23
 */
public class Exponent {

    public double exponentiation(double base, int exponent) {
        if (exponent > 0) {
            return (base * exponentiation(base, exponent - 1));
        } else if (exponent < 0){
            return (1 / exponentiation(base, -exponent)) ;
        } else {
            return 1;
        }
    }
}
