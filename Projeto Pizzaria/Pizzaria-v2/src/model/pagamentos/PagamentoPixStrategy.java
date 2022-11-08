package model.pagamentos;

import java.math.BigDecimal;

public class PagamentoPixStrategy implements ValorPeloMetodoPagamentoStrategy{

    @Override
    public BigDecimal calcularValor() {
        return new BigDecimal(1);
    }
}
