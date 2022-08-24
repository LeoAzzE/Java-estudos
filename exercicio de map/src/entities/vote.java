package entities;

public class vote {
	private String name;
	private Integer vote;
	
	public vote(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}
	
	
}
