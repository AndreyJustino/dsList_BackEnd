package com.andreyjustino.dslist.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReplacementDTO {

    @NotBlank(message = "O campo (sourceIndex) não pode ser vazio")
    private int sourceIndex;

    @NotBlank(message = "O campo (destinationIndex) não pode ser vazio")
    private int destinationIndex;
}
