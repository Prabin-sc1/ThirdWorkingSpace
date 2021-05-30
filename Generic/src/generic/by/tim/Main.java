package generic.by.tim;

//July 28 8:00 AM
//arrayList is generic type
//generic was explored after 1.5
public class Main {
	public static void main(String[] args) {
//		FootballPlayer joe = new FootballPlayer("Joe");
//		FootballPlayer joee = new FootballPlayer("Joe");
//		FootballPlayer joa = new FootballPlayer("Joe");
//		FootballPlayer joya = new FootballPlayer("Joe");
//
//		FootballPlayer john = new FootballPlayer("Joe");
//		FootballPlayer johny = new FootballPlayer("Joe");
//
//		BaseballPlayer pat = new BaseballPlayer("Pat");
//		BasketballPlayer bas = new BasketballPlayer("Bas");
//
//		Team<FootballPlayer> real = new Team<>("Real Madrid");
//		real.addPlayer(joya);
//		real.addPlayer(joa);
//		Team<FootballPlayer> barca = new Team<>("Barcelona");
//		barca.addPlayer(joe);
//		barca.addPlayer(joee);
//
//		Team<FootballPlayer> chelsea = new Team<>("Chelsea");
//		chelsea.addPlayer(john);
//		chelsea.addPlayer(johny);
//
//		real.matchResult(barca, 4, 5);
//		real.matchResult(chelsea, 5, 2);
//
//		chelsea.matchResult(barca, 1, 4);
//
//		System.out.println("Rankings:");
//		System.out.println(real.getName() + ":" + real.ranking());
//		System.out.println(barca.getName() + ":" + barca.ranking());
//		System.out.println(chelsea.getName() + ":" + chelsea.ranking());
//		
//		System.out.println(barca.compareTo(chelsea));
//		System.out.println(chelsea.compareTo(real));
//		System.out.println(real.compareTo(barca));
		League<Team<FootballPlayer>> footballLeague = new League<>("SAARC");
		Team<FootballPlayer> real = new Team<>("Real Madrid");
		Team<FootballPlayer> chelsea = new Team<>("Chelsea");
		Team<FootballPlayer> barca = new Team<>("Barcelona");
		Team<FootballPlayer> juv = new Team<>("Juventus");
		
		real.matchResult(barca, 4, 5);
		real.matchResult(chelsea, 5, 2);

		chelsea.matchResult(barca, 1, 4);
		real.matchResult(chelsea, 1, 2);

		chelsea.matchResult(barca, 9, 4);
		footballLeague.addTeam(juv);
		footballLeague.addTeam(barca);
		footballLeague.addTeam(chelsea);
		footballLeague.addTeam(real);
		
		footballLeague.showLeagueTable();
		
		

	}

}
