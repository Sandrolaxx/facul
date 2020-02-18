package TrabalhoBoletim;

import java.util.Scanner;

public class Notas {

	public static void Notas(){
		String Materia[] = new String[7];
		float Nota1[] = new float [7];
		float Nota2[] = new float [7];
		float media[] = new float [7];
        float validar;
        String Passar[] = new String [7];
        
		
        Scanner MateriaEscolida = new Scanner(System.in);
        Scanner nota = new Scanner(System.in);
        
        

        for (int i = 1; i < 7; i++) {
        	System.out.println("Informe a " + i + "º materia:");
            Materia[i] = MateriaEscolida.nextLine();
            
            System.out.println("Informe valor da nota do primeiro bimestre desta matéria:");
            Nota1[i] = nota.nextFloat();
            System.out.println("Informe valor da nota do segundo bimestre desta matéria:");
            Nota2[i] = nota.nextFloat();
           
            Validacao validacao= new Validacao();
            validar =  validacao.validarNota(Nota1[i], Nota2[i]);
            
            Calculo calculo= new Calculo();
            media[i] = calculo.Media(Nota1[i], Nota2[i]);
            
            Calculo passar= new Calculo();
            Passar[i] = calculo.AprovadoReprovado(media[i]);
            
		}
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("|--------------------------BOLETIM----------------------------|");
        System.out.println("|-------------------------------------------------------------|");
        System.out.println("| A materia de " + Materia[1] + ", o aluno ficou com media " + media[1] + " e foi " + Passar[1] + " |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("| A materia de " + Materia[2] + ", o aluno ficou com media " + media[2] + " e foi " + Passar[2] + " |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("| A materia de " + Materia[3] + ", o aluno ficou com media " + media[3] + " e foi " + Passar[3] + " |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("| A materia de " + Materia[4] + ", o aluno ficou com media " + media[4] + " e foi " + Passar[4] + " |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("| A materia de " + Materia[5] + ", o aluno ficou com media " + media[5] + " e foi " + Passar[5] + " |");
        System.out.println("---------------------------------------------------------------");
        System.out.println("| A materia de " + Materia[6] + ", o aluno ficou com media " + media[6] + " e foi " + Passar[6] + " |");
        System.out.println("|-------------------------------------------------------------|");
	}
}
  class Validacao{
	 public float validarNota(float Nota1, float Nota2) {
		 Scanner nota = new Scanner(System.in);
		 while((Nota1 < 0 ) || (Nota1 > 10 ) || ( Nota2 > 10) || ( Nota2 < 0)) {
		 
		 	if(Nota1<0){ 
				System.out.println("A nota não pode ser menor que zero!");
				System.out.println("Informe primeiro valor:");
		        Nota1 = nota.nextFloat();
				break;
			}
		 	if(Nota2>10){
				System.out.println("A nota não pode ser maior que dez !");
		        System.out.println("Informe segundo valor:");
		        Nota2 = nota.nextFloat();
				break;
		 	}
		 	if(Nota1>10){ 
				System.out.println("A  nota não pode ser mmaior que dez!");
				System.out.println("Informe primeiro valor:");
		        Nota1 = nota.nextFloat();
				break;
			}
		 	if(Nota2<0){
				System.out.println("A nota não pode ser menor que zero!8");
		        System.out.println("Informe segundo valor:");
		        Nota2 = nota.nextFloat();
				break;
			}
		 }
		 return 0;
		 }
 }
 
  class Calculo{
        	public float Media(float Nota1, float Nota2) {
        		float media;
        		media = ((Nota1 + Nota2) / 2);
        		return media;
        	}
        	
        	public String AprovadoReprovado(float media)
        	{
        		String temp="";
        		
        		if(media>=7){
        			temp = "Aprovado";
        		}
        		if(media<7 && media>=4){
        			temp = "Exame";
       			
       		}
        		if(media<4){
        			temp = "Reprovado";
       		}
        		       		
        		return temp;
			}
        	
  }
