package curso_programacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		//Alterando o formato no qual é inserida a data
		DateTimeFormatter dFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		//Instanciando datas e horas
		LocalDate dt01 = LocalDate.now();
		LocalDateTime dt02 = LocalDateTime.now();
		Instant dt03 = Instant.now();//Data e hora global
		
		////Criando um obj de data passando uma string no formato UTC, GMT, ZULU
		LocalDate dt04 = LocalDate.parse("2023-03-18");
		LocalDateTime dt05 = LocalDateTime.parse("2023-03-18T12:30:45");
		Instant dt06 = Instant.parse("2023-03-18T12:30:45Z");//Utilizando Zulu Time
		Instant dt07 = Instant.parse("2023-03-18T12:30:45-03:00");//Utilizando o padrão GMT
		
		//Criando um obj de data passando uma data com um formato diferente
		LocalDate dt08 = LocalDate.parse("08/05/2004", dFmt);
		LocalDateTime dt09 = LocalDateTime.parse("08/05/2004 04:20:45", dtFmt);
		
		////Criando um obj de data passando as informações separadas
		LocalDate dt10 = LocalDate.of(2022, 03, 18);
		LocalDateTime dt11 = LocalDateTime.of(2022, 03, 18, 00, 45, 30);

		System.out.println("Data Local: " + dt01);
		System.out.println("Data e hora Local: " + dt02);
		System.out.println("Data e hora no fuso de londres: " + dt03);
		System.out.println("Data criada a partir de um texto no formato ISO8601: " + dt04);
		System.out.println("Data e hora criada a partir de um texto no formato ISO8601: " + dt05);
		System.out.println("Data e hora global criada a partir de um texto no formato ISO8601: " + dt06);
		System.out.println("Data e hora global criada a partir de um texto no formato ISO8601: " + dt07);
		System.out.println("Data personalizada com DateTimeFormatter: " + dt08);
		System.out.println("Data e hora personalizada com DateTimeFormatter: " + dt09);
		System.out.println("Data passando cada informação separada: " + dt10);
		System.out.println("Data e hora passando cada informação separada: " + dt11);
	}

}
