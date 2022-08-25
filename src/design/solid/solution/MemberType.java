package design.solid.solution;

import java.util.function.Function;

public enum MemberType {
    FAMILY("일반", origin -> origin),
    VIP("VIP", origin -> Math.toIntExact(Math.round(origin - origin * 0.2)));

    private final String type;
    private final Function<Integer, Integer> expression;

    MemberType(String type, Function<Integer, Integer> expression ) {
        this.type = type;
        this.expression = expression;
    }

    public Integer calc(int origin) {
        return expression.apply(origin);
    }
}
