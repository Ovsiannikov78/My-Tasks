package sort_football_teams;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingFootballTeamsTest {

    SortingFootballTeams teams = new SortingFootballTeams();

    List<FootballClub> clubs = Arrays.asList(new FootballClub("Germany", "Bayern München", 1),
            new FootballClub("Spain", "Barcelona", 5),
            new FootballClub("England", "Manchester City", 3),
            new FootballClub("Spain", "Real Madrid", 7),
            new FootballClub("Spain", "Atletico Madrid", 2),
            new FootballClub("England", "Liverpool ", 4),
            new FootballClub("France", "Paris Saint-Germain", 6));

    @Test
    public void testSortingFootballTeams() {
        List<FootballClub> exp = Arrays.asList(
                new FootballClub("England", "Manchester City", 3),
                new FootballClub("England", "Liverpool ", 4),
                new FootballClub("France", "Paris Saint-Germain", 6),
                new FootballClub("Germany", "Bayern München", 1),
                new FootballClub("Spain", "Atletico Madrid", 2),
                new FootballClub("Spain", "Barcelona", 5),
                new FootballClub("Spain", "Real Madrid", 7));

        List<FootballClub> akt = teams.sortingFootballTeams(clubs);

        assertEquals(exp, akt);
    }
}
