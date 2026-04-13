package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("cliente: "+ pedido.getCliente());
        System.out.println("Total: "+ pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // NotificadorMail n1 = new NotificadorMail();
        //n1.enviar(pedido.getCorreo(), "Su ha creado un pedido para ser atendido");

        if (pedido.getTotal() > 100) {
            // Enviar MAIL
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), 
                      "Su pedido supera los $100 y será atendido prioritariamente");
        } else {
            // Enviar SMS
            NotificacionSMS n2 = new NotificacionSMS();
            n2.enviar(pedido.getTelefono(), 
                      "Su pedido ha sido registrado correctamente");
        }
    }
}
