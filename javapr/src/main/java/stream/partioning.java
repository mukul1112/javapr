package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class partioning {

   // partitioning in java streams of arrays and list it predicate <condition > on which
    // its part the stream and return map<boolean,List<Integer>>

    public Map<Boolean, List<Integer>> partion (List<Integer> list){

        Map<Boolean,List<Integer>> result=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        return result;
    }


}
