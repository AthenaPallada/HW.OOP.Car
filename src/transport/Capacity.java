package transport;

public enum Capacity {

    EXTRA_SMALL(null, 10),
    SMALL(10,25),
    MEDIUM(40,50),
    LARGE(60,80),
    EXTRA_LARGE(100,120);

    private final Integer from;
    private final Integer to;

    Capacity(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    public Integer getFrom() {
        return from;
    }

    public Integer getTo() {
        return to;
    }
}