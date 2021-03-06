package com.uillianhenrique.bookstoramanager.dto;

import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

        private Long id;

        @NotBlank
        @Size(max = 200)
        private String name;

        @NotNull
        @Max(100)
        private Integer age;
}