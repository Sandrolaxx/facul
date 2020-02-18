import java.util.Scanner;

public class Notas {

	public static void main(String[] args) 
	{
		int Materia;
		double Nota1;
        double Nota2;
        double media;
        double validar;
		
        Scanner nota = new Scanner(System.in);
        System.out.println("Informe primeiro valor:");
        Nota1 = nota.nextInt();
        System.out.println("Informe segundo valor:");
        Nota2 = nota.nextInt();
       
        Validacao validacao= new Validacao();
        validar =  validacao.validarNota(Nota1, Nota2);
        
        Calculo calculo= new Calculo();
        media = calculo.Media(Nota1, Nota2);
        System.out.println("As notas foram" + media);
        
	}

}
  class Validacao{
	 public double validarNota(double Nota1, double Nota2) {
		 while((Nota1 < 0 ) || (Nota1 > 10 ) || ( Nota2 > 10) || ( Nota2 < 0))
		 
		 	if(Nota1<0 || Nota2<0){ 
				System.out.println("Nota digitada Invalida");
			}
		 	if(Nota1<0 || Nota2>10){
				System.out.println("Nota digitada Invalida");
			}
		 	if(Nota1>10 || Nota2<0){ 
				System.out.println("Nota digitada Invalida");
			}
		 	if(Nota1>10 || Nota2>10){
				System.out.println("Nota digitada Invalida");
			}
		 	return 0;
	 }
 }
 
  class Calculo{
        	public double Media(double Nota1, double Nota2) {
        		double media;
        		media = ((Nota1 + Nota2) / 2);
        		return media;
        	
	}
  }