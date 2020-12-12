package basic05MvcModel;

/*********************************************
Description--Model class: Processing data
@author go.hirano
**********************************************/
public class ModelIdProcessing {
	/*********************************************
	Description--Process data based on Request.
	@author go.hirano
	@param id
	@return ユーザ情報(bean)
	 **********************************************/
	public ModelUserBean getUserInfoById(String id) {

		ModelUserBean bean = new ModelUserBean();

		/*********************************************
		Description--Assert by request value: ID
		@author go.hirano
		 **********************************************/
		if("Sample1".equals(id)) {
			bean.setId(id);
			bean.setName("Mr. Sample");
			bean.setAge(27);
		}else if("Sample2".equals(id)){
			bean.setId(id);
			bean.setName("Mrs. Sample");
			bean.setAge(24);
		}else {
			bean=null;
		}
		return bean;
	}
}
