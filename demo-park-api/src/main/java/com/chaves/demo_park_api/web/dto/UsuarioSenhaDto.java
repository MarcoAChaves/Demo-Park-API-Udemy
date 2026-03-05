package com.chaves.demo_park_api.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UsuarioSenhaDto {

    @NotBlank
    @Size(min = 6, max = 6)
    //@Pattern(regexp = "^\\S+$")
    private String senhaAtual;
    @NotBlank
    @Size(min = 6, max = 6)
   // @Pattern(regexp = "^\\S+$")
    private String novaSenha;
    @NotBlank
    @Size(min = 6, max = 6)
    //@Pattern(regexp = "^\\S+$")
    private String confirmaSenha;
}
