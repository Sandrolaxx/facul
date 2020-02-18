package ProgramasUteis;
import java.time.LocalTime;
//Timer que executa a aplica��o por 10 segundos, est� que est� ligada a hora do computador,
//ap�s o tempo acabar a aplica��o se encerra.


public class TimerParaProgramas {
	public static void main(String[] args) {
		LocalTime tot;
		LocalTime agora = LocalTime.now();//A magia do LocalTime.now, metodo que pega horario atual, com isso atribuimos seu valor a uma variavel.
		
		tot = agora.plusSeconds(10);//Em outra variavel pegamos o horario atual e inserimos mais 10 segundos a nele.
		
		while (!tot.equals(LocalTime.now())) {//enquanto o horario atual n�o for igual ao horario atual e mais 10 segundo a aplica��o ira funcionar
					System.out.println(LocalTime.now());//Printando a hora atual					
		}
		System.out.println("O tempo acabou! Programa encerrado!");
	}
}
