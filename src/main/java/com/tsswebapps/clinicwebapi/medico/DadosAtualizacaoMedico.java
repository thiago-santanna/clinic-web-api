package com.tsswebapps.clinicwebapi.medico;

import com.tsswebapps.clinicwebapi.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String telefone,
        String nome,
        DadosEndereco dadosEndereco
) {
}
