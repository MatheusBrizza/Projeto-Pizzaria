package service;

import enums.SituacaoPedido;
import model.Item;
import model.Pedido;
import repository.PedidoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService() {
        this.pedidoRepository = new PedidoRepository();
    }

    public void realizarPedido(Pedido pedido) {
        pedido.setSituacao(SituacaoPedido.EM_ANALISE);
        pedidoRepository.armazenarPedido(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoRepository.listarPedidos();
    }
    /* jeito incorreto de fazer a a listagem de pedido por situação

    public List<Pedido> listarPedidosEmAnalise() {
       return listarPedidos()
                .stream()
                .filter(p -> p.getSituacao().equals(SituacaoPedido.EM_ANALISE))
                .toList();
    }

    public List<Pedido> listarPedidosFinalizados() {
        return listarPedidos()
                .stream()
                .filter(p -> p.getSituacao().equals(SituacaoPedido.FINALIZADO))
                .toList();
    }
    */
    // jeito certo de listar pedidos por situação
    public List<Pedido> listarPedidosPorSituacao(SituacaoPedido situacao) {
        return listarPedidos()
                .stream()
                .filter(pedido -> pedido.getSituacao().equals(situacao))
                .collect(Collectors.toList());
    }

    public int buscarQuantidadePedidos() {
        return pedidoRepository.buscarTotalPedidos();
    }
}
