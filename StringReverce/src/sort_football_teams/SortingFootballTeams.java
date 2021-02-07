package sort_football_teams;

import java.util.*;
import java.util.stream.Collectors;

public class SortingFootballTeams {

    /**
     * Есть список команд.
     * Необходимо расположить команды по принципу: страны в алфавитном порядке и количество набранных очков
     */

    public List<FootballClub> sortingFootballTeams(List<FootballClub> list) {
        List<FootballClub> sortedClubs = new ArrayList<>(list);

        return sortedClubs.stream()
                .sorted(Comparator.comparing(FootballClub::getCountry)
                        .thenComparing(FootballClub::getAchievedPoint)).collect(Collectors.toList());
    }
}
