package com.example.oulhost_backend.infra;

import com.example.oulhost_backend.enums.TipoGrupo;
import com.example.oulhost_backend.service.CodiNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CodiNameHandler {

    @Autowired
    private CodiNameService service;

    public String findCodiName(TipoGrupo tipoGrupo) {
        if(tipoGrupo == TipoGrupo.AVANGERS){
            String firstMatch = service.getAvangersCodinameList().stream().findFirst().orElseThrow();
            this.service.getAvangersCodinameList().remove(firstMatch);
            return firstMatch;
        }
        String firstMatch = service.getJusticeLeagueList().stream().findFirst().orElseThrow();
        this.service.getJusticeLeagueList().remove(firstMatch);
        return firstMatch;
    }
}
