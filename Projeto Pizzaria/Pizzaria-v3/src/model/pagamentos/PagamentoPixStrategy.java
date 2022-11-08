package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoPixStrategy implements ValorPeloMetodoPagamentoStrategy{

    @Override
    public BigDecimal calcularValor() {
        // TODO APLICAR VALORPEDIDO -10% DESCONTO
        return new BigDecimal(1);
    }
}
