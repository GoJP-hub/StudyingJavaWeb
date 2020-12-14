package basic08MvcLogin;

/*********************************************
Description--Model class for setting the User Data
@author go.hirano
 **********************************************/
public class ModelLogin {
	/*********************************************
	Description--Assess Login Details and return adequate UserBean
	@author go.hirano
	 **********************************************/
	public ModelLoginUserBean loginByUserId(String id, String password) {
		ModelLoginUserBean bean = new ModelLoginUserBean();

		if("Sample01".equals(id) && "password01".equals(password)){
			bean.setId(id);
			bean.setName("Mr. Sample");
			bean.setAge(27);
		}else if("Sample02".equals(id) && "password02".equals(password)) {
			bean.setId(id);
			bean.setName("Mrs. Sample");
			bean.setAge(24);
		}else {
			bean = null;
		}
		return bean;
	}
}
