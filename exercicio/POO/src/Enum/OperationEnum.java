package Enum;

import java.util.function.BiFunction;

public enum OperationEnum {
    Sum(Integer::sum,"+"),
    Substraction((integer, integer2) -> integer - integer2, "-"),
    Multiply((integer, integer2) -> integer * integer2,"*"),
    Division((integer, integer2) -> integer / integer2,"/");

    private final BiFunction<Integer,Integer,Integer> calculate;
    private final String symbol;

    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}
