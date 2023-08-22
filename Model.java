/**
 * El modelo almacena información sobre la disponibilidad de boletos y sus
 * precios.
 * 
 * @author Jose Sanchez,Juan Muñoz,Dylan Hernandez y Carlos Alburez
 */
class Model {
    private int[] availableTickets = { 20, 20, 20 };
    private int[] ticketPrices = { 400, 695, 2350 };

    /**
     * Obtiene la cantidad de boletos disponibles para cada localidad.
     *
     * @return Un arreglo con la cantidad de boletos disponibles para cada
     *         localidad.
     */
    public int[] getAvailableTickets() {
        return availableTickets;
    }

    /**
     * Obtiene los precios de los boletos para cada localidad.
     *
     * @return Un arreglo con los precios de los boletos para cada localidad.
     */
    public int[] getTicketPrices() {
        return ticketPrices;
    }

    /**
     * Establece la cantidad de boletos disponibles para cada localidad.
     *
     * @param availableTickets Un arreglo con la cantidad de boletos disponibles
     *                         para cada localidad.
     */
    public void setAvailableTickets(int[] availableTickets) {
        this.availableTickets = availableTickets;
    }
}
