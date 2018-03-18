package model;

public class JavaSkill extends SkillSetDecorator {

	public JavaSkill(EmployeeSkill skill) {
		super(skill);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getSkillDescription() {
		// TODO Auto-generated method stub
		return skill.getSkillDescription() + " Java Skills";
	}

	@Override
	public double getSkillSetBasedSalary() {
		// TODO Auto-generated method stub
		return skill.getSkillSetBasedSalary() + 2000;
	}

}
