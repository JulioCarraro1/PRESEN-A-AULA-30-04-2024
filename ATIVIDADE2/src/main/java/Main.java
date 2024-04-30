import java.util.ArrayList;
import java.util.List;

// Classe Livro para representar os livros da livraria
class Livro {
    private String titulo;
    private String editora;
    private List<String> autores;
    private int anoLancamento;
    private String genero;
    private int numPaginas;
    private int quantidadeEstoque;
    private double precoVenda;

    public Livro() {
        this.autores = new ArrayList<>();
    }

    public Livro(String titulo, String editora, List<String> autores, int anoLancamento, String genero, int numPaginas, int quantidadeEstoque, double precoVenda) {
        this.titulo = titulo;
        this.editora = editora;
        this.autores = autores;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
        this.numPaginas = numPaginas;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoVenda = precoVenda;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    // Método toString para representação textual do livro
    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", editora='" + editora + '\'' +
                ", autores=" + autores +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                ", numPaginas=" + numPaginas +
                ", quantidadeEstoque=" + quantidadeEstoque +
                ", precoVenda=" + precoVenda +
                '}';
    }
}

// Classe Cliente para representar os clientes da livraria
class Cliente {
    private String nome;
    private String rua;
    private int numero;
    private String bairro;
    private String estado;
    private String pais;

    public Cliente() {
    }

    public Cliente(String nome, String rua, int numero, String bairro, String estado, String pais) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.estado = estado;
        this.pais = pais;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    // Método toString para representação textual do cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", bairro='" + bairro + '\'' +
                ", estado='" + estado + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

// Classe Venda para representar as vendas da livraria
class Venda {
    private List<Livro> itens;
    private Cliente cliente;
    private double valorTotal;
    private List<Double> valoresPagos;

    public Venda() {
        this.itens = new ArrayList<>();
        this.valoresPagos = new ArrayList<>();
    }

    public Venda(List<Livro> itens, Cliente cliente, double valorTotal, List<Double> valoresPagos) {
        this.itens = itens;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
        this.valoresPagos = valoresPagos;
    }

    // Getters e Setters
    public List<Livro> getItens() {
        return itens;
    }

    public void setItens(List<Livro> itens) {
        this.itens = itens;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Double> getValoresPagos() {
        return valoresPagos;
    }

    public void setValoresPagos(List<Double> valoresPagos) {
        this.valoresPagos = valoresPagos;
    }

    // Método toString para representação textual da venda
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Venda{" +
                "cliente=" + cliente +
                ", valorTotal=" + valorTotal +
                ", itens=\n");
        for (Livro livro : itens) {
            sb.append(livro.toString()).append("\n");
        }
        sb.append(", valoresPagos=" + valoresPagos +
                '}');
        return sb.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro livro1 = new Livro("A Culpa é das Estrelas", "Intrínseca", List.of("John Green"), 2012, "Romance", 313, 10, 29.90);
        Livro livro2 = new Livro("Harry Potter e a Pedra Filosofal", "Rocco", List.of("J.K. Rowling"), 1997, "Fantasia", 223, 15, 34.90);
        Livro livro3 = new Livro("O Senhor dos Anéis: A Sociedade do Anel", "Martins Fontes", List.of("J.R.R. Tolkien"), 1954, "Fantasia", 576, 5, 49.90);

        // Criando cliente
        Cliente cliente = new Cliente("João da Silva", "Rua das Flores", 123, "Centro", "SP", "Brasil");

        // Criando venda
        List<Livro> itens = List.of(livro1, livro2, livro3);
        List<Double> valoresPagos = List.of(80.0, 20.0); // Simulando dois pagamentos de valores diferentes
        Venda venda = new Venda(itens, cliente, 100.0, valoresPagos);

        // Imprimindo os dados da venda
        System.out.println(venda.toString());
    }
}
