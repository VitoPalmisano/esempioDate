package it.polito.tdp.esempioDate;

import java.time.*;

public class esempio {

	public static void main(String[] args) {
		
		LocalDate mio = LocalDate.of(1998, 1, 18);
		LocalDate tonio = LocalDate.of(2004, 2, 10);
		LocalDate mum = LocalDate.of(1965, 6, 7);
		LocalDate dad = LocalDate.of(1964, 8, 25);
		
		System.out.println(mio.getDayOfWeek());
		System.out.println(tonio.getDayOfWeek());
		System.out.println(mum.getDayOfWeek());
		System.out.println(dad.getDayOfWeek());
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime zona = ZonedDateTime.of(now, ZoneId.of("+4"));
		System.out.println(zona);
		
		System.out.println("La mia eta' e': "+Period.between(mio, now.toLocalDate()));
		System.out.println("L'eta' di mamma e': "+Period.between(mum, now.toLocalDate()));
		
		LocalDate cMum = LocalDate.of(2020, 6, 7);
		System.out.println("Mancano al compleanno di mamma: "+Period.between(cMum, now.toLocalDate()));
		
		System.out.println("Al compleanno di Mariana mancano: "+Period.between(now.toLocalDate(), LocalDate.of(2020, 7, 14)));
		// NON POSSO trasformare la quantita' 1M (1 mese) in giorni, perche' non posso sapere se il mese sia da 30, 31, 28 o 29 giorni
		// Stessa cosa per 1Y (1 anno), non sapendo se sia bisestile o meno
		
		// Diverso e' per ore minuti e secondi
		// 1H conterra' sempre 60M e 3600S
		LocalTime inizio = LocalTime.of(10, 15);
		LocalTime fine = LocalTime.of(20, 00);
		Duration turnoTotale = Duration.between(inizio, fine);
		System.out.println("Il turno lavorativo completo dura: "+turnoTotale);
		System.out.println("Ci sono tot ore di pausa durante la giornata: "+turnoTotale.minus(Duration.ofHours(8)));
		
	}

}
