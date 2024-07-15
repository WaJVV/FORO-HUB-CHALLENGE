package com.WayDevv.FORO.HUB_.CHALLENGE.dto;

import java.time.format.DateTimeFormatter;

public record TopicoDTO(  String titulo,
          String mensaje,
          DateTimeFormatter fechaCreacion,
          String status,
          String autor,
          String curso,
          String respuesta) {
}
