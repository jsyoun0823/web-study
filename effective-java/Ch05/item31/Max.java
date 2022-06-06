package item31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;

public class Max {
    public static <E extends Comparable<? super E>> E max(List<? extends E> list) {
        if (list.isEmpty())
            throw new IllegalArgumentException("컬렉션이 비어 있습니다.");

        E result = null;
        for (E e : list) {
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);
        }

        return result;
    }

    public static void main(String[] args) {
        List<ScheduledFuture<?>> scheduledFutures = new ArrayList<>();
    }
}