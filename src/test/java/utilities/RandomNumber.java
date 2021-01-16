package utilities;

import java.util.Random;

public class RandomNumber {

    public int randomNumberGenerator(int size){

        Random random = new Random();
        return random.nextInt(size-1);
    }
}
