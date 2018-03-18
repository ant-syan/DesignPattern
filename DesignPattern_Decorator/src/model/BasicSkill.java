package model;

public class BasicSkill implements EmployeeSkill {

	@Override
	public String getSkillDescription() {
		// TODO Auto-generated method stub
		return "Basic Employee Skills";
	}

	@Override
	public double getSkillSetBasedSalary() {
		// TODO Auto-generated method stub
		return 500;
	}

}
