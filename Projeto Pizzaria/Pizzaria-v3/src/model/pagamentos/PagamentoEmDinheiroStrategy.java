package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoEmDinheiroStrategy implements ValorPeloMetodoPagamentoStrategy{
    @Override
    public BigDecimal calcularValor() {
        return null;
    }
}
