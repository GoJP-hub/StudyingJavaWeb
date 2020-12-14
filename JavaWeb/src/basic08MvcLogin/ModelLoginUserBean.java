package basic08MvcLogin;

import java.io.Serializable;

/*********************************************
Description--Model class for defining the data model (Data-access-object)
@author go.hirano
 **********************************************/
public class ModelLoginUserBean implements Serializable {
	private static final long serialVersionUID = 1L;

	/*********************************************
	Description--Set a variables for user
	@author go.hirano
	 **********************************************/
	private String id = "";
	private String name = "";
	private int age = 0;

	/*********************************************
	Description--Initialize the User object
	@author go.hirano
	 **********************************************/
	public ModelLoginUserBean() {
		// TODO 自動生成されたコンストラクター・スタブ
		this.id="";
		this.name="";
		this.age=0;
	}

	/*********************************************
	Description--Getter and Setter for variables
	@author go.hirano
	@param id
	@return id

	@param name
	@return name

	@param age
	@return age
	 **********************************************/
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
