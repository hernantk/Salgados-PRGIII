package br.edu.unisep.app.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalcularSalgadosDto {
    private Integer qtdCoxinhas = 0;
    private Integer qtdRizolis = 0;
    private Integer qtdKibe = 0;
    private Integer qtdSanduiche = 0;
    private Integer qtdHotDog = 0;
    private Integer qtdMiniPizza = 0;
    private boolean Decoracao = false;

    public Integer getQtdCoxinhas() {
        return qtdCoxinhas;
    }

    public void setQtdCoxinhas(Integer qtdCoxinhas) {
        this.qtdCoxinhas = qtdCoxinhas;
    }

    public Integer getQtdRizolis() {
        return qtdRizolis;
    }

    public void setQtdRizolis(Integer qtdRizolis) {
        this.qtdRizolis = qtdRizolis;
    }

    public Integer getQtdKibe() {
        return qtdKibe;
    }

    public void setQtdKibe(Integer qtdKibe) {
        this.qtdKibe = qtdKibe;
    }

    public Integer getQtdSanduiche() {
        return qtdSanduiche;
    }

    public void setQtdSanduiche(Integer qtdSanduiche) {
        this.qtdSanduiche = qtdSanduiche;
    }

    public Integer getQtdHotDog() {
        return qtdHotDog;
    }

    public void setQtdHotDog(Integer qtdHotDog) {
        this.qtdHotDog = qtdHotDog;
    }

    public Integer getQtdMiniPizza() {
        return qtdMiniPizza;
    }

    public void setQtdMiniPizza(Integer qtdMiniPizza) {
        this.qtdMiniPizza = qtdMiniPizza;
    }

    public boolean isDecoracao() {
        return Decoracao;
    }

    public void setDecoracao(boolean decoracao) {
        Decoracao = decoracao;
    }
}