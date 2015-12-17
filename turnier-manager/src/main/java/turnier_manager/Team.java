package turnier_manager;

public class Team implements Comparable<String> {
    public final String name;

    public Team(String name) {
        this.name = name;
    }

	@Override
	public int compareTo(String otherName) {
		return name.compareTo(otherName);
	}

    @Override
    public String toString() {
     return name;
    }
}
