package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoCartaoCreditoStrategy implements ValorPeloMetodoPagamentoStrategy{
    @Override
    public BigDecimal calcularValor() {
        return null;
    }
}
