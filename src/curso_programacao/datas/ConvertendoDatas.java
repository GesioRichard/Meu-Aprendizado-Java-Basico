package curso_programacao.datas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConvertendoDatas {

	public static void main(String[] args) {
		
		LocalDate dt01 = LocalDate.parse("2023-03-18");
		LocalDateTime dt02 = LocalDateTime.parse("2023-03-18T12:30:45");
		Instant dt03 = Instant.parse("2023-03-18T12:30:45Z");//Utilizando Zulu Time
		
		DateTimeFormatter dtFmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter dtFmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//Para formatar Data e hora global é necessário especificar a zona/timezone/fuso
		//ZoneID.systemDefault(); pega o fuso do sistema local
		DateTimeFormatter dtFmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		//Utilizando formatos ISO predefinidos
		DateTimeFormatter dtFmt4 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dtFmt5 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("Data convertida para um formato personalizado: " + dt01.format(dtFmt));
		System.out.println("Data e hora convertida para um formato personalizado: " + dt02.format(dtFmt2));
		//Data e hora global(Instant) não possui o método "format"
		//por isso para alterar ele precisa chamar a classe DateTimeFormatter e passar ele no metodo format
		System.out.println("Data e hora global convertida para um formato personalizado: " + dtFmt3.format(dt03));
		
		System.out.println("Data convertida para um formato predefinido: " + dt02.format(dtFmt4));
		System.out.println("Data convertida para um formato personalizado: " + dtFmt5.format(dt03));
		
		System.out.println("----------------------------");
		
		//Convertendo data global(Instant) em data local
		LocalDate d01 = LocalDate.ofInstant(dt03, ZoneId.systemDefault());
		LocalDateTime d02 = LocalDateTime.ofInstant(dt03, ZoneId.systemDefault());
		
		System.out.println("Data global convertida para local: " + d01);
		System.out.println("Data e hora global convertida para local: " + d02);
		
		System.out.println("----------------------------");
		
		//Coletando as informações das datas de maneira separada
		System.out.println("Dia da data: " + d02.getDayOfMonth());
		System.out.println("Mês da data: " + d02.getMonthValue());
		System.out.println("Ano da data: " + d02.getYear());
		System.out.println("Hora da data: " + d02.getHour());
		System.out.println("Minuto da data: " + d02.getMinute());
		System.out.println("Segundo da data: " + d02.getSecond());
	}

}
