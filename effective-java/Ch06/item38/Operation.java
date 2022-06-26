package item38;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public interface Operation {
    double apply(double x, double y);

    public enum BasicOperation implements Operation {
        PLUS("+") { public double apply(double x, double y) { return x + y; }},
        MINUS("-") { public double apply(double x, double y) { return x - y;}},
        TIMES("*") { public double apply(double x, double y) { return x * y;}},
        DIVIDE("/") { public double apply(double x, double y) { return x / y;}};

        private final String symbol;

        BasicOperation(String symbol) { this.symbol = symbol; }

        @Override
        public String toString() { return symbol; }

    }
}