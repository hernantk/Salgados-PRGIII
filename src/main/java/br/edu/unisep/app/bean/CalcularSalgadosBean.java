package br.edu.unisep.app.bean;

import br.edu.unisep.app.domain.dto.CalcularSalgadosDto;
import br.edu.unisep.app.domain.usecase.CalcularSalgadosUseCase;
import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
@Getter
@Setter
public class CalcularSalgadosBean {
    private Double valor=0d;
    private CalcularSalgadosDto salgados =new CalcularSalgadosDto();
    private CalcularSalgadosUseCase salgadosUseCase= new CalcularSalgadosUseCase();

    public void calcular(){
        valor=salgadosUseCase.calcular(salgados);
    }
    public void limpar(){
        salgados=new CalcularSalgadosDto();
        salgadosUseCase=null;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public CalcularSalgadosDto getSalgados() {
        return salgados;
    }

    public void setSalgados(CalcularSalgadosDto salgados) {
        this.salgados = salgados;
    }

    public CalcularSalgadosUseCase getSalgadosUseCase() {
        return salgadosUseCase;
    }

    public void setSalgadosUseCase(CalcularSalgadosUseCase salgadosUseCase) {
        this.salgadosUseCase = salgadosUseCase;
    }
}
