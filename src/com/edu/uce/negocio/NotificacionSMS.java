package com.edu.uce.negocio;

public class NotificacionSMS {

    public void enviar(String telefono, String mensaje) {
        System.out.println("Se envia SMS al número: " + telefono + 
                           "\nCon el mensaje: " + mensaje);
    }

}
