public class RoleBuilder {
	private static String roles[] = { "UNDEFINED", "DEVELOPER", "TEST_ENGINEER", "SR_DEVELOPER", "DESIGNER" };

	public static String getRoleDescription(int roleId) {
		if(roleId <0 || roleId > roles.length-1)
			roleId = 0;

		return roles[roleId];
	}
}
