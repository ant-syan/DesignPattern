package model;

public abstract class SkillSetDecorator implements EmployeeSkill {

	public EmployeeSkill skill;
	
	public SkillSetDecorator(EmployeeSkill skill) {
		this.skill = skill;
	}
	public String getSkillDescription() {
		return skill.getSkillDescription();
	}
	public double getSkillSetBasedSalary () {
		return skill.getSkillSetBasedSalary();
	}

}
