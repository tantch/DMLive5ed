package com.tantch.dmlive.logic;

public class DAction {
	
	
	enum ActType{
		Weapon,Spell,Misc
	};
	enum DmgType{
		Slash,Piercing
	};
	
	private ActType type = ActType.Weapon;
	private String damage = "1d4+1";
	private DmgType[] dmgT;
	private boolean acAttack = true;
	private boolean savingThrow = false;
	private String description;
	
	

}
