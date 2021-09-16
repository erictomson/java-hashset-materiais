import java.util.HashSet;

// Ainda dentro deste projeto de doação, precisamos arrecadar materiais de construção
// para construirmos um C.A.C. (Conjunto Habitacional Coletivo), onde teremos várias casas
// construídas com o material arrecadado.
// Para isto ser um sucesso, temos uma lista de doações necessárias a ser feita
public class Main {
    public static void main(String[] args) {
        // Lista HashSet de doações para construção do C.A.C.
        HashSet<String> materiaisDeConstrucao = new HashSet<>();

        // Agora, vamos cadastrar os seguintes itens nesta lista:
        // 01 - Cimento
        // 02 - Argamassa
        // 03 - Caibros
        // 04 - Cal
        // 05 - Pedras
        // 06 - Caminhão de água
        // 07 - Betoneira
        // 08 - Serviço de obras A - Arquiteto
        // 09 - Serviço de obras B - Chefe de obras
        // 10 - Serviço de obras C - Pedreiro
        materiaisDeConstrucao.add("01 - Cimento");
        materiaisDeConstrucao.add("02 - Argamassa");
        materiaisDeConstrucao.add("03 - Caibros");
        materiaisDeConstrucao.add("04 - Cal");
        materiaisDeConstrucao.add("05 - Pedras");
        materiaisDeConstrucao.add("06 - Caminhão de água");
        materiaisDeConstrucao.add("07 - Betoneira");
        materiaisDeConstrucao.add("08 - Serviço de obras A - Arquiteto");
        materiaisDeConstrucao.add("09 - Serviço de obras B - Chefe de obras");
        materiaisDeConstrucao.add("10 - Serviço de obras C - Pedreiro");

        // Lista inicial de doações
        System.out.println("Lista inicial de doações");
        imprimirLista(materiaisDeConstrucao);

        // Infelizmente, alguns itens não puderam ser doados (Serão replanejados):
        // Portanto, por enquanto, precisamos removê-los da lista:
        // 01 - Serviço de obras A - Arquiteto
        // 02 - Argamassa
        // 03 - Caminhão de água
        materiaisDeConstrucao.remove("01 - Serviço de obras A - Arquiteto");
        materiaisDeConstrucao.remove("02 - Argamassa");
        materiaisDeConstrucao.remove("03 - Caminhão de água");

        // E para concretização do planejamento, vamos desenvolver uma parte do sistema
        // que apresenta os itens que puderam ser arrecadados na doação.
        // Dica: Use laços de repetição para esta etapa.
        System.out.println("Lista final de doações");
        imprimirLista(materiaisDeConstrucao);

        // Planejamento de ação de apoio social realizado com sucesso!!!
    }

    private static void imprimirLista(HashSet<String> materiaisDeConstrucao) {
        for(String materialConstrucao: materiaisDeConstrucao) {
            System.out.println(materialConstrucao);
        }
    }
}
