package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class averageofinteger {



    public float average(List<Integer> list) {
    OptionalDouble  avergae=    list.stream().mapToDouble(Integer::intValue).average();
        System.out.println(avergae.getAsDouble());

        return 0;
    }


}
