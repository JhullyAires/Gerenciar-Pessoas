package br.com.gerenciarPessoas.gerenciarpessoas.modulos.status;

import br.com.gerenciarPessoas.gerenciarpessoas.modulos.status.StatusDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusRest implements StatusApi {

    @GetMapping(value = "/status")
    @Override
    public ResponseEntity<StatusDTO> getStatus(){
        StatusDTO statusDTO = new StatusDTO();
        return ResponseEntity.ok().body(statusDTO);
    }
}