package pl.ciruk.blog.noswitch;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface TestAndConsume<T> extends Consumer<T>, Predicate<T> {
}
