package com.javatechnology;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class PerformerImpl implements Performer{
	private int beanbags=3;
	//private Collection<Poem> poem;
	private Map<String, Poem> poem;
	public PerformerImpl() {
		// TODO Auto-generated constructor stub
	}
	/*public PerformerImpl(int beanbags, Poem poem) {
		this.beanbags=beanbags;
		this.poem=poem;
	}*/

	@Override
	public void perform() {
		System.out.println("BEAN BAGS"+beanbags);
		/*poem.forEach(action->{
			action.work();
			
		});*/
		Set<String> keySet = poem.keySet();
		for (String string : keySet) {
			poem.get(string).work();
		}
		
	}

	public void setBeanbags(int beanbags) {
		this.beanbags = beanbags;
	}

	public void setPoem(Map<String, Poem> poem) {
		this.poem = poem;
	}
	

	/*public PerformerImpl(int beanbags, Collection<Poem> poem) {
		super();
		this.beanbags = beanbags;
		this.poem = poem;
	}

	public void setBeanbags(int beanbags) {
		this.beanbags = beanbags;
	}

	public void setPoem(Collection<Poem> poem) {
		this.poem = poem;
	}*/

}
;