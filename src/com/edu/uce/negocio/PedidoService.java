package com.edu.uce.negocio;

public class PedidoService {
    public void registrar(Pedido pedido) {
        System.out.println("Registrando pedido...");
        System.out.println("cliente: "+ pedido.getCliente());
        System.out.println("Total: "+ pedido.getTotal());
        System.out.println("Guardando en la base de datos");

        // NotificadorMail n1 = new NotificadorMail();
        //n1.enviar(pedido.getCorreo(), "Su ha creado un pedido para ser atendido");

        

        if (pedido.getTotal() > 120) {
            NotificadorMail n1 = new NotificadorMail();
            n1.enviar(pedido.getCorreo(), 
                      "Su pedido supera los $120 y será atendido prioritariamente");
        }else if (pedido.getTotal() < 50) {
            NotificacionWhatsapp n3 = new NotificacionWhatsapp();
            n3.enviar(pedido.getTelefono(), 
                     "Su pedido supera los $50 y será atendido en breve");
        } else if (pedido.getTotal() >= 50 && pedido.getTotal() <= 120) {
            NotificacionSMS n2 = new NotificacionSMS();
            n2.enviar(pedido.getTelefono(), 
                     "Su pedido ha sido registrado correctamente");
        }
    }
}
