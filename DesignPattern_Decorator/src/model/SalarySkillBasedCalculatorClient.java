package model;

public class SalarySkillBasedCalculatorClient {

	public static void main (String args[]) {
		EmployeeSkill skills[] = new EmployeeSkill[5];
		
		skills[0] = new BasicSkill();
		skills[1] = new MicrosoftOfficeSkill (new BasicSkill());
		skills[2] = new JavaSkill (new MicrosoftOfficeSkill (new BasicSkill()));
		skills[3] = new JavaSkill (new SmalltalkSkill (new BasicSkill()));
		skills[4] = new SmalltalkSkill (new JavaSkill (new MicrosoftOfficeSkill (new BasicSkill())));
		
		for (int i = 0; i < skills.length; i++) {
			System.out.println ("Skill Description: " + skills[i].getSkillDescription());
			System.out.println ("Skill Salary: " + skills[i].getSkillSetBasedSalary());
		}
	}
}
