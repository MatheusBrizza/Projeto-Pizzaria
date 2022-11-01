import enums.*;
import model.Bebida;
import model.Comida;
import model.Item;
import model.Pedido;
import model.cliente.Cliente;
import model.cliente.Contato;
import model.cliente.Endereco;
import service.PedidoService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        //Setup
        PedidoService pedidoService = new PedidoService();


        Cliente clienteMatheus = new Cliente("Matheus Brizola", "123456789-10",
                new Endereco("abc", "123", "90000-000", "RS",
                        new Contato("3333-3333", "99999-9999", null)));

        Comida comidaMatheus = new Comida(1L, new BigDecimal(25), TipoComida.PIZZA_SALGADA, TamanhoComida.FAMILIA);
        Bebida bebidaMatheus = new Bebida(1, new BigDecimal(12.90), TipoBebida.SUCO_UVA);
        List<Item> itensMatheus = Arrays.asList(comidaMatheus, bebidaMatheus);

        Pedido pedidoMatheus = new Pedido(1L,null,itensMatheus, null, clienteMatheus, MetodoPagamento.PIX);



        System.out.println(pedidoService.listarPedidos());
        System.out.println("Quantidade Pedidos da pizzaria: " + pedidoService.buscarQuantidadePedidos());
        System.out.println("Quantidade Pedidos em análise pizzaria: " + pedidoService.listarPedidosPorSituacao(SituacaoPedido.EM_ANALISE).size());
        pedidoService.realizarPedido(pedidoMatheus);
        System.out.println("Quantidade Pedidos da pizzaria: " + pedidoService.buscarQuantidadePedidos());
    }

}
