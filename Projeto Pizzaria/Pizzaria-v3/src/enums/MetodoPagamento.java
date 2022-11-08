package enums;

import model.pagamentos.*;

public enum MetodoPagamento {

    EM_DINHEIRO(new PagamentoEmDinheiroStrategy()),
    DEBITO(new PagamentoCartaoDebitoStrategy()),
    CREDITO(new PagamentoCartaoCreditoStrategy()),
    PIX(new PagamentoPixStrategy());

    private final ValorPeloMetodoPagamentoStrategy strategy;

    private MetodoPagamento(ValorPeloMetodoPagamentoStrategy strategy) {
        this.strategy = strategy;
    }

    public ValorPeloMetodoPagamentoStrategy getStrategy() {
        return strategy;
    }
}
