package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoEmDinheiroStrategy implements ValorPeloMetodoPagamentoStrategy{
    @Override
    public BigDecimal calcularValor() {
        // TODO VALORPEDIDO -15% DESCONTO
        return null;
    }
}
