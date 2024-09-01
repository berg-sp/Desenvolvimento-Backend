package com.example.programandoseufuturo.revisao.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.programandoseufuturo.revisao.model.Pedido;
import com.example.programandoseufuturo.revisao.repository.PedidoRepository;

public class PedidoService {

    @Autowired
    private PedidoRepository repository = new PedidoRepository();

    public List<Pedido> listarPedidos() throws IOException {
        return repository.getAll();
    }

    public String cadastrarNovoPedido(Pedido pedido) throws IOException {
        if (repository.save(pedido)) {
            return "O pedido " + pedido.getDescricao() + " foi cadastrado com sucesso!";
        }
        return "Os pedidos devem ter ID único";
    }
    public String atualizarDescricoPedido(Pedido pedido) throws IOException {
        if (repository.update(pedido)) {
            return "O pedido de id " + pedido.getId() + " teve sua descrico alterada para: " + pedido.getDescricao();
        }
        return "O pedido de id " + pedido.getId() + " não foi encontrado na base de dados";
    }
}
