package DataEHora;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalTime horarioAtual = LocalTime.now();
        System.out.println("Horário atual: " + horarioAtual);

        LocalDateTime dataEHorarioAtuais = LocalDateTime.now();
        System.out.println("Data e Horário Atuais: " + dataEHorarioAtuais);

        DateTimeFormatter DataHorarioFormatacao = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String DataHorarioFormatados = dataEHorarioAtuais.format(DataHorarioFormatacao);
        System.out.println("Depois da formatação: " + DataHorarioFormatados);
    }
}