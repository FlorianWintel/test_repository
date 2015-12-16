package turnier_manager;

import java.util.Map;

public class QualifyScore implements Score {

    final private Team team;

    public QualifyScore(Team team) {
        this.team = team;
    }

    @Override
    public Map<String, String> getScore() {
        return null;
    }

    @Override
    public void addScoreOfMatch(Match match, int matchNumber, int totalMatches) {


        if (match.getTeam1().equals(team.name)) {

            //match.getGoals1() > match.getGoals2()
        };
    }
}
