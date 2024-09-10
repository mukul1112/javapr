package stream;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class sumarizing {

    public IntSummaryStatistics summarystaus (List<Integer> list){

        IntSummaryStatistics result= list.stream().collect(Collectors.summarizingInt(Integer::intValue));
        return result;
    }


}
