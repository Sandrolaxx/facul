package ProgramasUteis;
import java.time.LocalTime;
//Timer que executa a aplicação por 10 segundos, está que está ligada a hora do computador,
//após o tempo acabar a aplicação se encerra.


public class TimerParaProgramas {
	public static void main(String[] args) {
		LocalTime tot;
		LocalTime agora = LocalTime.now();//A magia do LocalTime.now, metodo que pega horario atual, com isso atribuimos seu valor a uma variavel.
		
		tot = agora.plusSeconds(10);//Em outra variavel pegamos o horario atual e inserimos mais 10 segundos a nele.
		
		while (!tot.equals(LocalTime.now())) {//enquanto o horario atual não for igual ao horario atual e mais 10 segundo a aplicação ira funcionar
					System.out.println(LocalTime.now());//Printando a hora atual					
		}
		System.out.println("O tempo acabou! Programa encerrado!");
	}
}
