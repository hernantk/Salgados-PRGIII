package br.edu.unisep.app.domain.usecase;

import br.edu.unisep.app.domain.dto.CalcularSalgadosDto;

public class CalcularSalgadosUseCase {

    private static final double ACRESCIMO_20 = 1.2;
    private static final double VALOR_COXINHA = 0.10;
    private static final double VALOR_RIZOLIS = 0.10;
    private static final double VALOR_KIBE = 0.15;
    private static final double VALOR_SANDUICHE = 0.18;
    private static final double VALOR_HOTDOG = 0.22;
    private static final double VALOR_MINIPIZZA = 0.20;

    public Double calcular(CalcularSalgadosDto salgados){
         double total;
         total = salgados.getQtdCoxinhas()* VALOR_COXINHA+
                 salgados.getQtdRizolis()* VALOR_RIZOLIS+
                 salgados.getQtdKibe()* VALOR_KIBE+
                 salgados.getQtdSanduiche()* VALOR_SANDUICHE+
                 salgados.getQtdHotDog()* VALOR_HOTDOG+
                 salgados.getQtdMiniPizza()* VALOR_MINIPIZZA;
        if (salgados.isDecoracao()){
            return total*ACRESCIMO_20;
        }
        return total;
    }
}
