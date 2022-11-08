package model.pagamentos;

import java.math.BigDecimal;

public interface ValorPeloMetodoPagamentoStrategy {

    public BigDecimal calcularValor();
}
