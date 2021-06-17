
public class FizzBuzz {
	  public String fizzBuzz(int numero) {
	
		  String retorno="";

		  if(numero%3==0 && numero%5==0){
			  retorno ="FizzBuzz";
		  }

		  else if(numero%3==0){
		      retorno ="Fizz";
		  }
		  
		  else if(numero%5==0){		      
		      retorno ="Buzz";
		  }
		  
		  else{
		      retorno += numero;
		  }
		  
	  return retorno;
	    }
}