package basic05MvcModel;

import java.io.Serializable;

/*********************************************
Description--Model class: Alternative/simplified codes for DAO
@author go.hirano
**********************************************/
public class ModelUserBean implements Serializable{
	/*********************************************
	Description--Declearing the variables used for this ModelUserBean
	@author go.hirano
	 **********************************************/
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private int age;

	/*********************************************
	Description--Constant used to initialize (nullify) the variables
	@author go.hirano
	 **********************************************/
	public ModelUserBean() {
		this.id = "";
		this.name = "";
		this.age = 0;
	}

	/*********************************************
	Description--Setter and Getter for the defined variables
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
