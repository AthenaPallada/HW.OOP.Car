package multiply;

import java.util.HashSet;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Exercise {

    public static void main(String[] args) {
        Random random = new Random();
        Set<Exercise> exercises = new HashSet<>();
        while (exercises.size() < 15) {
            Exercise exercise = new Exercise(random.nextInt(8) + 2, random.nextInt(8) + 2);
            exercises.add(exercise);
            System.out.println(exercise);
        }
    }

    private final int a;
    private final int b;

    public Exercise(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Exercise exercise = (Exercise) o;
        return a == exercise.a && b == exercise.b || a == exercise.b && b == exercise.a;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(a) + Objects.hashCode(b);
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + a * b;
    }
}
