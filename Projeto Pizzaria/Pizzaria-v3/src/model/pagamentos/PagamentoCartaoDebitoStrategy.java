package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoCartaoDebitoStrategy implements ValorPeloMetodoPagamentoStrategy{
    @Override
    public BigDecimal calcularValor() {
        return null;
    }
}
