public class EncapsulationDemo {
	public static void main(String[] args) {
		Emp e1 = new Emp();
		
		//e1.empId = 3;
		e1.setEmpId(3);
		System.out.println(e1.getEmpId());
	}
}

class Emp {
	private int empId;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}
}

/*
Variables should be private
Getters/setters should be public
*/
