package model;

public class MicrosoftOfficeSkill extends SkillSetDecorator {

	public MicrosoftOfficeSkill(EmployeeSkill skill) {
		super(skill);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSkillDescription() {
		// TODO Auto-generated method stub
		return skill.getSkillDescription() + " MS Office Skills";
	}

	@Override
	public double getSkillSetBasedSalary() {
		// TODO Auto-generated method stub
		return skill.getSkillSetBasedSalary() + 1000;
	}

}
