package com.example.programandoseufuturo.revisao.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.programandoseufuturo.revisao.model.Pedido;
import com.example.programandoseufuturo.revisao.service.PedidoServices;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
    private PedidoServices service = new PedidoServices();

    @GetMapping
    public List<Pedido> listarPedidos() throws IOException {
        return service.listarPedidos();
    }

    @PostMapping
    public String cadastrarPedido(@RequestBody Pedido pedido) throws IOException {
        return service.cadastrarNovoPedido(pedido);
    }

    @PutMapping
    public String atualiarDescricaoPedido(@RequestBody Pedido pedido) throws IOException {
        return service.atualizarDescricaoPedido(pedido);
    }
}
