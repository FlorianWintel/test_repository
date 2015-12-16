package turnier_manager;

import java.util.Map;

public interface Score {
    Map<String, String> getScore();
    void addScoreOfMatch(Match match, int matchNumber, int totalMatches);
}