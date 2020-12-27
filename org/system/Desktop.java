package org.system;

public class Desktop extends Computer{
	/*Assignment1:
		==========
		Package   :org.system
		Class        :Computer
		Methods   :computerModel()
        Class        :Desktop
		Methods   :desktopSize()
      Description:
		create above 2 class and call all your class methods into the Desktop using single inheritance.*/
	
	public void desktopSize() {
		System.out.println("Size is 35 inch");
	}
	
   public static void main(String[] args) {
	   Desktop obj = new Desktop();
	   obj.computerModel();
	   obj.desktopSize();	

	}

}
