import lt.itakademija.exam.Exercises;
import lt.itakademija.exam.IntegerGenerator;
import lt.itakademija.exam.NumberFilter;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Execution implements Exercises {
    @Override
    public Integer findSmallest(List<Integer> list) {
        return list.stream().min(Integer::compare).get();
    }

    @Override
    public Integer findLargest(List<Integer> list) {
        return list.stream().max(Integer::compare).get();
    }

    @Override
    public boolean isEqual(Object o, Object o1) {
        return o.equals(o1);
    }

    @Override
    public boolean isSameObject(Object o, Object o1) {
        return o == o1;
    }

    @Override
    public List<Integer> consume(Iterator<Integer> iterator) {
        return List.of(iterator.next());
    }

    @Override
    public int computeSumOfNumbers(int i) {
        return i * (i + 1) / 2;
    }

    @Override
    public int computeSumOfNumbers(int i, NumberFilter numberFilter) {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            if (numberFilter.accept(j)) {
                sum += j;
            }
        }
        return sum;
    }

    @Override
    public List<Integer> computeNumbersUpTo(int i) {
        return IntStream.range(1, i).boxed().collect(Collectors.toList());
    }

    @Override
    public Map<Integer, Integer> countOccurrences(List<Integer> list) {
        return list.stream().collect(groupingBy(item -> item, Collectors.collectingAndThen(counting(), Long::intValue)));
    }

    @Override
    public IntegerGenerator createIntegerGenerator(int i, int i1) {
        return new IntegerGenerator() {
            int currentNmbr = i;

            @Override
            public Integer getNext() {
                int output = currentNmbr;
                if (currentNmbr <= i1) {
                    currentNmbr++;
                } else {
                    currentNmbr++;
                    return null;
                }
                return output;
            }
        };
    }

    @Override
    public IntegerGenerator createFilteredIntegerGenerator(IntegerGenerator integerGenerator, NumberFilter numberFilter) {
        return () -> {
            if (integerGenerator.getNext() != null) {
                return integerGenerator.getNext();
            }
            try {
                if (numberFilter.accept(integerGenerator.getNext())) {
                    return 0;
                }
            } catch (Exception e) {
                return null;
            }
            return 0;
        };
    }
}
