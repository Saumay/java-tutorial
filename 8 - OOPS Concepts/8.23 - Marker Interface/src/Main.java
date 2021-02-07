/*
Marker Interface:
	- Interface with 0 methods
	- used when you need to assign permissions
	- classes that implmenent the marker interface will be allowed to call a specific method
	- Examples of marker interface
		- Serializable
		- Remote
*/

interface P 
{
}


class Demo implements P {
	void show() {
		System.out.println("Hello");
	}
}

class Main {
	public static void main(String[] args) {
		Demo demo = new Demo();
		if(demo instanceof P) {
			demo.show();
		}
		else {
			System.out.println("No Permissions");
		}
	}
}