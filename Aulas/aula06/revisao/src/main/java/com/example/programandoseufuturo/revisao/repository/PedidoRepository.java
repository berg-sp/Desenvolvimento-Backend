package com.example.programandoseufuturo.revisao.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.example.programandoseufuturo.revisao.model.Pedido;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PedidoRepository {
    private static final int ZERO_BYTES = 0;
    private ObjectMapper objectMapper = new ObjectMapper();
    private File arquivo = new File("src/main/resources/database/tb_pedidos.json");

    public List<Pedido> getAll() throws IOException {
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        if (arquivo.length() > ZERO_BYTES) {
            return objectMapper.readValue(arquivo, new TypeReference<List<Pedido>>(){});
        }
        return new ArrayList<>();
    }
    public boolean save(Pedido novoPedido) throws IOException {
        List<Pedido> pedidos = this.getAll();

        for (int i = 0; i < pedidos.size(); i++) {
            if (novoPedido.getId() == pedidos.get(i).getId()) {
                return false;
            }
        }
        pedidos.add(novoPedido);
        objectMapper.writeValue(arquivo, pedidos);
        return true;
    }

    public boolean update(Pedido pedidoAtualizado) throws IOException {
        List<Pedido> pedidos = this.getAll();

        for (Pedido pedidoNoDatabase : pedidos) {
            if (pedidoAtualizado.getId() == pedidoNoDatabase.getId()) {
                pedidoNoDatabase.setDescricao(pedidoAtualizado.getDescricao());
                objectMapper.writeValue(arquivo, pedidos);
                return true;
            }
        }
        return false;
    }
}
