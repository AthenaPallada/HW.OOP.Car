package transport;

public enum TypeOFBody {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COUPE("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String name;

    TypeOFBody(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
