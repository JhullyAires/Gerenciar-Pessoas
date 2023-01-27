package br.com.gerenciarPessoas.gerenciarpessoas.modulos.status;

import br.com.gerenciarPessoas.gerenciarpessoas.modulos.status.StatusDTO;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.springframework.http.ResponseEntity;

public interface StatusApi {

    @APIResponses({
            @APIResponse(responseCode = "200", description = "Api Ok"),
            @APIResponse(responseCode = "404", description = "Api não encontrada"),
            @APIResponse(responseCode = "401", description = "Api sem permissão"),
    })

    ResponseEntity<StatusDTO> getStatus();
}