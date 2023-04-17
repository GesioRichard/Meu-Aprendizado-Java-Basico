package curso_programacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculandoDatas {

	public static void main(String[] args) {
		
		LocalDate dt01 = LocalDate.parse("2023-03-18");
		LocalDateTime dt02 = LocalDateTime.parse("2023-03-18T19:10");
		Instant dt03 = Instant.parse("2023-03-18T19:10:30Z");
		
		LocalDate semanaPassadaDt01 = dt01.minusDays(7);
		LocalDate proximaSemanaDt01 = dt01.plusWeeks(1);
		
		System.out.println("dt01 semana passada: " + semanaPassadaDt01);
		System.out.println("dt01 proxima semana: " + proximaSemanaDt01);
		
		//No DateTime é possivel mudar horas, minutos e segundos, utilizando o plus e o minus
		LocalDateTime semanaPassadaDt02 = dt02.minusWeeks(1);
		LocalDateTime proximaSemanaDt02 = dt02.plusDays(7);
		
		System.out.println("dt02 semana passada: " + semanaPassadaDt02);
		System.out.println("dt02 proxima semana: " + proximaSemanaDt02);
		
		//Para mudar mês, dia e ano em uma data global é necessario chamar um unit para auxiliar
		Instant semanaPassadaDt03 = dt03.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaDt03 = dt03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("dt03 semana passada: " + semanaPassadaDt03);
		System.out.println("dt03 proxima semana: " + proximaSemanaDt03);
		
		System.out.println("----------------------------");
		
		//Calculando duração entre datas
		//Para calcular a duração precisa de um LocalDateTime. Caso seja LocalDate fazer a conversão
		Duration d01 = Duration.between(semanaPassadaDt01.atStartOfDay(), dt01.atStartOfDay());
		Duration d02 = Duration.between(semanaPassadaDt02, dt02);
		Duration d03 = Duration.between(semanaPassadaDt03, dt03);
		Duration d04 = Duration.between(dt03, semanaPassadaDt03);
		
		System.out.println("Duração entre semana passada dt01 e dt01: " + d01.toDays());
		System.out.println("Duração entre semana passada dt02 e dt03: " + d02.toHours());
		System.out.println("Duração entre semana passada dt03 e dt03: " + d03.toDays());
		System.out.println("Duração entre dt03 e semana passada dt03: " + d04.toDays());
		
	}

}
