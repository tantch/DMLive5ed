package com.tantch.dmlive.logic;

import java.util.ArrayList;
import java.util.HashMap;

public class Adventure {

	private HashMap<String, DCharacter> pcs;
	private HashMap<String, DCharacter> npcs;
	private String title;
	
	public Adventure(){
		
		pcs = new HashMap<String, DCharacter>();
		npcs = new HashMap<String, DCharacter>();
		title= "o joao falso";
		pcs.put("Nosrep Drib",new DCharacter("Psy", "Nosrep Drib"));
		pcs.put("Theren Galanodel",new DCharacter("Arturi", "Theren Galanodel"));
		pcs.put("Warryn Daergel",new DCharacter("Betao", "Warryn Daergel"));
		pcs.put("Under Score",new DCharacter("Minja", "Under Score"));
		pcs.put("Pirikita",new DCharacter("Pife", "Pirikita"));
		pcs.put("Rhogar",new DCharacter("Ze", "Rhogar"));
		pcs.put("Arlindo Tempestade",new DCharacter("Zoid", "Arlindo Tempestade"));

		
		npcs.put("Sem Abrigadeiro",new DCharacter("Sem Abrigadeiro", "Joao o morto"));
		
	}

	public String getTitle() {
		return title;
	}

	public HashMap<String, DCharacter> getPcs() {
		return pcs;
	}
	
	
}
