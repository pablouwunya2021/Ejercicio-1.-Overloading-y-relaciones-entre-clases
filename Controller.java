import java.util.Random;

/**
 * El controlador maneja la lógica de negocio y actúa como intermediario entre
 * el modelo y la vista.
 * 
 * @author Jose Sanchez,Juan Muñoz,Dylan Hernandez y Carlos Alburez
 */
class Controller {
    private Model model;
    private View view;
    private Random rand = new Random();

    /**
     * Crea un nuevo controlador con el modelo y la vista proporcionados.
     *
     * @param model El modelo que contiene información sobre los boletos disponibles
     *              y sus precios.
     * @param view  La vista que maneja la presentación de información al usuario.
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Procesa la solicitud de compra de boletos, verifica la disponibilidad y
     * presenta el resultado al usuario.
     *
     * @param name      El nombre del comprador.
     * @param dpi       El DPI del comprador.
     * @param quantity  La cantidad de boletos que desea comprar.
     * @param maxBudget El presupuesto máximo del comprador.
     */
    public void requestTicket(String name, String dpi, int quantity, int maxBudget) {
        view.displayTicketRequestForm();
        int ticket = rand.nextInt(33000) + 1;
        int a = rand.nextInt(15000) + 1;
        int b = rand.nextInt(15000) + 1;

        if ((ticket + a + b) % 2 == 0) {
            int location = rand.nextInt(3);
            int[] availableTickets = model.getAvailableTickets();
            int[] ticketPrices = model.getTicketPrices();

            if (availableTickets[location] > 0 && ticketPrices[location] <= maxBudget) {
                int ticketsToBuy = Math.min(quantity, availableTickets[location]);
                availableTickets[location] -= ticketsToBuy;
                model.setAvailableTickets(availableTickets);
                view.displayTicketPurchaseResult(
                        name + " ha comprado " + ticketsToBuy + " boletos para la localidad " + (location + 1));
            } else {
                view.displayTicketPurchaseResult(name + " no pudo comprar boletos");
            }
        } else {
            view.displayTicketPurchaseResult(name + " no pudo comprar boletos");
        }
    }
}
