package turnier_manager;

public interface Match {
    Team getTeam1();
    Team getTeam2();
    int getGoals1();
    int getGoals2();
    MatchStatus getStatus();
}
