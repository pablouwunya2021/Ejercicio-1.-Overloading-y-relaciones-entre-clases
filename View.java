/**
 * La vista maneja la presentación de información al usuario.
 * 
 * @author Jose Sanchez,Juan Muñoz,Dylan Hernandez y Carlos Alburez
 */
class View {
    /**
     * Muestra el formulario de solicitud de compra de boletos.
     */
    public void displayTicketRequestForm() {
        System.out.println("Solicitud de compra de boletos");
    }

    /**
     * Muestra el resultado de la compra de boletos al usuario.
     *
     * @param result El resultado de la compra de boletos.
     */
    public void displayTicketPurchaseResult(String result) {
        System.out.println(result);
    }
}
