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
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        //-----------
        //Pizzaria V1
        //-----------

        // Setup
        PedidoService pedidoService = new PedidoService();

        // Pedido do Matheus
        Contato contatoMatheus = Contato.builder()
                .telefoneResidencial("3333-3333")
                .telefoneCelular("9999-9999")
                .email(null)
                .build();
        
        Endereco enderecoMatheus = Endereco.builder()
                .logradouro("Rua XPTO")
                .numero("123")
                .cep("90000-000")
                .estado("RS")
                .clienteContato(contatoMatheus)
                .build();

        Cliente clienteMatheus = Cliente.builder()
                .nome("Matheus Brizola")
                .documento("111222333-44")
                .endereco(enderecoMatheus)
                .build();

        Comida pizzaMatheus = new Comida(1, new BigDecimal(25), TipoComida.PIZZA_SALGADA, TamanhoComida.FAMILIA);
        Bebida sucoMatheus = new Bebida(1, new BigDecimal(12.90), TipoBebida.SUCO_UVA);
        Bebida cervejaMatheus = new Bebida(2, new BigDecimal(16.90), TipoBebida.CERVEJA);
        List<Item> itensMatheus = Arrays.asList(pizzaMatheus, sucoMatheus, cervejaMatheus);

        Pedido pedidoMatheus = new Pedido (1, null, itensMatheus, clienteMatheus, MetodoPagamento.PIX);

        System.out.println(pedidoService.listarPedidos());
        System.out.println("Quantidade Pedidos da Pizzaria: " + pedidoService.buscarQuantidadePedidos());
        System.out.println("Quantidade Pedidos em Análise da Pizzaria: " + pedidoService.listarPedidosPorSituacao(SituacaoPedido.EM_ANALISE).size());

        pedidoService.realizarPedido(pedidoMatheus);

        System.out.println("Quantidade Pedidos da Pizzaria: " + pedidoService.buscarQuantidadePedidos());



        //-----------
        //Pizzaria V2
        //-----------
        System.out.println("Valor do pedido do " +
                pedidoMatheus.getCliente().getNome() +
                " é R$" +
                pedidoMatheus.getValorTotal());
    }
}
