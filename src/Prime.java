import java.util.ArrayList;
import java.util.List;

public class Prime implements PrimeNumberGenerator {
    @Override
    public List<Integer> generate(int startingValue, int endingValue) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return arrayList;
    }

    @Override
    public boolean isPrime(int value) {
        if (value < 2) {
            return false;
        }

        if (value == 2 || value == 3) {
            return true;
        }

        if(value % 2 == 0) {
            return false;
        }

        for(int i = 3; i <= Math.sqrt(value); i += 2) {
            if(value % i == 0) {
                return false;
            }
        }

        return true;
    }
}
