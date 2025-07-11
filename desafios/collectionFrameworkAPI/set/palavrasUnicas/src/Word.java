import java.util.Objects;

public class Word {
    private String world;

    public Word(String world) {
        this.world = world;
    }

    public String getWorld() {
        return world;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Word word = (Word) o;
        return Objects.equals(world, word.world);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(world);
    }

    @Override
    public String toString() {
        return "Word{" +
                "world='" + world + '\'' +
                '}';
    }
}
