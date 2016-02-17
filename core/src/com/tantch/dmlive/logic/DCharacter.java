package com.tantch.dmlive.logic;

import java.util.ArrayList;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class DCharacter {

	private String name;
	private String realName;

	private DClass dclass;
	private DRace drace;
	private int level = 1;
	private int crHp = 10;
	private int tempHp = 0;
	private int maxHp = 10;
	private int exp = 0;
	// Ability Scores
	private int strength = 5;
	private int dexterity = 5;
	private int constitution = 5;
	private int intelligence = 5;
	private int wisdom = 5;
	private int charisma = 5;

	private int speed = 30;
	private int passiveWisdom = 12;
	private int proficiencyBonus = 2;
	private int init = 0;
	private int ac = 15;

	private int deathSaves = 0;
	private int deathFails = 0;

	private int curStealth = 0;
	private boolean strP = false, dexP = false, consP = false, intP = false, wisP = false, chaP = false, acroP = false,
			anhaP = false, arcP = false, athP = false, decP = false, hisP = false, insP = false, intiP = false,
			inveP = false, medP = false, natP = false, percP = false, perfP = false, persP = false, relP = false,
			slhP = false, steP = false, survP = false;

	private ArrayList<DAction> actions;

	public DCharacter(String rname,String name) {
		
		this.name=name;
		this.realName=rname;
		
	}
	
	private int toModifier(int vl){
		return (vl-10)/2;
	}

	public String getName() {
		return name;
	}

	public String getRName() {
		return realName;
	}

	public int getLevel() {
		return level;
	}

	public String getHpString() {
		return this.crHp + "/"+ this.maxHp + "("+ this.tempHp +")";
	}

	public int getAC() {
		return ac;
	}

	public int getPP() {
		// TODO Auto-generated method stub
		return passiveWisdom;
	}

	public int getInit() {
		
		return init;
	}
	public int getStealth() {
		
		return curStealth;
	}
	
	
	

}
