package hr;

public class EmployeeVo {
	private Long _no;
	private String _birhDate;
	private String _firstName;
	private String _lastName;
	private String _gender;
	private String _hireDate;
	
	public Long getNo() {
		return _no;
	}




	public void setNo(Long _no) {
		this._no = _no;
	}




	public String getBirhDate() {
		return _birhDate;
	}




	public void setBirhDate(String _birhDate) {
		this._birhDate = _birhDate;
	}




	public String getFirstName() {
		return _firstName;
	}




	public void setFirstName(String _firstName) {
		this._firstName = _firstName;
	}




	public String getLastName() {
		return _lastName;
	}




	public void setLastName(String _lastName) {
		this._lastName = _lastName;
	}




	public String getGender() {
		return _gender;
	}




	public void setGender(String _gender) {
		this._gender = _gender;
	}




	public String getHireDate() {
		return _hireDate;
	}




	public void setHireDate(String _hireDate) {
		this._hireDate = _hireDate;
	}


	
	
	
	
	@Override
	public String toString() {
		return "EmployeeVo [_no=" + _no + ", _birhDate=" + _birhDate + ", _firstName=" + _firstName + ", _lastName="
				+ _lastName + ", _gender=" + _gender + ", _hireDate=" + _hireDate + "]";
	}




	public EmployeeVo() {
		
	}
}
