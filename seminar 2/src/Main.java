import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tool> tools = List.of(new Hammer("ham1", 10), new Saw("saw1", 5));
        System.out.println(ToolFilter.filterByWeight(tools, 7));
        System.out.println(ToolFilter.filterByCanCut(tools));

        int[] arr={6, 5, 3, 7};

        ArraySorter sorter = new ArraySorter();
        sorter.setSortingStrategy(new SlowSorter());
        sorter.sortArray(arr);

        System.out.println(Arrays.toString(arr));
    }
}