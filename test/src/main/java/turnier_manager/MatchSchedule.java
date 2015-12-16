package turnier_manager;

import java.util.Collection;

public interface MatchSchedule {
    Collection<Match> getMatches();
    void setMatch(int matchNumber, int goal1, int goal2) throws IndexOutOfBoundsException;
}
