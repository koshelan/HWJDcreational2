import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        result = source.stream().filter(i ->
        {
            logger.log("Элемент " + i + (i >= treshold ? " подходит" : " не подходит"));
            return i >= treshold;
        })
                .collect(Collectors.toList());
        logger.log("Фильтр прошли " + result.size() + " элемента из " + source.size());
        return result;
    }
}
