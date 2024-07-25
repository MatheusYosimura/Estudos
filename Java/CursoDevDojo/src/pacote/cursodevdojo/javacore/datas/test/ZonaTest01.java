package pacote.cursodevdojo.javacore.datas.test;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.OffsetDateTime;
import java.util.Map;

public class ZonaTest01 {

	public static void main(String[] args) {
		Map<String, String> shortId = ZoneId.SHORT_IDS;
		System.out.println(shortId);

		ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
		
		LocalDateTime ldt = LocalDateTime.now();
		ZonedDateTime ldtZoned = ldt.atZone(tokyoZone);
		System.out.println(ldt+"\n"+ldtZoned);
		
		Instant inst = Instant.now();
		ZonedDateTime instZoned = inst.atZone(tokyoZone);
		System.out.println(inst+"\n"+instZoned);
		
		ZoneOffset zosBrasil = ZoneOffset.of("-03:00");
		OffsetDateTime osBrasil = ldt.atOffset(zosBrasil);
		System.out.println(ldt+"\n"+osBrasil);
		
		OffsetDateTime instBrasil = inst.atOffset(zosBrasil);
		System.out.println(inst+"\n"+instBrasil);
	}

}
