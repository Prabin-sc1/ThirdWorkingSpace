package generic;

import java.util.ArrayList;

public class Group<T extends Student> implements Comparable<Group<T>>{
	private String name;
	private int played=0;
	private int won=0;
	private int tied=0;
	private int lost=0;	
	
	private ArrayList<T> group = new ArrayList<>();
	
	public Group(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean addStudent(T student) {
		if(group.contains(student)) {
			System.out.println(student.getName()+" was already in your group");
			return false;
		}else {
			group.add(student);
			return true;
		}
	}
	
	public int noOfStudent() {
		return group.size();
	}
	
	public void result(Group<T>opponent,int teamOneScore,int anotherTeamScore) {
	   String message;
	   if(teamOneScore > anotherTeamScore) {
		   won++;
		   message=" beat ";
	   }else if(teamOneScore == anotherTeamScore) {
		   tied++;
		   message=" drew with ";
	   }else {
		   lost++;
		   message=" lost by ";
	   }
	   played++;
	   
	   if(opponent != null) {
		   System.out.println(this.getName()+message+opponent.getName());
		   opponent.result(null, teamOneScore, anotherTeamScore);
		   
		   
	   }
	}
	
	public int ranking() {
		return (won*2)+tied;
	}

	@Override
	public int compareTo(Group<T> team) {
	  if(this.ranking() > team.ranking()) {
		  return -1;
	  }else if(this.ranking() < team.ranking()) {
		  return 1;
	  }else {
		  return 0;
	  }
	}
	
	
	

}
