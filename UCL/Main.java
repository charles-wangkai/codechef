import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			Match[] matches = new Match[12];
			for (int i = 0; i < matches.length; i++) {
				String homeTeamName = sc.next();
				int homeTeamGoals = sc.nextInt();
				sc.next();
				int awayTeamGoals = sc.nextInt();
				String awayTeamName = sc.next();

				matches[i] = new Match(homeTeamName, homeTeamGoals, awayTeamName, awayTeamGoals);
			}

			System.out.println(solve(matches));
		}

		sc.close();
	}

	static String solve(Match[] matches) {
		Map<String, Team> nameToTeam = new HashMap<>();
		for (Match match : matches) {
			for (String name : new String[] { match.homeTeamName, match.awayTeamName }) {
				if (!nameToTeam.containsKey(name)) {
					nameToTeam.put(name, new Team(name, 0, 0));
				}
			}

			process(nameToTeam, match.homeTeamName, match.homeTeamGoals, match.awayTeamName, match.awayTeamGoals);
			process(nameToTeam, match.awayTeamName, match.awayTeamGoals, match.homeTeamName, match.homeTeamGoals);
		}

		return String.join(" ", nameToTeam.values().stream()
				.sorted((team1, team2) -> (team1.point != team2.point) ? Integer.compare(team2.point, team1.point)
						: Integer.compare(team2.goalDifference, team1.goalDifference))
				.limit(2).map(team -> team.name).toArray(String[]::new));
	}

	static void process(Map<String, Team> nameToTeam, String selfTeamName, int selfTeamGoals, String otherTeamName,
			int otherTeamGoals) {
		Team selfTeam = nameToTeam.get(selfTeamName);

		if (selfTeamGoals > otherTeamGoals) {
			selfTeam.point += 3;
		} else if (selfTeamGoals == otherTeamGoals) {
			selfTeam.point++;
		}

		selfTeam.goalDifference += selfTeamGoals - otherTeamGoals;
	}
}

class Match {
	String homeTeamName;
	int homeTeamGoals;
	String awayTeamName;
	int awayTeamGoals;

	Match(String homeTeamName, int homeTeamGoals, String awayTeamName, int awayTeamGoals) {
		this.homeTeamName = homeTeamName;
		this.homeTeamGoals = homeTeamGoals;
		this.awayTeamName = awayTeamName;
		this.awayTeamGoals = awayTeamGoals;
	}
}

class Team {
	String name;
	int point;
	int goalDifference;

	Team(String name, int point, int goalDifference) {
		this.name = name;
		this.point = point;
		this.goalDifference = goalDifference;
	}
}