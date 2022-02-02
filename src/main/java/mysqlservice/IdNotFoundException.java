package mysqlservice;

public class IdNotFoundException extends Exception{
	IdNotFoundException(){
		
	}
	IdNotFoundException(String str){
		System.out.println(str);
	}

}
