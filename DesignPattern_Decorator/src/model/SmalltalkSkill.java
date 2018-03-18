package model;

public class SmalltalkSkill extends SkillSetDecorator {

	public SmalltalkSkill(EmployeeSkill skill) {
		super(skill);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSkillDescription() {
		// TODO Auto-generated method stub
		return skill.getSkillDescription() + " Smalltalk Skills";
	}

	@Override
	public double getSkillSetBasedSalary() {
		// TODO Auto-generated method stub
		return skill.getSkillSetBasedSalary() + 3000;
	}

}
